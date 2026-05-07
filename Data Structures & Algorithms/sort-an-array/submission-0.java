class Solution {
    public int[] sortArray(int[] nums) 
    {
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int curr=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=curr;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
        return nums;
    }
}