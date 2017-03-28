package studentchat;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

public class BlackJack_GUI {
	
	private String userName;
	private int cardTotal = 0;
	
	public BlackJack_GUI(String userName) {
		
		this.userName = userName;
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame mainGameFrame = new JFrame("BlackJack");
		mainGameFrame.setSize(300, 100);
		mainGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BorderLayout mainLayout = new BorderLayout();
		Container mainContent = mainGameFrame.getContentPane();
		mainContent.setLayout(mainLayout);
		
		JButton button;
		mainContent.add(button = new JButton("HIT"), BorderLayout.SOUTH);
		mainContent.add(button = new JButton("STAY"), BorderLayout.SOUTH);
		
		JTextField text;
		//text.setEditable(false);
		mainContent.add(text = new JTextField(userName + " Total: " + cardTotal), BorderLayout.WEST);
		
	}

	public static void main(String[] args) {
		//new BlackJack_GUI();

	}

}
