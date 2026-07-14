package array;

public class reverseArray {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5};
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        for(int x:nums){
            System.out.println(x+" ");
        }

    }
}
