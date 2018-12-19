package com.learning.controllers;

import com.learning.beans.Student;
import com.learning.beans.StudentRegistration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class StudentDeletionController {
    @RequestMapping(method = RequestMethod.DELETE, value = "/student", consumes = {"application/json"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@RequestBody Student student) {
        StudentRegistration.getInstance().delete(student);
    }
}
