package dsa.practise.arrays_hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums){
        int length = nums.length;
        int[] output = new int[length];
        output[0] =1;
        for (int i=1;i<length;i++){
            output[i] = output[i-1]*nums[i-1];
        }
        int suffix =1;
        for (int i= length-1;i>=0;i--){
            output[i] = output[i]*suffix;
            suffix *=nums[i];
        }
        return output;
    }

    public static void main(String[] args){
        ProductOfArrayExceptSelf obj1 = new ProductOfArrayExceptSelf();
        int[] result = obj1.productExceptSelf(new int[]{1,2,4,6});
        System.out.println(Arrays.toString(result));
    }
}
