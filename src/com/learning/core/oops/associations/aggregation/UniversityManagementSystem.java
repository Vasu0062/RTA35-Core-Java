package com.learning.core.oops.associations.aggregation;

import java.util.ArrayList;
import java.util.List;

  class Student {
        private String name;
        private int rollNo;

        public Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        public void displayStudentInfo() {
            System.out.println("Roll No: " + rollNo + ", Name: " + name);
        }
    }

    class University {
        private List<Student> students;

        public University() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void displayStudents() {
            if (students.isEmpty()) {
                System.out.println("No students in the university.");
            } else {
                for (Student student : students) {
                    student.displayStudentInfo();
                }
            }
        }
    }

    public class UniversityManagementSystem {
        public static void main(String[] args) {
            University university = new University();

            Student student1 = new Student("Alice", 101);
            Student student2 = new Student("Bob", 102);

            university.addStudent(student1);
            university.addStudent(student2);

            university.displayStudents();

            // University removed, but students still exist
            university = null;
            System.out.println("Student details after deletion of university");
            student1.displayStudentInfo();
            student2.displayStudentInfo();
        }
    }

