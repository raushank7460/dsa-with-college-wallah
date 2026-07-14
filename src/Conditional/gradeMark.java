package Conditional;

import java.util.Scanner;

public class gradeMark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks=sc.nextInt();
        if(marks<=40){
            System.out.println("Fail");
        }else if(marks>41 && marks<=60){
            System.out.println("Average");
        } else if (marks>61 && marks<=80) {
            System.out.println("Good");

        } else if (marks>81 && marks<=100) {
            System.out.println("VeryGood");
        }else {
            System.out.println("No marks define");
        }
    }
}
