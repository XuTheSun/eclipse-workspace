package com.guanxu.easy;

import java.util.ArrayList;
import java.util.List;

public class MergeInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(9,100));
		list.add(new Interval(8,100));
		list.add(new Interval(7,100));
		list.add(new Interval(6,100));
		list.add(new Interval(5,100));
		list.add(new Interval(4,100));
		list.add(new Interval(3,100));
		list.add(new Interval(12,100));
		printIntervalList(list);
		mergeInterval(list);
		printIntervalList(list);
	}
	
	public static List<Interval> mergeInterval(List<Interval> list){
		mergeSort(list);
		for(int i = 0; i < list.size() - 1;) {
			if(list.get(i).end >= list.get(i+1).start) {
				list.set(i, new Interval(Math.min(list.get(i).start, list.get(i+1).start),
						Math.max(list.get(i).end, list.get(i+1).end)));
				list.remove(i+1);
				continue;
			}
			i++;
		}
		return list;
	}
	
	public static void printIntervalList(List<Interval> list) {
		for(Interval i : list) {
			System.out.print("{"+i.start+", "+i.end+"}"+" ");
		}
		System.out.println();
	}
	
	public static void mergeSort(List<Interval> data) {
		sort(data, 0, data.size()-1);
	}
	
	public static void sort(List<Interval> data, int low, int high) {
		if(low < high) {
			int mid = (high + low) /2;
			sort(data,low, mid);
			sort(data, mid + 1, high);
			merge(data, low, mid, high);
		}
	}
	
	public static void merge(List<Interval> a, int low, int mid, int high) {
		List<Interval> temp = new ArrayList<Interval>();
		int ls = low;
		int rs = mid + 1;
		while(ls <= mid && rs <= high) {
			if(a.get(ls).start < a.get(rs).start ) {
				temp.add(a.get(ls++));
			}else {
				temp.add(a.get(rs++));
			}
		}
		while(ls <= mid) {
			temp.add(a.get(ls++));
		}
		while(rs <= high) {
			temp.add(a.get(rs++));		
		}
		
		for(int i= 0; i < temp.size(); i++) {
			a.set(i+low, temp.get(i));
		}
	}
	
	public static class Interval {
		int start, end;
		Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
}
