package day14;

import java.util.Arrays;

public class Exception06 {

	public static void main(String[] args) {
		// 메서드를 호출하여 배열을 출력
		
		Exception06 e6 = new Exception06();
		int size = -1;
		int count = 10;
		int start = 1;
		// try~catch를 실행하여 예외 출력 확인
		try {
			
			int arr[] = e6.createArray(size, count, start);
			System.out.println(Arrays.toString(arr));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("예외 처리 후 작성되는 문구");
		System.out.println("요 아이는 반드시 출력되어야 합니다.");
		
		// 예외 처리의 목적은 구문에서 예외가 발생하더라도 프로그램을 정상 작동
		// 시키기위한 목적

	}
	
	/* 배열의 길이(size)를 입력받아 해당 길이를 가지는 배열을 생성
	 * 랜덤값을 채워 배열을 리턴하는 메서드
	 * 랜덤값의 범위도 1~100 값을 입력받아 해당 범위의 랜덤값 발생
	 * (Math.ramdom() * count) + start
	 * 
	 * - size가 0보다 작다면 예외발생
	 * - count 값이 0보다 작으면 예외발생
	 * 
	 * 매개변수 : size, count, start
	 * 리턴타입 : 배열
	 * 
	 * */
	public int[] createArray(int size, int count, int start) throws RuntimeException {
		if(size < 0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		if(count < 0) {
			throw new RuntimeException("random의 범위가 0보다 작습니다.");
		}
		
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*count) + start;
		}
		
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
