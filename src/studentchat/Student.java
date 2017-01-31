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
	String[] chat;
	
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
	
	public String getFirstName() {
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public int getScore() {
		return score;
	}
	
	public String[] getResponses() {
		chat.add("Hi.");
		chat.add("Hello.");
		chat.add("I love my family.");
		chat.add("I like Disneyland.");
		chat.add("Disneyland is fun, but even more fun with your family!");
		return chat;
	}
	
	public static void main(String[] args) {
		
	}
}
