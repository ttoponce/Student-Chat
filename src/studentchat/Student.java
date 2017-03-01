package studentchat;

public class Student implements Comparable<Student> {
	
	private String fName;
	private String lName;
	private int score;
	static String[] chat = new String[5];
	
	public Student (String firstName, String lastName, int studentScore, String[] chatResponses) {
		
		this.fName = firstName;
		this.lName = lastName;
		this.score = studentScore;
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
	
	public void setFirstName(String fName) {
		this.fName = fName;
	}
	
	public String getFirstName() {
		return fName;
	}
	
	public void setLastName(String lName) {
		this.lName = lName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		return this.getFirstName().compareTo(o.getFirstName());
	}
}
