package studentchat;

import java.util.TreeSet;

public class Group {
	
	private Student S1 = new Student("Brieanna", "Miller", 100, Student.getResponses());
	private Student S2 = new Student("Cody", "May", 100, Student.getResponses());
	private Student S3 = new Student("Ethan", "Brown", 100, Student.getResponses());
	private Student S4 = new Student("Kendra", "Koester", 100, Student.getResponses());
	private Student S5 = new Student("Lauren", "Ribeiro", 100, Student.getResponses());
	private Student S6 = new Student("Michael", "Cullimore", 100, Student.getResponses());
	private Student S7 = new Student("Nathan", "Borup", 100, Student.getResponses());
	private Student S8 = new Student("Rizwan", "Mohammed", 100, Student.getResponses());
	private Student S9 = new Student("Tyler", "Toponce", 100, Student.getResponses());
	
	private static TreeSet<Student> studentGroup1 = new TreeSet<>();
	private static TreeSet<Student> studentGroup2 = new TreeSet<>();
	private static TreeSet<Student> studentGroup3 = new TreeSet<>();
	private static TreeSet<Student> studentGroup4 = new TreeSet<>();
	private static TreeSet<Student> studentGroup5 = new TreeSet<>();
	
	public Group (TreeSet<Student> sGroup1, TreeSet<Student> sGroup2, TreeSet<Student> sGroup3, TreeSet<Student> sGroup4, TreeSet<Student> sGroup5) {
			
		studentGroup1 = sGroup1;
		studentGroup2 = sGroup2;
		studentGroup3 = sGroup3;
		studentGroup4 = sGroup4;
		studentGroup5 = sGroup5;
		
		studentGroup1.add(S1);
		studentGroup1.add(S2);
		studentGroup2.add(S3);
		studentGroup2.add(S4);
		studentGroup3.add(S5);
		studentGroup3.add(S6);
		studentGroup4.add(S7);
		studentGroup4.add(S8);
		studentGroup5.add(S3);
		studentGroup5.add(S9);
	}
	
	public static TreeSet<Student> getStudentGroup1() {
		return studentGroup1;
	}
	
	public static TreeSet<Student> getStudentGroup2() {
		return studentGroup2;
	}
	
	public static TreeSet<Student> getStudentGroup3() {
		return studentGroup3;
	}
	
	public static TreeSet<Student> getStudentGroup4() {
		return studentGroup4;
	}
	
	public static TreeSet<Student> getStudentGroup5() {
		return studentGroup5;
	}
}
