package studentchat;

import java.io.IOException;
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
				System.out.println(e.toString());
			}
			try {
				serverSocket = new ServerSocket(serverPort);
				setSocket(serverSocket.accept());
				Socket echoSocket = new Socket(serverIP, serverPort);
				setSocket(echoSocket);
				BlackJack_ServerHandler sh = new BlackJack_ServerHandler(echoSocket);
				new Thread(sh).start();
			} catch (IOException e) {
				System.out.println(MessageFactory.getDenyMessage());
				System.out.println(e.toString());
			}
		}
		
	}
	
	@Override
	public String toString() {
		return "Unable to establish server connection with IP: " + this.serverIP + " and with port: " + this.serverPort + ".";
	}

	public static void main(String[] args) {
		new Blackjack_Server();
	}

}
