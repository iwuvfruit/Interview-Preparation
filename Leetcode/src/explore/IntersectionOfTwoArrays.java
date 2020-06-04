package explore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
 public static void main(String[] args) {
	
}
 public static int[] intersect(int[] num1, int[] num2) {
	 if(num1.length > num2.length) {
		 return intersect(num2, num1);
	 }
	 HashMap<Integer, Integer> map = new HashMap<>();
	 for(int num: num1) {
		 map.put(num, map.getOrDefault(num, 0)+1);
	 }
	 List<Integer> list = new ArrayList<>();
	 for(int num:num2) {
		 int count = map.getOrDefault(num, 0);
		 if(count>0) {
			 list.add(num);
			 map.put(num, count-1);
		 }
	 }
	 int[] result = new int[list.size()];
	 int i = 0;
	 for(int num: list) {
		 result[i++] = num;
	 }
	 return result;
 }
 
 public int[] intersectWithSorting(int[] nums1, int[] nums2) {
	 Arrays.sort(nums1);
	 Arrays.sort(nums2);
	 
	 int pointeri = 0;
	 int pointerj = 0;
	 
	 List<Integer> list = new ArrayList<>();
	 while(pointeri < nums1.length && pointerj < nums2.length) {
		 if(nums1[pointeri] == nums2[pointerj]) {
			 list.add(nums1[pointeri]);
			 pointeri++;
			 pointerj++;
		 }
		 else if(nums1[pointeri] > nums2[pointerj]) {
			 pointerj++;
		 }
		 else {
			 pointeri++;
		 }
	 }
	 
	 int[] res = new int[list.size()];
	 int index = 0;
	 for(int i: list) {
		 res[index++] = i;
	 }
	 return res;
 }
}
