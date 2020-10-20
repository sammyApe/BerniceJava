
package com.learn;
//Package is how you group your classes

public class ClassDay5 {

    public static void main(String[] args){

        PrintNaturalNumbersUpToN(10);
        FibonacciSeriesN(8);
        System.out.println(FibonacciSeriesN(8));
        FibonacciSeriesN1(8);
        assignment3();





    }//this is where main curly bracket ends.

    /*
	Write a program to calculate the sum of first 10 natural number.
	 */

    public static void PrintNaturalNumbersUpToN(int n){
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
    }

    /*
	Write a program to print Fibonacci series of n terms where n can be any number:
		0 1 1 2 3 5 8 13 21 .....
	 */
    public static int FibonacciSeriesN(int n){
        int results =0;
        int results1 =1;
        for(int m=0; m<=n; m++){
            int sum = results + results1;
            results=results1;
            results1=sum;
        }
        return results;

    }
    public static void  FibonacciSeriesN1(int n){
        int num1 = 0;
        int num2 = 1;
        for(int j=0; j<=n; j++){
            System.out.println(num1 +" ");
            int sum1=num1 + num2;
            num1=num2;
            num2=sum1;
        }

    }

    /*
 	 Write a program that prints the following on the screen
	 **********
	 **********
	 **********
	 **********
	 */
    public static void assignment3(){
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");

    }
    // I did the question 2 in two different ways because I wasn't sure of your expectation.



}