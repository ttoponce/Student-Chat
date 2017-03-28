package studentchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatClient {
	
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public ChatClient(String server, int port) {
		Blackjack_Server client = new Blackjack_Server();
		client.run();
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
