package studentchat;

import java.util.ArrayList;

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
		static Student[] studentListTest = new Student[8];
		static ArrayList<Student> studentList = new ArrayList<>();

		public Group (ArrayList<Student> studentList1, ArrayList<Student> studentList2, ArrayList<Student> studentList3, ArrayList<Student> studentList4, ArrayList<Student> studentList5) {
			
			studentListTest[0] = S1;
			studentListTest[1] = S2;
			studentListTest[2] = S3;
			studentListTest[3] = S4;
			studentListTest[4] = S5;
			studentListTest[5] = S6;
			studentListTest[6] = S7;
			studentListTest[7] = S8;
			studentListTest[8] = S9;
			
		}
		
		public static ArrayList<Student> Group1() {
			
			studentList.add(studentListTest[0]);
			studentList.add(studentListTest[1]);
			
			return studentList;
		}
		
		public static ArrayList<Student> Group2() {
			
			studentList.add(studentListTest[2]);
			studentList.add(studentListTest[3]);
			
			return studentList;
		}
		
		public static ArrayList<Student> Group3() {
			
			studentList.add(studentListTest[4]);
			studentList.add(studentListTest[5]);
			
			return studentList;
		}
		
		public static ArrayList<Student> Group4() {
			
			studentList.add(studentListTest[6]);
			studentList.add(studentListTest[7]);
			
			return studentList;
		}
		
		public static ArrayList<Student> Group5() {
			
			studentList.add(studentListTest[8]);
			studentList.add(studentListTest[0]);
			
			return studentList;
		}
}
