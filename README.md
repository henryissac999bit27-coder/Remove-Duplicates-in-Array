# 26. Remove Duplicates from Sorted Array

## Problem Goal
Given a sorted array, remove duplicates **in-place** such that each unique element appears only once and return the new length $k$.

---

## Approach 1: HashSet (Extra Space)
This approach uses a `HashSet` to track unique elements. While correct for identifying uniqueness, it uses extra memory.

- **Time Complexity:** $O(n)$
- **Space Complexity:** $O(n)$

```java
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
