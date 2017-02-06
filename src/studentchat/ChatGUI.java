package studentchat;

import java.awt.Component;
import java.awt.Container;

import javax.swing.*;

public class ChatGUI {
	
	private static void chatGUI() {
		
		JFrame mainChatWindow = new JFrame();
		mainChatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainChatWindow.setTitle("Student Chat");
		
		mainContainer
		
		mainChatWindow.pack();
		mainChatWindow.setVisible(true);
	}
	
	private static void mainContentPane(Container mainContainer) {
		mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.Y_AXIS));
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
		JTextArea chatArea = new JTextArea(3, 0);
		chatArea.setAlignmentX(Component.CENTER_ALIGNMENT);
		textContainer.add(chatArea);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			chatGUI();
		}
		});
	}
}
