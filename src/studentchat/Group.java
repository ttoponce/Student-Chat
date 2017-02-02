/**
 * 
 */
package studentchat;

import java.util.ArrayList;

/**
 * @author Tyler Toponce
 *
 */
public class Group {
	
		private static Student S1 = new Student("Nathan", "Borup", 100, StudentChat.getResponses());
		private static Student S2 = new Student("Ethan", "Brown", 100, StudentChat.getResponses());
		private static Student S3 = new Student("Michael", "Cullimore", 100, StudentChat.getResponses());
		private static Student S4 = new Student("Kendra", "Koester", 100, StudentChat.getResponses());
		private static Student S5 = new Student("Cody", "May", 100, StudentChat.getResponses());
		private static Student S6 = new Student("Brieanna", "Miller", 100, StudentChat.getResponses());
		private static Student S7 = new Student("Rizwan", "Mohammed", 100, StudentChat.getResponses());
		private static Student S8 = new Student("Lauren", "Ribeiro", 100, StudentChat.getResponses());
		private static Student S9 = new Student("Tyler", "Toponce", 100, StudentChat.getResponses());
		static ArrayList<Student> studentList1 = new ArrayList<>();
		static ArrayList<Student> studentList2 = new ArrayList<>();
		static ArrayList<Student> studentList3 = new ArrayList<>();
		static ArrayList<Student> studentList4 = new ArrayList<>();
		static ArrayList<Student> studentList5 = new ArrayList<>();

		public Group (ArrayList<Student> studentList1, ArrayList<Student> studentList2, ArrayList<Student> studentList3, ArrayList<Student> studentList4, ArrayList<Student> studentList5) {

		}
		
		/**
		 * Create student group of two students using Student objects
		 * @return
		 */
		public static ArrayList<Student> Group1() {
			studentList1.add(S1);
			studentList1.add(S2);
			return studentList1;
		}
		
		/**
		 * Create student group of two students using Student objects
		 * @return
		 */
		public static ArrayList<Student> Group2() {
			ArrayList<Student> studentList2 = new ArrayList<>();
			studentList2.add(S3);
			studentList2.add(S4);
			return studentList2;
		}
		
		/**
		 * Create student group of two students using Student objects
		 * @return
		 */
		public static ArrayList<Student> Group3() {
			ArrayList<Student> studentList3 = new ArrayList<>();
			studentList3.add(S5);
			studentList3.add(S6);
			return studentList3;
		}
		
		/**
		 * Create student group of two students using Student objects
		 * @return
		 */
		public static ArrayList<Student> Group4() {
			ArrayList<Student> studentList4 = new ArrayList<>();
			studentList4.add(S7);
			studentList4.add(S8);
			return studentList4;
		}
		
		/**
		 * Create student group of two students using Student objects
		 * @return
		 */
		public static ArrayList<Student> Group5() {
			ArrayList<Student> studentList5 = new ArrayList<>();
			studentList5.add(S8);
			studentList5.add(S9);
			return studentList5;
		}
}
