package university;

import university.Controllers.*;
import university.Models.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
		HumanCreator humanCreator = new HumanCreator();
		StudentCreator studentCreator = new StudentCreator();
		GroupCreator groupCreator = new GroupCreator();
		DepartmentCreator departmentCreator = new DepartmentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        UniversityCreator universityCreator = new UniversityCreator();
		
		Human leader1 = humanCreator.createHuman("Doe", "Jane", "Energetic", Sex.FEMALE);
		Human leader2 = humanCreator.createHuman("Johnson", "Michael", "Outgoing", Sex.MALE);
		Human leader3 = humanCreator.createHuman("Garcia", "Sofia", "Optimistic", Sex.FEMALE);
		Human leader4 = humanCreator.createHuman("Brown", "Christopher", "Adventurous", Sex.MALE);
		Human leader5 = humanCreator.createHuman("Lee", "Jasmine", "Creative", Sex.FEMALE);
		Human leader6 = humanCreator.createHuman("Wang", "David", "Ambitious", Sex.MALE);
		Human leader7 = humanCreator.createHuman("Kim", "Hannah", "Sociable", Sex.FEMALE);

		Student student1 = studentCreator.createStudent(123456, humanCreator.createHuman("Smith", "John", "Hardworking", Sex.MALE));
		Student student2 = studentCreator.createStudent(654321, humanCreator.createHuman("Doe", "Emily", "Diligent", Sex.FEMALE));
		Student student3 = studentCreator.createStudent(789456, humanCreator.createHuman("Brown", "Ethan", "Persistent", Sex.MALE));
		Student student4 = studentCreator.createStudent(987654, humanCreator.createHuman("Kim", "Olivia", "Resilient", Sex.FEMALE));
		Student student5 = studentCreator.createStudent(456789, humanCreator.createHuman("Garcia", "Noah", "Resourceful", Sex.MALE));
		Student student6 = studentCreator.createStudent(321654, humanCreator.createHuman("Wang", "Sophia", "Curious", Sex.FEMALE));
		Student student7 = studentCreator.createStudent(654987, humanCreator.createHuman("Lee", "James", "Inquisitive", Sex.MALE));
		Student student8 = studentCreator.createStudent(987123, humanCreator.createHuman("Johnson", "Emma", "Analytical", Sex.FEMALE));
		Student student9 = studentCreator.createStudent(852369, humanCreator.createHuman("Davis", "Daniel", "Perceptive", Sex.MALE));
		Student student10 = studentCreator.createStudent(369852, humanCreator.createHuman("Anderson", "Ava", "Observant", Sex.FEMALE));
		Student student11 = studentCreator.createStudent(147258, humanCreator.createHuman("Martinez", "Elijah", "Insightful", Sex.MALE));
		Student student12 = studentCreator.createStudent(258369, humanCreator.createHuman("Taylor", "Mia", "Thoughtful", Sex.FEMALE));
		Student student13 = studentCreator.createStudent(369147, humanCreator.createHuman("Johnson", "William", "Judicious", Sex.MALE));
		Student student14 = studentCreator.createStudent(741852, humanCreator.createHuman("Wang", "Lily", "Prudent", Sex.FEMALE));
		Student student15 = studentCreator.createStudent(852741, humanCreator.createHuman("Lee", "Ethan", "Wise", Sex.MALE));
		Student student16 = studentCreator.createStudent(963852, humanCreator.createHuman("Garcia", "Avery", "Sensible", Sex.FEMALE));

		Group group1 = groupCreator.createGroup("SE-24-1", leader1, Arrays.asList(new Student[]{student1, student2}));
		Group group2 = groupCreator.createGroup("SE-24-2", leader1, Arrays.asList(new Student[]{student3, student4}));
		Group group3 = groupCreator.createGroup("SE-24--3", leader1, Arrays.asList(new Student[]{student5, student6}));
		Group group4 = groupCreator.createGroup("SE-24--4", leader1, Arrays.asList(new Student[]{student7, student8}));
		Group group5 = groupCreator.createGroup("PH-24-1", leader2, Arrays.asList(new Student[]{student9, student10}));
		Group group6 = groupCreator.createGroup("PH-24-2", leader2, Arrays.asList(new Student[]{student11, student12}));
		Group group7 = groupCreator.createGroup("SO-24-1", leader2, Arrays.asList(new Student[]{student13, student14}));
		Group group8 = groupCreator.createGroup("SO-24-2", leader2, Arrays.asList(new Student[]{student15, student16}));
		
		Department department1 = departmentCreator.createDepartment("Engineers", leader3, Arrays.asList(new Group[]{group1, group2, group3, group4}));
		Department department2 = departmentCreator.createDepartment("Humanitarian", leader4, Arrays.asList(new Group[]{group5, group6, group7, group8}));
		
		Faculty faculty1 = facultyCreator.createFaculty("Computer Technologies", leader5, Arrays.asList(new Department[]{department1}));
		Faculty faculty2 = facultyCreator.createFaculty("Humanitarian Sciences", leader6, Arrays.asList(new Department[]{department2}));
		
        University university = universityCreator.createUniversity("Golden American University", leader7, Arrays.asList(new Faculty[]{faculty1, faculty2}));

        System.out.println(university.toString());
    }
}