package org.vikas;

import org.vikas.model.Student;

public class Main {
    public static void main(String[] args) {
        // initialise student object with different parameters
        try {
            Student student = new Student.StudentBuilder()
                    .withFirstname("Vikas")
                    .withLastname("Kumar")
                    .withGender("Male")
                    .withClasss("10th")
                    .withRollno("10")
                    .withAge("10")
                    .build();
            System.out.println(student);
        } catch (IllegalStateException e ) {
            System.out.println(e.getMessage());
        }
        try {
            Student student1 = new Student.StudentBuilder()
                    .withFirstname("vikas")
                    .withLastname("kumar")
                    .withGender("male")
                    .withClasss("10th")
                    .withRollno("10")
                    .withFathername("abc")
                    .withMothername("abc")
                    .build();
            System.out.println(student1);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        try {
            Student student = new Student.StudentBuilder()
                    .withFirstname("Vikas")
                    .withLastname("kumar")
                    .withGender("male")
                    .withAge("15")
                    .withClasss("10th")
                    .withSection("a")
                    .withRollno("10")
                    .withFathername("abc")
                    .withMothername("abc")
                    .withPhone("1234567890")
                    .withEmail("abc@abc")
                    .withAddress("abc")
                    .withGrade("A")
                    .withMarks("100")
                    .build();
            //print student
            System.out.println(student);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello world!");
    }
}