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
		private static Student student1;
		private static Student student2;
	
		static ArrayList<Student> studentList = new ArrayList<>();
		static Random randomStudent = new Random();
		static ArrayList<Student> studentGroup = new ArrayList<>();

		public Group () {
			
		}
		
		/**
		 * Create ArrayList of Students using Student objects previously defined.
		 * @return ArrayList of Students.
		 */
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
		
		/**
		 * Create student group of two students using Student objects
		 * @return
		 */
		public static ArrayList<Student> Group1() {
			int randIndex1 = randomStudent.nextInt(studentList.size());
			int randIndex2 = randomStudent.nextInt(studentList.size());
			student1 = studentList.get(randIndex1);
			student2 = studentList.get(randIndex2);
			// while loop first makes sure that the two randomly selected students aren't the same
			// student from the collection and the interior if/else sorts the two students
			// lexicographically by student's last name
			while (studentGroup.isEmpty()) {
				if (student1.hashCode() != student2.hashCode()) {
					if ((student1.getLastName().compareTo(student2.getLastName())) < 0) {
						studentGroup.add(student1);
						studentGroup.add(student2);
					} else {
						studentGroup.add(student2);
						studentGroup.add(student1);
					}
				} else {
					int randIndexTemp = randomStudent.nextInt(studentList.size());
					student2 = studentList.get(randIndexTemp);
					studentGroup.add(student1);
					studentGroup.add(student2);
				}
			}
			return studentGroup;
		}
		
		public static void main(String[] args) {
			for (Student student : studentGroup) {
				System.out.println(student);
			}
		}
}
