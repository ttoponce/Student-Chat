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
	
	private static String fName;
	private static String lName;
	private static int score;
	static ArrayList<String> chat = new ArrayList<>();
	
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
		chat.add("Hi.");
		chat.add("Hello.");
		chat.add("I love my family.");
		chat.add("I like Disneyland.");
		chat.add("Disneyland is fun, but even more fun with your family!");
	}
	
	public static String getFirstName() {
		return fName;
	}
	
	public static String getLastName() {
		return lName;
	}
	
	public static int getScore() {
		return score;
	}
	
	public static ArrayList<String> getResponses() {
		return chat;
	}
	
	public static void main(String[] args) {
		
	}
}
