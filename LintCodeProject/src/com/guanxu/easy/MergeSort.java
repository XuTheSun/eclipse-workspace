package com.guanxu.easy;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[]{9,8,7,6,5,4,3,2,21};
		printArray(data);
		mergeSort(data);
		printArray(data);
	}
	
	public static void printArray(int[] data) {
		for(int i : data) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int[] data) {
		sort(data, 0, data.length-1);
	}
	
	public static void sort(int[] data, int low, int high) {
		if(low < high) {
			int mid = (high + low) /2;
			sort(data,low, mid);
			sort(data, mid + 1, high);
			merge(data, low, mid, high);
		}
	}
	
	public static void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int ls = low;
		int rs = mid + 1;
		int tempI = 0;
		while(ls <= mid && rs <= high) {
			if(a[ls] < a[rs]) {
				temp[tempI++] = a[ls++];
			}else {
				temp[tempI++] = a[rs++];
			}
		}
		while(ls <= mid) {
			temp[tempI++] = a[ls++];
		}
		while(rs <= high) {
			temp[tempI++] = a[rs++];			
		}
		
		for(int i= 0; i < temp.length; i++) {
			a[i + low] = temp[i];
		}
	}

}
