package studentchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ChatClient {
	
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private ObjectOutputStream os;
	private ObjectInputStream is;
	private ChatGUI gui;
	private String userName, server;
	private int port;
	private Socket socket;
	
	public ChatClient(String server, int port, String userName, ChatGUI gui) {
		this.server = server;
		this.port = port;
		this.userName = userName;
		this.gui = gui;
		
		Blackjack_Server client = new Blackjack_Server();
		client.run();
		
		try {
			os = new ObjectOutputStream(socket.getOutputStream());
			is = new ObjectInputStream(socket.getInputStream());
		} catch(IOException e) {
			System.out.println("Exception creating object data streams: " + e);
		}
		new Thread().start();
		
		String line = "";
		try {
			line = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		

	}

}
