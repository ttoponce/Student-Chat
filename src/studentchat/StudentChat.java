package studentchat;

public class StudentChat {

	public static void main(String[] args) {
		
		Student S1 = new Student("Brieanna", "Miller", 100, Student.getResponses());
		Student S2 = new Student("Cody", "May", 100, Student.getResponses());
		Student S3 = new Student("Ethan", "Brown", 100, Student.getResponses());
		Student S4 = new Student("Kendra", "Koester", 100, Student.getResponses());
		Student S5 = new Student("Lauren", "Ribeiro", 100, Student.getResponses());
		Student S6 = new Student("Michael", "Cullimore", 100, Student.getResponses());
		Student S7 = new Student("Nathan", "Borup", 100, Student.getResponses());
		Student S8 = new Student("Rizwan", "Mohammed", 100, Student.getResponses());
		Student S9 = new Student("Tyler", "Toponce", 100, Student.getResponses());
		
		Group studentGroup1 = new Group();
		studentGroup1.addToStudentGroup(S1, S2);
		Group studentGroup2 = new Group();
		studentGroup2.addToStudentGroup(S3, S4);
		Group studentGroup3 = new Group();
		studentGroup3.addToStudentGroup(S5, S6);
		Group studentGroup4 = new Group();
		studentGroup4.addToStudentGroup(S7, S8);
		Group studentGroup5 = new Group();
		studentGroup5.addToStudentGroup(S9, S3);
		
		System.out.println(studentGroup1.getStudentGroup().first().getFirstName() + ": " + Student.chat[0]);
		System.out.println(studentGroup1.getStudentGroup().last().getFirstName() + ": " + Student.chat[1]);
		System.out.println(studentGroup2.getStudentGroup().first().getFirstName() + ": " + Student.chat[0]);
		System.out.println(studentGroup2.getStudentGroup().last().getFirstName() + ": " + Student.chat[2]);
		System.out.println(studentGroup3.getStudentGroup().first().getFirstName() + ": " + Student.chat[2]);
		System.out.println(studentGroup3.getStudentGroup().last().getFirstName() + ": " + Student.chat[0]);
		System.out.println(studentGroup4.getStudentGroup().first().getFirstName() + ": " + Student.chat[4]);
		System.out.println(studentGroup4.getStudentGroup().last().getFirstName() + ": " + Student.chat[3]);
		System.out.println(studentGroup5.getStudentGroup().first().getFirstName() + ": " + Student.chat[3]);
		System.out.println(studentGroup5.getStudentGroup().last().getFirstName() + ": " + Student.chat[4]);

	}

}