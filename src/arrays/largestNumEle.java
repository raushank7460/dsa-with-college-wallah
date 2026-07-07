package arrays;

import java.util.Scanner;

public class largestNumEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[]nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
}
