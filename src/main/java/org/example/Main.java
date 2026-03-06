package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
        }
    }
}
