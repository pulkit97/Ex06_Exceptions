package com.qa;

public class TestCalc {
    public static void main(String[] args) {

        BadCalc bc = new BadCalc();
        System.out.println("Mult res: " + bc.mult(2,3));

        try{
            System.out.println("Div res: " + bc.div(6,0));
        }
        catch (ArithmeticException e) {
            System.out.println("Caught calculation error!");
        }

    }
}
