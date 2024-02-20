
/*
Given an int array length 2, return true if it does not contain a 2 or 3.



no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */


public class Main {
    public static void main(String[] args) {
        int a[]={6,2};
        
        System.out.println(NO2or3(a));
        
    }


    public static boolean NO2or3(int[] nums) {
        for (int a: nums) {
            if (a == 2 || a == 3) {
                return false;
            }
        }
        return true;
    }

}
