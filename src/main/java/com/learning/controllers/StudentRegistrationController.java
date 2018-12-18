package com.learning.controllers;

import com.learning.beans.Student;
import com.learning.beans.StudentRegistration;
import com.learning.beans.StudentRegistrationReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentRegistrationController {
    @RequestMapping(method = RequestMethod.POST, value = "/student")
    @ResponseBody
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        boolean result = StudentRegistration.getInstance().add(student);
        return StudentRegistrationReply
                .builder()
                .age(student.getAge())
                .name(student.getName())
                .registrationNumber(student.getRegistrationNumber())
                .registrationStatus(result)
                .build();
    }
}
