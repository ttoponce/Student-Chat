/**
 * 
 */
package studentchat;

/**
 * @author Tyler Toponce
 * Student Chat main class.
 */
public class StudentChat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student1 = Group.Group1().get(0);
		Student student2 = Group.Group1().get(0);
		System.out.println(student1.getFirstName() + " " + student1.getLastName() + ": " + Group.getResponses()[0]);
		System.out.println(Group.Group1().get(1).getFirstName() + " " + Group.Group1().get(1).getLastName() + ": " + Group.getResponses()[1]);
	}

}
