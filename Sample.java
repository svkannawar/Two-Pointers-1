// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        if(height.length <2) return 0;
        int p1 = 0;
        int p2 = height.length-1;
        int max = Integer.MIN_VALUE;
        
        while(p2-p1>=1){
            int breadth=p2-p1;
            int ht = Math.min(height[p1], height[p2]);
            int area = breadth * ht;
            max = Math.max(max, area);
            if(height[p1]<=height[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return max;
        
    }
}