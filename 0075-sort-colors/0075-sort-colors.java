class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for ( int val: nums ){
            if (val==0) count0++;
            else if ( val==1 )count1++;
            else count2++;

        }
        for ( int i = 0; i< nums . length ; i++){
            if (i<count0) nums[i]=0;
            else if (i>=count0 && i < nums.length-count2 )nums [i]=1 ;
            else nums [i]=2;

        }
    }
}