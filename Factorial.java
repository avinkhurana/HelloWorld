package com.delta;

import java.util.Scanner;

public class Factorial {
	
	public static int FirstFactorial(int num) { 
		  
	       int a = 1;
	       for(int i=0;i<num;i++){
	           a=a*(num-i);
	          
	       }
	    return a;
	    
	  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print(FirstFactorial(s.nextInt())); 
		
	}

}
