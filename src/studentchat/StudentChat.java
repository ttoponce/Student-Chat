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
		ArrayList<Student> groupList = new ArrayList<>(Group.Group1());
		ArrayList<String> chat = Student.getResponses();
		String chat1 = chat.get(0);
	}

}
