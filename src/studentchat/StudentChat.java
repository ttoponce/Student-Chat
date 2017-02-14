package studentchat;

public class StudentChat {

	public static void main(String[] args) {
		Student student1 = Group.Group1().get(0);
		Student student2 = Group.Group1().get(1);
		Student student3 = Group.Group2().get(0);
		Student student4 = Group.Group2().get(1);
		Student student5 = Group.Group3().get(0);
		System.out.println(student1.getFirstName() + " " + student1.getLastName() + ": " + Student.chat[0]);
		System.out.println(student2.getFirstName() + " " + student2.getLastName() + ": " + Student.chat[1]);
		System.out.println(student3.getFirstName() + " " + student3.getLastName() + ": " + Student.chat[2]);
		System.out.println(student4.getFirstName() + " " + student4.getLastName() + ": " + Student.chat[3]);
		System.out.println(student3.getFirstName() + " " + student5.getLastName() + ": " + Student.chat[4]);

	}

}