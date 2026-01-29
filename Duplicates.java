class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                nums[index] = num;
                index++;
            }
        }
        return index;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0; // Slow pointer
        for (int j = 1; j < nums.length; j++) { // Fast pointer
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}