package com.learning.beans;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentRegistrationReply {
    private String name;
    private int age;
    private String registrationNumber;
    private boolean registrationStatus;
}
