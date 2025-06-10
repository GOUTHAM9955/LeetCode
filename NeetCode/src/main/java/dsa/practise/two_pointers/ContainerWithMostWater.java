package dsa.practise.two_pointers;

public class ContainerWithMostWater {
    public int intMaxArea(int[] heights){
        int maxvolume = 0;
        int left =0;
        int right = heights.length-1;
        while(left < right){
            int temp = Math.min(heights[left],heights[right])*(right-left);
            maxvolume = Math.max(temp, maxvolume);
            if (heights[left]< heights[right]) left++;
            else right--;
        }
        return maxvolume;
    }
}
