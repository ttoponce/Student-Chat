package studentchat;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class ChatGUI {
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame mainChatWindow = new JFrame("Student Chat");
		mainChatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		BoxLayout windowLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(windowLayout);
		
		JTextArea chatArea = new JTextArea(200, 35);
		chatArea.setAlignmentX(Component.CENTER_ALIGNMENT);
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		JTextField chatBox = new JTextField();
		chatBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton chatButton = new JButton("Send");
		chatButton.setAlignmentX(Component.CENTER_ALIGNMENT);

		mainPanel.add(chatArea);
		mainPanel.add(chatBox);
		mainPanel.add(chatButton);
		
		mainChatWindow.add(mainPanel);
		mainChatWindow.pack();
		mainChatWindow.setVisible(true);
	}
}
