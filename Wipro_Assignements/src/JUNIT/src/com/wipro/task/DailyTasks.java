package com.wipro.task;
import java.util.Arrays;

public class DailyTasks {
	public String doStringConcat(String s1, String s2) {
		return s1+" "+s2;
	}
	public int[] sortValues(int arr[]) {
		Arrays.sort(arr);
		return arr;
	}
	public int countA(String word) {
		int count =0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='A') {
				count +=i;
			}
		}
		return count;
	}
}
