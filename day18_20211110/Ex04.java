package day18_20211110;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		int[] arr;
		arr=new int[] {8,5,-6,12,4};
		
		
//		int max=getMaxArr(arr);
//		int min=getMinArr(arr);
		
		MaxMinInst mm= getMaxMinArr(arr);
		System.out.println("max= " + mm.getMax());
		System.out.println("min= " + mm.getMin());


	}

	private static MaxMinInst getMaxMinArr(int[] arr) {
		int max,min;
		min=max=arr[0]; // max=8
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];	
			}
			if(arr[i]>max) {
				max = arr[i];	
			}
		}
		MaxMinInst mm=new MaxMinInst();
		mm.setMax(max);
		mm.setMin(min);
		return mm;
	}
}
