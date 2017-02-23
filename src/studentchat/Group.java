package studentchat;

import java.util.TreeSet;

public class Group {
	
	private static TreeSet<Student> studentGroup = new TreeSet<>();
	
	public Group (Student S1, Student S2) {
		
	}
	
	public static TreeSet<Student> setStudentGroup(Student S1, Student S2) {
		if (S1.getFirstName().compareTo(S2.getFirstName()) < 0) {
			studentGroup.add(S1);
			studentGroup.add(S2);
		} else {
			studentGroup.add(S2);
			studentGroup.add(S1);
		}
		
		return studentGroup;
	}
	
	public static TreeSet<Student> getStudentGroup() {
		return studentGroup;
	}
}
