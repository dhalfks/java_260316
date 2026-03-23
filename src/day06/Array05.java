package day06;

import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		/* 10개의 숫자를 가지는 배열 생성
		 * 1~50까지 랜덤수를 배열에 저장 => 출력
		 * 최대, 최소, 합계, 평균 출력
		 * */
		
		//1.배열생성 
		int[] arr = new int[10];
		
		//2. 배열에 랜덤값 저장 
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*50)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//3. 변수선언
		int sum=0, max=0, min=51;
		double avg=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		// 출력
		System.out.println("sum:"+sum);
		System.out.println("avg:"+sum / (double)arr.length);
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
	}

}
