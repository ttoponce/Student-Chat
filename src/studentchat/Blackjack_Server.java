package studentchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import blackjack.message.MessageFactory;

public class Blackjack_Server implements Runnable {
	
	private int serverPort = 8989;
	private ServerSocket serverSocket;
	private Socket socket;
	private String serverIP;
	
	private void setSocket(Socket s) {
		this.socket = s;
	}
	
	private Socket getSocket() {
		return this.socket;
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
				OutputStream os = echoSocket.getOutputStream();
				os.flush();
				PrintWriter outputWriter = new PrintWriter(os, true);
				outputWriter.println(MessageFactory.getAckMessage());
				InputStreamReader isr = new InputStreamReader(socket.getInputStream());
				BufferedReader reader = new BufferedReader(isr);
				String string = reader.readLine();
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
