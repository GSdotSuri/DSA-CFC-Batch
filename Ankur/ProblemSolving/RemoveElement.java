 //Leetcode: https://leetcode.com/problems/remove-element/


// My Approach time complexity is O(2N)
//1. find the val and then replacing with -1
//2. using two pointers shifting all the -1 to the end of the array

public int removeElement(int[] nums, int val) {
         int count = nums.length;
       for(int i=0;i<nums.length;i++){
           if(nums[i] == val){
               nums[i] = -1;
               count--;
           }
       }
        
        if(count == 0) return count;
      
        
        int start = 0;
        int end = nums.length-1;
        
        while(start < end){
            
            if(nums[start] != -1 ){
                while(nums[start] != -1 && start < end ){
                    start++;
                }
            }
            
            if(nums[end] == -1 ){
                while(nums[end] == -1 && end > start){
                    end--;
                }
            }
            
            if(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                
                start ++;
                end--;
            }
        }
        
        return count;
    }




// Discussion Approach O(N) time complexity
  public int removeElement(int[] nums, int val) {
        
        
        int count = 0;
        
        for(int elem : nums){
            
            if(elem != val){
                nums[count] = elem;
                count++;
            }
        }
        
        return count;
   }
