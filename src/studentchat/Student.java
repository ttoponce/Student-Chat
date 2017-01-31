/**
 * 
 */
package studentchat;

/**
 * @author Tyler Toponce
 * Initializes Student object.
 */
public class Student {
	
	private static String fName;
	private static String lName;
	private static int score;
	static String[] chat = new String[5];
	
	/**
	 * Student object.
	 * @param firstName Student first name.
	 * @param lastName Student last name.
	 * @param studentScore Student score.
	 */
	public Student (String firstName, String lastName, int studentScore, String[] chatResponses) {
		
		fName = firstName;
		lName = lastName;
		score = studentScore;
		chat = chatResponses;
	}
	
	public static String[] getResponses() {
		chat[0] = "Hi";
		chat[1] = "Hello";
		chat[2] = "I love my family.";
		chat[3] = "I like Disneyland.";
		chat[4] = "Disneyland is fun, but even more fun with your family!";
		return chat;
	}
	
	public String getFirstName() {
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public int getScore() {
		return score;
	}
}
