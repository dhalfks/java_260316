package day06;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// 배열
		// 숫자 5개의 값을 가지는 배열을 생성
		// 1 2 3 4 5 입력하고 출력
		
		int arr[] = new int[5];
		int arr2[] = new int[] {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		arr[0] = 10;  // 값을 메모리에 덮어쓰기
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---");
		// 향상된 for 문
		for(int tmp : arr) {
			System.out.println(tmp);
		}
		
		System.out.println("---");
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
