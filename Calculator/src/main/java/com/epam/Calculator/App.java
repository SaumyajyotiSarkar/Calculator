package com.epam.Calculator;

import java.util.Scanner;

public class App{

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter two numbers: ");
	
	double first = sc.nextDouble();
	double second = sc.nextDouble();
	
	System.out.println("enter an operator(+, -, *, /): ");
	char operator = sc.next().charAt(0);

	double result;

	switch(operator){
	case '+':
		result = first + second;
		break;

	case '-':
		result = first - second;
		break;
	case '*':
		result = first * second;
		break;
	case '/':
		result = first / second;
		break;

	default:
		System.out.println("error! wrong operator");
		return;
}

System.out.println(first +  " " +  operator + " " + second + " = " +result);
}}