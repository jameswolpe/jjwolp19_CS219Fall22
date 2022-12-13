import java.util.Arrays;

public class practice {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i = i + 1) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i = i + 1) {
            arr[nums1.length + i] = nums2[i];
        }

        Arrays.sort(arr);
        if (arr.length % 2 ==1) {
            return arr[arr.length/2];
        }
        else{
            return (arr[arr.length/2] + arr[arr.length/2 - 1]) / 2.0;
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {5,6,7,8};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
