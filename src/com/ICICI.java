package com;

public class ICICI implements RBI {
    @Override
    public void fixed() {
        System.out.println("6%");
    }

    @Override
    public void deposit() {
        System.out.println("5%");

    }
    public void saving(){
        System.out.println("3%");
    }
}
