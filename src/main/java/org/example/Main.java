package org.example;


public class Main {
    public static void main(String[] args) {
/*
        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for(char c = 'a'; c <= 'z'; c++) {
            alfabet = alfabet + c;
        }

        System.out.println(alfabet.toLowerCase());
        System.out.println(alfabet.toUpperCase());

        String vocale = "aeiou";

        String[] array = new String[10];
        int index = 0;

        for(int i = 0; i < alfabet.length(); i++) {

            char c = alfabet.charAt(i);

            if(vocale.indexOf(c) != -1) {

                String temp = "";
                temp = temp + c;

                int j = i + 1;

                while(j < alfabet.length() && vocale.indexOf(alfabet.charAt(j)) == -1) {
                    temp = temp + alfabet.charAt(j);
                    j++;
                }

                array[index] = temp;
                index++;

                i = j - 1;
            }
        }

        for(int i = 0; i < index; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }*/
        NewIntCalculator intCalc = new NewIntCalculator();
        intCalc.init(10);
        intCalc.add(5);
        intCalc.subtract(3);
        intCalc.multiply(2);
        System.out.println("(int) = " + intCalc.result());


        DoubleCalculator doubleCalc = new DoubleCalculator();
        doubleCalc.init(10.0);
        doubleCalc.add(5.0);
        doubleCalc.subtract(3.3);
        doubleCalc.multiply(2.2);
        System.out.println("(double) = " + doubleCalc.result());
    }
}
