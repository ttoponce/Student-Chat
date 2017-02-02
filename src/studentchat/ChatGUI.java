package studentchat;

import javax.swing.*;

public class ChatGUI {
	
	public ChatGUI() {
		
		JFrame mainChatWindow = new JFrame();
		mainChatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainChatWindow.setTitle("Student Chat");
		mainChatWindow.setSize(250, 500);
		mainChatWindow.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChatGUI();
	}
}
