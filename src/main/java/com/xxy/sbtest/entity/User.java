package com.xxy.sbtest.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String name;
    private String pwd;
    private int age;
}
