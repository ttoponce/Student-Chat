/**
 * 
 */
package studentchat;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Tyler Toponce
 *
 */
public class Group {
	
		private static Student S1 = new Student("Nathan", "Borup", 100, Student.getResponses());
		private static Student S2 = new Student("Ethan", "Brown", 100, Student.getResponses());
		private static Student S3 = new Student("Michael", "Cullimore", 100, Student.getResponses());
		private static Student S4 = new Student("Kendra", "Koester", 100, Student.getResponses());
		private static Student S5 = new Student("Cody", "May", 100, Student.getResponses());
		private static Student S6 = new Student("Brieanna", "Miller", 100, Student.getResponses());
		private static Student S7 = new Student("Rizwan", "Mohammed", 100, Student.getResponses());
		private static Student S8 = new Student("Lauren", "Ribeiro", 100, Student.getResponses());
		private static Student S9 = new Student("Tyler", "Toponce", 100, Student.getResponses());
	
		static ArrayList<Student> studentList = new ArrayList<>();
		static Random randomStudent;

		public Group (ArrayList<Student> studentGroup) {
			studentGroup = studentList.get(index);
		}
		
		public static ArrayList<Student> setStudentList() {
			studentList.add(S1);
			studentList.add(S2);
			studentList.add(S3);
			studentList.add(S4);
			studentList.add(S5);
			studentList.add(S6);
			studentList.add(S7);
			studentList.add(S8);
			studentList.add(S9);
			return studentList;
		}
		
		public static Student Group1() {
			ArrayList<Student> studentGroup = new ArrayList<>();
			
		}
}
