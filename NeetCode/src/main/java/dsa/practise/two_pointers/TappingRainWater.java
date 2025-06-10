package dsa.practise.two_pointers;

public class TappingRainWater {
    public int tappingRainWater(int[] height){
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int watertrapped =0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                    leftMax = height[left];
                }
                else watertrapped += leftMax-height[left];
                left++;
            }
            else{
                if (height[right]>= rightMax) rightMax = height[right];
                else watertrapped += rightMax-height[right];
                right --;
            }
        }
        return watertrapped;
    }
}
