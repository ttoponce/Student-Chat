package studentchat;

import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;

public class Server implements Runnable {
	
	private int serverPort = 8090;
	private ServerSocket ss;
	private Socket s;

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

}
