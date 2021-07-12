// leetCode: https://leetcode.com/problems/binary-search/

// Time complexity is O(LogN)
 public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int val = 2;

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }

        return -1;
    }
