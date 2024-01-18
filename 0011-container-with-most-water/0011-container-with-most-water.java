class Solution {
    public int maxArea(int[] height) {
        
        int low=0;
        int high=height.length-1;
        int maxArea=0;
        while(low<high){
            int width=high-low;
            int currentHeight=Math.min(height[high],height[low]);
            int current_area=width*currentHeight;
            
            maxArea=Math.max(maxArea,current_area);
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }return maxArea;
    }
}