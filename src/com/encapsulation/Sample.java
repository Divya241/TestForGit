package com.encapsulation;

public class Sample {
    public static void main(String[] args) {
        EncapExample e=new EncapExample();
        e.setName("Divya");
        e.setAddr("Chennai");
        e.setPhno(8785675);
        System.out.println(e.getName());
        System.out.println(e.getAddr());
        System.out.println(e.getPhno());
    }
}
