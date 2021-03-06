package studentchat;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String TEXT_SUBMIT = "text-submit";
	private JButton button;
	
	public Client() {
		try {
			initialize();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialize() throws UnknownHostException, IOException {
		JPanel panel = new JPanel();
		panel.add(new JLabel("Click this button"));

		Socket s = new Socket("localhost", 8090);
		new Thread(new Reader(s.getInputStream())).start();
		
		button = new JButton("Some text");
		button.addActionListener((e) -> {
			try {
				s.getOutputStream().write(1);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
		panel.add(button);

		add(panel);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					s.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame mainChatWindow = new JFrame("Student Chat");
		mainChatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		BoxLayout windowLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(windowLayout);
		mainPanel.setBorder(new EmptyBorder(new Insets(2, 2, 2, 2)));
		
		JTextArea chatArea = new JTextArea(10, 35);
		chatArea.setAlignmentX(Component.CENTER_ALIGNMENT);
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setFont(new Font("Sans-Serif", Font.PLAIN, 12));
		//chatArea.setText(t);
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
			private static final long serialVersionUID = 1L;

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
	
	private class Reader implements Runnable {
		private InputStream input;
		
		public Reader(InputStream is) {
			input = is;
		}
		
		public void run() {
			int read;
			try {
				while ((read = input.read()) >= 0) {
					button.setText(read + "");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Client();
	}

}
