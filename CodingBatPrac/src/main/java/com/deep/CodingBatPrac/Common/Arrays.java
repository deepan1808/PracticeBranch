package com.deep.java;
import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int [] num = {1,3,4,5,6,7};
		Arrays ret =new Arrays();
		ret.retNum(num);
		ret.strArray();
		

	}
	
	public void retNum(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	void strArray() {
		System.out.println("Enter the Number - >");
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.nextInt());
		
	}

}
