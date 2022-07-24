package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 'A';
        if(value =='A'){
            System.out.println("Value was A");
        } else if (value == 'B'){
            System.out.println("Value was B");
        } else {
            System.out.println("Was not A or B");
        }
        char switchValue ='A';
        switch (switchValue) {
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("was C or a D or a A");
                System.out.println("Actually it was A " + switchValue);
                break;

            default:
                System.out.println("char was not found");
                break;

        }
    }
}
