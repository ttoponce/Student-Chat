package studentchat;

public class StudentChat {

	public static void main(String[] args) {
		
		Student student1 = Group.getStudentGroup1().first();
		Student student2 = Group.getStudentGroup1().last();
		Student student3 = Group.getStudentGroup2().first();
		Student student4 = Group.getStudentGroup2().last();
		Student student5 = Group.getStudentGroup3().first();
		Student student6 = Group.getStudentGroup3().last();
		System.out.println(student1.getFirstName() + " " + student1.getLastName() + ": " + Student.chat[0]);
		System.out.println(student2.getFirstName() + " " + student2.getLastName() + ": " + Student.chat[1] + "\n");
		System.out.println(student3.getFirstName() + " " + student3.getLastName() + ": " + Student.chat[2]);
		System.out.println(student4.getFirstName() + " " + student4.getLastName() + ": " + Student.chat[3] + "\n");
		System.out.println(student5.getFirstName() + " " + student5.getLastName() + ": " + Student.chat[4]);
		System.out.println(student6.getFirstName() + " " + student6.getLastName() + ": " + Student.chat[5] + "\n");

	}

}