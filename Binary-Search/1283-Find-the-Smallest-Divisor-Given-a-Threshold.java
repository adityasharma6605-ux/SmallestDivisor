class Solution {
    private boolean isPossible(int[] nums,int threshold,int mid){
        for(int num:nums){
            threshold-=(num+mid-1)/mid;
        }
        return threshold>=0;
        
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int min=1;
        int max=1;
        
        for(int num:nums){
            max=Math.max(num,max);
        }
        while(min<=max){
            int mid=min+(max-min)/2;
            if(isPossible(nums,threshold,mid)){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return min;
        
    }
}
