package studentchat;

import java.net.Socket;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class Server implements Runnable {
	
	private int serverPort = 8090;
	private ServerSocket ss;
	private Socket s;
	private String server_IP;

	public Socket getSocket() {
		return s;
	}

	public void setSocket(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		
		while(ss.isBound() && (ss.isClosed() == false)) {
			try {
				InetAddress iAddress = InetAddress.getLocalHost();
				setServer_IP(iAddress.getHostAddress());
			} catch (java.net.UnknownHostException e) {
				e.printStackTrace();
			}
			try {
				ss = new ServerSocket(serverPort);
				setSocket(ss.accept());
				ServerHandler sh = new ServerHandler(s);
				new Thread(sh).start();
			} catch(IOException e) {
				e.toString();
			} finally {
				try {
					ss.close();
				}
				catch(IOException e) {
					e.toString();
				}
			}
		}
		
		
	}
	
	@Override
	public String toString() {
		return ("Cannot establish server connection. There was a problem with the listening port " + serverPort + ".");
	}

	public static void main(String[] args) {
		new Server();
	}

	public String getServer_IP() {
		return server_IP;
	}

	public void setServer_IP(String server_IP) {
		this.server_IP = server_IP;
	}

}
