package com.deeps.Prac;

import java. util.*;
public class Test {
	
	public boolean nearHundred(int n) {
		int dff = Math.abs(n-100);
		if (dff<=10){
			System.out.println(n-100);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrtu[] ={2,10,11,7,12};
		int target=9;
		Test tt=new Test();
        int[] kk=tt.twoSum(arrtu,target);
        if(kk.length==2) {
        	System.out.println(kk[0]+" "+kk[1]);
        }
        
        System.out.println(tt.nearHundred(89));
        

	}
	
	public int[] twoSum(int[] arr,int trg){
		HashMap <Integer,Integer> hh=new HashMap();
		
		for(int i=0;i<arr.length;i++){
			int differ = trg-arr[i];
			if(hh.containsKey(differ)) {
				return new int[] {hh.get(differ),i};
			}
			hh.put(arr[i], i);
			System.out.println(hh);
			
		}
		
		
		
		return new int[]{};
	}

	
	/*Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

			posNeg(1, -1, false) → true
			posNeg(-1, 1, false) → true
			posNeg(-4, -5, true) → true*/
	
/*	public boolean posNeg(int a, int b, boolean negative) {
		  if(a<0||b<0 && !negative){
		    if(!negative && a>0 && b>0){
		     return true; 
		    }
		  }
		  else if(negative && a<0 &&b<0){
		    return true;
		  }
		  
		  return false;
		}
*/
}
