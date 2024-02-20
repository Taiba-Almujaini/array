/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.



sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
*/



public class Main {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3};
        int[] n2 = {1, 2, 3, 1};
        int[] n3 = {1, 2, 1};

        System.out.println(sameFirstLast(n1));
        System.out.println(sameFirstLast(n2));
        System.out.println(sameFirstLast(n3));
    }

    public static boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }
}