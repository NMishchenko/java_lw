package university;

import university.Controllers.*;
import university.Models.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        DatabaseManager databaseManager = new DatabaseManager();
        databaseManager.connect();

		System.out.println("Enter filter to find students:\n1. Male\n2.Female\n");
		Sex sex = Sex.values()[scanner.nextInt()];

		List<Student> students = databaseManager.getStudentsBySex(sex);

		String message = students.isEmpty() ?
                "No students were found" :
                "Found students:";
        System.out.println(message);

        if (!students.isEmpty()) {
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }

        databaseManager.closeConnection();
    }
}