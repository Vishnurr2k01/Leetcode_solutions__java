

// https://leetcode.com/problems/house-robber

class houseRobber {
    public int rob(int[] nums) {
        
        
       int robCurrentHouse = 0;
        int notRobCurrentHouse = 0;
        
        for(int i=0;i<nums.length;i++){
            int rob = notRobCurrentHouse + nums[i];
            notRobCurrentHouse = Math.max(notRobCurrentHouse,robCurrentHouse);
            robCurrentHouse = rob;
        }
        return Math.max(notRobCurrentHouse,robCurrentHouse);
        
    }
}