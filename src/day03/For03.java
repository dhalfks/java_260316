package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 1~10까지의 수 중 랜덤 수를 5개 출력
		// 중복 가능.
		// for = 반복문  (랜덤수 출력 * 5)
		// 랜덤수 : 1~10 범위 중 랜덤수
		
		for(int i=1; i<=5; i++) {
			System.out.print((int)(Math.random()*10)+1 +" ");
		}
		System.out.println();
		
		// 구구단 출력 2단  
		// 2*1=2
		// 2*2=4
		// ...
		// 2*9=18
		
		// 1~9까지 랜덤으로 구구단 출력
		
//		int dan = 2;
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan+"*"+i+"="+(dan*i));
//		}
		
		
		// 1~9까지 랜덤으로 구구단 출력
//		int dan = (int)(Math.random()*9)+1;
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan+"*"+i+"="+(dan*i));
//		}
		
		//내가 입력한 단을 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단 입력>");
		
		int dan = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		scan.close();
		
	}

}
