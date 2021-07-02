package io.collections.arraylist;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

class Student{
	private int id;
	private String studentName;
	private boolean courseRegistered;
	
	public Student(int id, String studentName, boolean courseRegistered) {
		this.id = id;
		this.studentName = studentName;
		this.courseRegistered = courseRegistered;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public void setCourseRegistered(boolean courseRegistered) {
		this.courseRegistered = courseRegistered;
	}
	
	public boolean getCourseRegistered() {
		return this.courseRegistered;
	}
	
}

public class StudentTester {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(101, "Sushma", true));
		students.add(new Student(102, "Ramesh", false));
		students.add(new Student(103, "Vimal", true));
		
		List<String> studentsName = new ArrayList<>();
		System.out.println("Displaying the details of the students: ");
		for(Student st: students) {
			studentsName.add(st.getStudentName());
			System.out.println("Student Id: "+ st.getId());
			System.out.println("Student Name: "+ st.getStudentName());
			System.out.println("Course Registered: "+ st.getCourseRegistered());
			System.out.println();
		}
		
		System.out.println("Students Name List: "+ studentsName +"\n");
		
		System.out.println("Displaying the students name in forward order: ");
		ListIterator<String> stName = studentsName.listIterator();
		while(stName.hasNext()) {
			System.out.println(stName.next());
		}
		System.out.println();
		
		System.out.println("Displaying the students name in reverse order: ");
		while(stName.hasPrevious()) {
			System.out.println(stName.previous());
		}

	}

}
