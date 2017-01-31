/**
 * 
 */
package studentchat;

import java.util.ArrayList;

/**
 * @author Tyler Toponce
 * Student Chat main class.
 */
public class StudentChat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> chat = getResponses();
		
		String chat1 = chat.get(0);
		String chat2 = chat.get(1);
		String chat3 = chat.get(2);
		String chat4 = chat.get(3);
		String chat5 = chat.get(4);
		
		System.out.println(Group.Group1().get(0).getFirstName() + " " + Group.Group1().get(0).getLastName() + ": " + chat1);
		System.out.println(Group.Group1().get(1).getFirstName() + " " + Group.Group1().get(1).getLastName() + ": " + chat1);
	}

}
