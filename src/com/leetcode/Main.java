package com.leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double median = findMedianSortedArrays(nums1,nums2);
        System.out.println(median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        double median1, median2;
        if(nums1.length%2==0){
            median1 = ((double)(nums1[nums1.length/2]) + (double)nums1[nums1.length/2-1])/2;
        } else{
            median1 = (double)(double)(nums1[nums1.length/2]);
        }
        if(nums2.length%2==0){
            median2 = (double)(nums2[nums2.length/2]) + (double)nums2[nums2.length/2-1];
        } else{
            median2 = (double)(double)(nums2[nums2.length/2]);
        }
        return (double)(median1+median2)/2;
    }
}
