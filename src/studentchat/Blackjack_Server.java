package studentchat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import blackjack.message.MessageFactory;

public class Blackjack_Server implements Runnable {
	
	private static int serverPort = 8989;
	@SuppressWarnings("unused")
	private Socket socket;
	private static String myName = "Ty";

	@Override
	public void run() {
			InetAddress addr = null;
			try {
				addr = InetAddress.getByName("52.35.72.251");
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			}
			Socket socket = null;
			try {
				socket = new Socket(addr, serverPort);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				System.out.println("Connected to " + addr);
				System.out.println(MessageFactory.getAckMessage());
				ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
				os.writeObject(MessageFactory.getLoginMessage(myName));
				os.flush();
				ObjectInputStream reader = new ObjectInputStream(socket.getInputStream());
				System.out.println(reader);
				os.close();
				reader.close();
				socket.close();
			} catch (IOException e) {
				System.out.println(MessageFactory.getDenyMessage());
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		Blackjack_Server client = new Blackjack_Server();
		client.run();
		
	}

}
