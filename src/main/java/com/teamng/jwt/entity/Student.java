package com.teamng.jwt.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private Long studentId;

    private String firstName;

    private String lastName;
}
