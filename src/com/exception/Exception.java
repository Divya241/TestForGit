package com.exception;

public class Exception {

       protected void add(){
            System.out.println("a");
        }
        public void add(String s){
            System.out.println("b");

        }
    public static void main(String[] args)  {
            Exception e= new Exception();
            e.add();
            e.add("s");

    }
}
