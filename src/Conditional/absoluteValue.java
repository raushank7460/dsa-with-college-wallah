package Conditional;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num : ");
        int num=sc.nextInt();
        if(num<0){
            System.out.println(-num);
        }else{
            System.out.println(num);
        }
    }
}
