package com.xxy.sbtest.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@ApiModel(value = "User",description = "sfad")
public class User {
    @ApiModelProperty(value = "qingjia",notes = "dfsa")
    private String name;
    private String pwd;
    private int age;
}
