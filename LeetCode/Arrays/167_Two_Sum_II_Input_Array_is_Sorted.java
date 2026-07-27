class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length-1;
        int[] arr = new int[2];

        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                arr[0] = ++left;
                arr[1] = ++right;
                return arr;
            }
            else if(sum < target){
                left++;
                continue;
            }
            else{
                right--;
            }

        }

        return arr;
        
    }
}