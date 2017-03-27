package studentchat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import blackjack.message.MessageFactory;

public class Blackjack_Server implements Runnable {
	
	private int serverPort = 8989;
	private ServerSocket serverSocket;
	@SuppressWarnings("unused")
	private Socket socket;
	private String serverIP;
	
	private void setSocket(Socket s) {
		this.socket = s;
	}
	
	public void setServerIP(String server_IP) {
		this.serverIP = server_IP;
	}
	
	public String getServerIP() {
		return this.serverIP;
	}

	@Override
	public void run() {
		while(serverSocket.isBound() && (serverSocket.isClosed() == false)) {
			try {
				InetAddress address = InetAddress.getByName("137.190.250.174");
				setServerIP(address.getHostName());
			} catch (java.net.UnknownHostException e) {
				System.out.println("Unable to establish server connection with IP: " + serverIP + ".");
			}
			try {
				serverSocket = new ServerSocket(serverPort);
				setSocket(serverSocket.accept());
				Socket echoSocket = new Socket(serverIP, serverPort);
				setSocket(echoSocket);
				BlackJack_ServerHandler sh = new BlackJack_ServerHandler(echoSocket);
				new Thread(sh).start();
			} catch (IOException e) {
				System.out.println("Unable to listen on port: " + serverPort + ".");
			}
		}
		
	}

	public static void main(String[] args) {
		//new Blackjack_Server();
		try {
			InetAddress addr = InetAddress.getByName("137.190.250.174");
			Socket socket = new Socket(addr, 8989);
			System.out.println("Connected to " + addr);
			System.out.println(MessageFactory.getAckMessage());
			FileOutputStream file = new FileOutputStream("test.txt");
			ObjectOutputStream os = new ObjectOutputStream(file);
			os.writeObject(MessageFactory.getLoginMessage("Ty"));
			os.flush();
			os.close();
			ObjectInputStream reader = new ObjectInputStream(new FileInputStream("test.txt"));
			System.out.println(reader);
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
