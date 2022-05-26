package Array;

import java.util.Scanner;

public class Missingelm 
{

public static void main(String[] args)
{
	int[] arr = {1,3,4,5,6,7,8,2,10};
	/*
	One number is missing, so n is array length plus 1
	*/
	int n = arr.length + 1;
	//Calculating sum
	int sum = (n * (n+1))/2;
	
	System.out.println(sum);
	/*
	Traversing an array and subtracting each element with
	the sum 
	*/
	for(int i = 0; i < arr.length; i++) {
	sum = sum - arr[i];
	}
	System.out.println( " Missing number is " + sum);
	
}
}
