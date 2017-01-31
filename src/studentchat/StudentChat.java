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
		String chat2 = chat.get(1);
		String chat3 = chat.get(2);
		String chat4 = chat.get(3);
		String chat5 = chat.get(4);
		
		Student student1 = groupList.get(0);
		Student student2 = groupList.get(1);
		
		System.out.println(student1.getFirstName() + " " + student1.getLastName() + ":" + chat1);
		System.out.println(student2.getFirstName() + " " + student2.getLastName() + ":" + chat2);
	}

}
