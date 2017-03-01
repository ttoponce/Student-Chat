package studentchat;

import java.util.TreeSet;

public class Group {
	
	private TreeSet<Student> studentGroup = new TreeSet<>();

	public void addToStudentGroup(Student s1, Student s2) {
		studentGroup.add(s1);
		studentGroup.add(s2);
	}
	
	public TreeSet<Student> getStudentGroup() {
		return studentGroup;
	}
}
