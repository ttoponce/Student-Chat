/**
 * 
 */
package studentchat;

/**
 * @author Tyler Toponce
 * Student Chat main class.
 */
public class StudentChat {
	
	static String[] chatResponses = new String[5];
	
	public static String[] getResponses() {
		chatResponses[0] = "Hi";
		chatResponses[1] = "Hello";
		chatResponses[2] = "I love my family.";
		chatResponses[3] = "I like Disneyland.";
		chatResponses[4] = "Disneyland is fun, but even more fun with your family!";
		return chatResponses;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student1 = Group.Group1().get(0);
		Student student2 = Group.Group1().get(1);
		Student student3 = Group.Group2().get(0);
		Student student4 = Group.Group2().get(1);
		Student student5 = Group.Group3().get(0);
		Student student6 = Group.Group3().get(1);
		System.out.println(student1.getFirstName() + " " + student1.getLastName() + ": " + chatResponses[0]);
		System.out.println(student2.getFirstName() + " " + student2.getLastName() + ": " + chatResponses[1]);
		System.out.println(student3.getFirstName() + " " + student3.getLastName() + ": " + chatResponses[2]);
		System.out.println(student4.getFirstName() + " " + student4.getLastName() + ": " + chatResponses[3]);
		System.out.println(student3.getFirstName() + " " + student5.getLastName() + ": " + chatResponses[4]);
		System.out.println(student4.getFirstName() + " " + student6.getLastName() + ": " + chatResponses[4]);
	}

}
