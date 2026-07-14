package array;

public class missingNum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        System.out.println(miss(nums));
    }

    public static int miss(int[] nums) {
        int n = nums.length + 1;
        int xor = 0;
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}