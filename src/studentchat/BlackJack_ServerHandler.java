package studentchat;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

import blackjack.message.MessageFactory;

public class BlackJack_ServerHandler implements Runnable {
	
	private Socket socket;
	private InputStreamReader input;
	private OutputStream output;
	private PrintWriter writer;
	private Random random = new Random();

	public BlackJack_ServerHandler(Socket s) throws IOException {
		this.socket = s;
	}
	
	@Override
	public void run() {
		try {
			output = socket.getOutputStream();
			writer = new PrintWriter(output, true);
			input = new InputStreamReader(socket.getInputStream());
			writer.println(MessageFactory.getAckMessage());
			while ((input.read() >= 0)) {
				try {
					output.write(random.nextInt());
					output.flush();
				} catch (IOException e) {
					e.printStackTrace();
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
			writer = new PrintWriter(output, true);
			writer.println(MessageFactory.getDenyMessage());
		}
	}

}
