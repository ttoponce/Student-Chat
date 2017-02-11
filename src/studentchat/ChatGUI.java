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
		BoxLayout windowLayout = new BoxLayout(mainPanel, BoxLayout.X_AXIS);
		mainPanel.setLayout(windowLayout);
		
		mainChatWindow.add(mainPanel);
		mainChatWindow.pack();
		mainChatWindow.setVisible(true);
	}
}
