package com.selenium.training;

public class Questions {

	Questions(int a, int b){
		this();
		System.out.println("aparm");
	}

	Questions(){	
		System.out.println("default");
	}

	public static void main(String[] args) {

		try {
			int[] array = new int[7];
			array[7] = 25/0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException exception");
		}catch(Exception e) {
			System.out.println("main exception");
		}
		finally {
			System.out.println("finally");
		}



	}
}
