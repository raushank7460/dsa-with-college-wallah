package Conditional;

import java.util.Scanner;

public class profitAndLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int cp=sc.nextInt();
        System.out.println("Enter num2");
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.println("Profit");
        }else if(cp>sp){
            System.out.println("Loss");
        }else{
            System.out.println("No profit and no Loss");
        }
    }
}
