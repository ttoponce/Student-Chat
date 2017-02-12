package studentchat;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class ChatGUI {
	
	private static final String TEXT_SUBMIT = "text-submit";
	
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame mainChatWindow = new JFrame("Student Chat");
		mainChatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		BoxLayout windowLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(windowLayout);
		mainPanel.setBorder(new EmptyBorder(new Insets(2, 2, 2, 2)));
		
		JTextArea chatArea = new JTextArea(200, 35);
		chatArea.setAlignmentX(Component.CENTER_ALIGNMENT);
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setFont(new Font("Sans-Serif", Font.PLAIN, 12));
		JScrollPane scrollPane = new JScrollPane(chatArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		JTextArea chatBox = new JTextArea(4, 35);
		chatBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		Border chatBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1);
		chatBox.setBorder(chatBorder);
		InputMap input = chatBox.getInputMap();
		KeyStroke controlEnter = KeyStroke.getKeyStroke("control ENTER");
		input.put(controlEnter, TEXT_SUBMIT);
		ActionMap actions = chatBox.getActionMap();
		actions.put(TEXT_SUBMIT, new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				chatArea.append(chatBox.getText() + "\n");
				chatBox.setText("");
			}
		});
		
		JButton chatButton = new JButton("Send");
		chatButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		chatButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				chatArea.append(chatBox.getText() + "\n");
				chatBox.setText("");
			}
		});

		mainPanel.add(scrollPane);
		mainPanel.add(chatBox);
		mainPanel.add(chatButton);
		
		mainChatWindow.add(mainPanel);
		mainChatWindow.pack();
		mainChatWindow.setVisible(true);
	}
}
