package com.javaPrimitiveDataTypes;

public class Student 
{

	int studentId = 4590;
	String studentName = "Dinesh";
	float studentMarks = 67.89F;
	String studentSubjects[] = {"Marati", "Hindi", "English", "Maths", "General Science", "Social Science"};

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		System.out.println(student.studentId);
		System.out.println(student.studentName);
		System.out.println(student.studentMarks);
		
		for(String subject: student.studentSubjects)
		{
			System.out.println(subject);
		}
		
		
	}
	
}
