/**
 * 
 */
package studentchat;

import java.util.ArrayList;

/**
 * @author Tyler Toponce
 * Initializes Student object.
 */
public class Student {
	
	private String fName;
	private String lName;
	private int score;
	ArrayList<String> chat = new ArrayList<>();
	
	/**
	 * Student object.
	 * @param firstName Student first name.
	 * @param lastName Student last name.
	 * @param studentScore Student score.
	 */
	public Student (String firstName, String lastName, int studentScore, ArrayList<String> chatResponses) {
		
		fName = firstName;
		lName = lastName;
		score = studentScore;
		chat = chatResponses;

	}
	
	public static void main(String[] args) {
		
	}
}
