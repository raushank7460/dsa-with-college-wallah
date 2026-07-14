package functions;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of nums: ");
        int len=sc.nextInt();
        System.out.println("Enter ele: ");
        int[]nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(sumOfArrays(nums,len));
    }
    public  static  int sumOfArrays(int[]nums,int len){
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
        }
        return sum;
    }

}
