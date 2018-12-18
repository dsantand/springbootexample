package com.learning.controllers;

import com.learning.beans.Student;
import com.learning.beans.StudentRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentRetrieveController {

    @RequestMapping(method = RequestMethod.GET, value = "/students")
    @ResponseBody
    public List<Student> getAllStudents() {
        return StudentRegistration.getInstance().getStudentRecords();
    }
}
