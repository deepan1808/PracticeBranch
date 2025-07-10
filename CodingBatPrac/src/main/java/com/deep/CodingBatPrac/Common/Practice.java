package com.deeps.practice;
import java.util.HashMap;
import java.util.Map;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi");
		
		int [] intArr= {2, 7, 7, 15};
		int target=9;
		Practice bb=new Practice();
		int[] bb1=bb.basicTwoSum(intArr,target);
		if(bb1.length==2) {
			System.out.println(bb1[0]+" "+bb1[1]);
		}
		
	}
	//Basic
	  int[] basicTwoSum(int[] nums,int trg) {
		  int ret=0;
		  int finalint=0;
		 for(int i=0;i<nums.length;i++) {
			 for(int j=0;j<nums.length;j++) {
				 if (nums[i]+nums[j]==trg) {
					 return new int[] {i,j};
				}
				 
			 }
		 }
		 return new int[] {};
	}

}
