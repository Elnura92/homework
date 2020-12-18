
package com.company;


//import java.util.Scanner;

public class Main {

    //private static final int NUM = 5;

    public static void main(String[] args) {

               // int num = 10;
                //int age = 20;
               // if (num > 5 && age < 18){  // оператор и
               //     System.out.println("Можешь гулять допоздна");
                //}

                //if (num == 10 || age > 18) { // оператор или
                   // System.out.println("Success!");

               // }

        print();
        printOurWord("Hello");
        System.out.println("Сумма двух чисел:" + getSumOfValues(8, 9));





    }

    public static void print(){
        System.out.println("Hello, world!");
    }
    public static void printOurWord(String word){
        System.out.println("Your word:" + word);
        word = "Привет";
    }

    public static int getSumOfValues(int num1, int num2){
        return num1 + num2;

    }
}
