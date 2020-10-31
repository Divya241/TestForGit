package com.abs;

public class ThreeSeries extends Car {
    @Override
    public void enginePower() {
        System.out.println("overridd");

    }

    public static void main(String[] args) {
        ThreeSeries t= new ThreeSeries();
        t.common();
        t.enginePower();
    }
}
