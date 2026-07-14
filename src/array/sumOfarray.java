package array;

import java.util.Scanner;

public class sumOfarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Size of array");
        int num=sc.nextInt();
        System.out.println("Enter ele:");
        int[]nums=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i< num;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
    }
}
