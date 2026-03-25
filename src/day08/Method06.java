package day08;

import java.util.Random;

public class Method06 {
	
	// 멤버변수
	Random random = new Random();
	
	/* 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 => int[]
	 * 매개변수 : 없음
	 * 리턴타입 : int[]
	 * */
	public int[] makeRandom() {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			//arr[i] = (int)(Math.random()*100);
			arr[i] = random.nextInt(100);
		}
		return arr;
	}
	
	/* 2. 정수 배열을 매개변수로 받아 평균값을 리턴하는 메서드
	 * 매개변수 : 정수 배열 => int number[]
	 * 리턴타입 : 평균값 => double
	 * */
	public double average(int number[]) {
		int sum = 0;
		for(int i=0; i<number.length; i++) {
			sum += number[i];
		}
		return sum / (double)number.length;
	}
	
	
	/* 3. 정수 배열을 매개변수로 받아 출력하는 메서드
	 * 매개변수 : 정수 배열 => int number[]
	 * 리턴타입 : 출력 => void
	 * */
	public void print(int number[]) {
		for(int num : number) {
			System.out.print(num +" ");
		}
		System.out.println(); // enter(줄바꿈)
		//System.out.print(); // 줄바꿈이 없는 출력
	}

	public static void main(String[] args) {
		// 메서드 배열 활용
		/* 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 => int[]
		 * 2. 정수 배열을 매개변수로 받아 평균값을 리턴하는 메서드
		 * 3. 정수 배열을 매개변수로 받아 출력하는 메서드
		 * 
		 * */
		Method06 m6 = new Method06();
		// 메서드 호출
		int arr[] = m6.makeRandom();
		// 출력
		m6.print(arr);
		// 평균 호출 후 => 출력
		System.out.println(m6.average(arr));
		

	}

}
