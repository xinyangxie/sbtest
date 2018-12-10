package com.xxy.sbtest;

import org.junit.Test;

import java.util.Date;

public class Test1 {

@Test
    public void testone(){
    long b=24*60*60*1000L;
    Date date=new Date();
    System.out.println(date);
    System.out.println(date.getTime());
    long l = date.getTime() - b;
    Date date1=new Date(l);
    System.out.println(date1);
}
}
