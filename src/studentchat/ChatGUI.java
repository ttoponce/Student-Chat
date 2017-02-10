package studentchat;

import java.awt.Component;
import java.awt.Container;

import javax.swing.*;

public class ChatGUI {
	
	private static void chatGUI() {
		
		JFrame mainChatWindow = new JFrame();
		mainChatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainChatWindow.setTitle("Student Chat");
		
		mainContentPane(mainChatWindow.getContentPane());
		
		mainChatWindow.pack();
		mainChatWindow.setSize(350, 700);
		mainChatWindow.setVisible(true);
	}
	
	private static void mainContentPane(Container mainContainer) {
		mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.Y_AXIS));
		
		addTextArea(mainContainer);
		addTextField(mainContainer);
		addButtons("Send", mainContainer);
	}
	
	private static void addButtons(String title, Container buttonContainer) {
		JButton submitButton = new JButton(title);
		submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonContainer.add(submitButton);
	}
	
	private static void addTextField(Container textContainer) {
		JTextField chatBox = new JTextField(0);
		chatBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		textContainer.add(chatBox);
	}
	
	private static void addTextArea(Container textContainer) {
		JTextArea chatArea = new JTextArea(200, 0);
		chatArea.setAlignmentX(Component.CENTER_ALIGNMENT);
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		textContainer.add(chatArea);
		JScrollPane scrollPane = new JScrollPane(chatArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		InputMap keyInput = scrollPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		keyInput.put(KeyStroke.getKeyStroke("UP"), "negativeUnitIncrement");
		keyInput.put(KeyStroke.getKeyStroke("DOWN"), "positiveUnitIncrement");
		textContainer.add(scrollPane);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				chatGUI();
			}
		});
	}
}
