package studentchat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import blackjack.message.MessageFactory;

public class BlackJack_ServerHandler implements Runnable {
	
	private Socket socket;
	private InputStream input;
	private OutputStream output;
	private Random random = new Random();

	public BlackJack_ServerHandler(Socket s) throws IOException {
		this.socket = s;
	}
	
	@Override
	public void run() {
		try {
			input = socket.getInputStream();
			output = socket.getOutputStream();
			while ((input.read() >= 0)) {
				try {
					output.write(random.nextInt());
					output.flush();
					System.out.println(MessageFactory.getAckMessage());
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println(MessageFactory.getDenyMessage());
				} finally {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						output.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch(IOException e) {
			Logger log = Logger.getAnonymousLogger();
			log.log(Level.SEVERE, "An IOException was thrown", e);
		}
	}

}
