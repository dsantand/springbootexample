package com.learning.controllers;


import com.learning.beans.Student;
import com.learning.beans.StudentRegistration;
import com.learning.beans.StudentUpdateReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentUpdateController {
    @RequestMapping(method = RequestMethod.PUT, path = "/student", consumes = {"application/json"}, produces = {"application/json"})
    @ResponseBody
    public StudentUpdateReply updateStudent(@RequestBody Student student) {
        boolean updateResult = StudentRegistration.getInstance().update(student);
        return StudentUpdateReply
                .builder()
                .registrationNumber(student.getRegistrationNumber())
                .updateStatus(updateResult)
                .build();
    }
}
