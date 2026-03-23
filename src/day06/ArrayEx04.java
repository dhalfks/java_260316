package day06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 정수배열[10] => 1~100까지의 랜덤수 저장 => 출력
		// 오름차순 정렬 => 출력
		Random r = new Random();
		//int arr[] = new int[10];
		Integer arr[] = new Integer[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		System.out.println("--정렬전--");
		System.out.println(Arrays.toString(arr));
		
		// 정렬
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		
		Arrays.sort(arr); //오름차순
		// 정렬 후
		System.out.println("--정렬 후--");
		System.out.println(Arrays.toString(arr));
		
		// 내림차순 정렬 방법 => Object (모든 객체의 부모)
		// 기본 자료형은 불가능. => Object 형태로 boxing (래퍼클래스로...) 
		// Collections.reversOrder()
		// wrapper class => 래퍼클래스
		// 기본 타입의 자료형값을 박싱(포장)해서 객체로 만드는 것
		// int => Integer
		// char => Character
		// byte => Byte
		// float => Float
		// double => Double
		// long => Long
		// short => Short
		// boolean => Boolean
		
		// Arrays.sort(arr, Collections.reversOrder());
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
	}

}
