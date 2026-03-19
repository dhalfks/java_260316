package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 과제
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산의 결과를 출력
		 * ex) 2 3 + => 2 + 3 = 5
		 * ex) 2 3 - => 2 - 3 = -1
		 * ex) 2 3 ! => 잘못된 연산자
		 * 연산자는 + - * / % 만 가능
		 * String 문자열 == "+" => 불가능
		 * equals()
		 * 
		 * char = scan.next().charAt(0);
		 * */
		/*  / 연산은 0으로 나눌때 exception 발생
		 * 
		 *  - / % 피연산자가 0이면 0으로 나눌 수 없습니다. 출력
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 2개와 연산자를 순서대로 입력> (2 3 +)");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String op = scan.next();  // String
		 
//		char ch = scan.next().charAt(0); // char
//		
//		switch(ch) {
//		case '+':  break;
//		}
		
		switch(op) {
		case "+": 
			System.out.println(num1+op+num2+"="+(num1+num2));
			break;
		case "-": 
			System.out.println(num1+op+num2+"="+(num1-num2));
			break;
		case "*": 
			System.out.println(num1+op+num2+"="+(num1*num2));
			break;
		case "/": 
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				System.out.println(num1+op+num2+"="+(num1/num2));				
			}
			break;
		case "%": 
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				System.out.println(num1+op+num2+"="+(num1%num2));				
			}
			break;
		default: System.out.println("잘못된 연산자");
		}
		
		System.out.println("---------------------");
		// 미리 안되는 케이스를 빼기
		int result = 0;
		if((op.equals("/") || op.equals("%")) && num2 == 0){
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		
		switch(op) {
		case "+": result = num1 + num2; break;
		case "-": result = num1 - num2; break;
		case "*": result = num1 * num2; break;
		case "/": result = num1 / num2; break;
		case "%": result = num1 % num2; break;
		default: System.out.println("잘못된 연산자");
		}
		
		if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")) {
			System.out.println(num1+op+num2+"="+result);		
		}
		
		scan.close();
		
	}

}
