class Solution {
    public int[] getConcatenation(int[] nums) {

        // nums = [1,4,1,2] length =n =4 

        int n = nums.length; //4 

        int ans[] = new int[2*n]; // ans ={ - - - - - - - - }// 8 

        for(int i=0; i<n; i++){

        ans[i] = nums[i]; // num[0] = 1 therefore ans[0] == 1 ans[1]=4

        ans[i+n] = nums[i]; // num[0] = 1 he punha (i+n)=(0+4), 4th positon of ans = 1 

        }
          return ans;

     }
}   