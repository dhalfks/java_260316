package day06;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 정수배열[10] 생성 후
		// 1~10저장 후 출력
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 섞기
		for(int i=0; i<arr.length; i++) {
			// 번지를 랜덤으로 생성  0~9
			int index = (int)(Math.random()*arr.length);
			//System.out.println(index);
			
			//교환
			int t = arr[i];
			arr[i] = arr[index];
			arr[index] = t;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 원래대로 정렬 (선택정렬)
		// 작은수부터 정렬 => 오름차순
		// 큰수부터 정렬 => 내림차순
		// [3, 5, 4, 1, 2]
		// [1, 5, 4, 3, 2] => 1pass
		// [1, 2, 5, 4, 3] => 2pass
		// [1, 2, 3, 5, 4] => 3pass
		// [1, 2, 3, 4, 5] => 4pass
		
		// if(앞 > 뒤) {교환;}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j] ) { //오름차순
					//교환
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		// Arrays.sort : 오름차순
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
