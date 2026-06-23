Problem : 1295 -> Find Numbers with Even Number of Digits -> Easy
Link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits



class Solution {
    public int findNumbers(int[] nums) {
        
        int ans = evenDigits(nums);
        return ans;
    
    }
    public int evenDigits(int[] arr){

        int count = 0;
        for(int i = 0; i<arr.length; i++){
            int digits = noOfDigits(arr[i]);

            if(digits % 2 == 0){
                count++;
            }
            
        }
        return count;
    }

    public int noOfDigits(int num){

        int digits = 0;
        while(num > 0){
            num /= 10;
            digits++;
        }
        return digits;
    }

    

}