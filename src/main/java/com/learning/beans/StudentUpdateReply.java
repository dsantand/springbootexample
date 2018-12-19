package com.learning.beans;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentUpdateReply {
    private String registrationNumber;
    private boolean updateStatus;
}
