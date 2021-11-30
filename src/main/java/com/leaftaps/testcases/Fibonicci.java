package com.leaftaps.testcases;

import java.util.Scanner;
import java.util.Vector;

public class Fibonicci {


	public static void main(String[] args) {

		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};

		int max_so_far = 0;
		int max_ending_here = 0;
		boolean maxPresent = false;


		for(int i=0; i<a.length; i++) {

			//check for greater than zero
			//set that value as max
			//add next index value to the max and save that value as max
			//add next value to the max and compare that value to the previous max
			//if previous max is greater break the loop
			// if current max is greater continue adding next index value
			max_ending_here += a[i];//max_ending_here = 0+4, 4+(-1) --> 3, 3+(-2) --> 1, 1+(1) --> 2, 2+(5) --> 7, 7+(-3) --> 4
			if(max_so_far < max_ending_here) {//0 < 4, 4 < 3, 3 < 1, 1 < 2, 2<7, 7<4
				max_so_far = max_ending_here;//max_so_far = 4, 4, 4, 4, 7
				maxPresent = true;
			}else if(max_ending_here < 0) {
				max_ending_here = 0;
			}

			if(maxPresent) {
				System.out.println(a[i]);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println(max_so_far);
	}

}
