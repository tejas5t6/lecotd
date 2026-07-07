class Solution {
    public int maxArea(int[] height) {
        int lb =0;
        int ub = height.length-1;
        int fin = Integer.MIN_VALUE;
        while(lb<ub){
            fin=Math.max(fin,(ub-lb)*Math.min(height[lb],height[ub]));
            if(height[lb]<height[ub]) lb++;
            else ub--;
        }
        return fin;
    }
}