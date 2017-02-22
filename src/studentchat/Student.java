package studentchat;

public class Student {
	
	private String fName;
	private String lName;
	private int score;
	static String[] chat = new String[5];
	
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
