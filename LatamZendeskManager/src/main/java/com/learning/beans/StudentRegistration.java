package com.learning.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
    private List<Student> studentRecords;
    private static StudentRegistration studentRegistration = null;
    private static final Object lock = new Object();

    private StudentRegistration() {
        this.studentRecords = new ArrayList<Student>();
    }

    public static StudentRegistration getInstance() {
        if (studentRegistration == null) {
            synchronized (lock) {
                if (studentRegistration == null)
                    studentRegistration = new StudentRegistration();
            }
        }
        return studentRegistration;
    }

    public boolean add(Student student) {
        studentRecords.add(student);
        return true;
    }

    public boolean update(Student student) {
        for (int i = 0; i < studentRecords.size(); i++) {
            Student studentRecord = studentRecords.get(i);
            if (studentRecord.getRegistrationNumber().equals(student.getRegistrationNumber())) {
                studentRecords.set(i, student);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Student student) {
        for (int i = 0; i < studentRecords.size(); i++) {
            Student studentRecord = studentRecords.get(i);
            if (studentRecord.getRegistrationNumber().equals(student.getRegistrationNumber())) {
                studentRecords.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Student> getStudentRecords() {
        return studentRecords;
    }
}
