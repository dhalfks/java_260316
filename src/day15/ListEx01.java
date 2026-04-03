package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// 배열의 값을 리스트로 생성
		String[] arr1 = {"a","y","t","s","r"};
		String[] arr2 = {"b","c","p","w","d"};
		
		// 배열을 list로 가져오기
		List<String> list = new ArrayList<>();
		
		// 배열의 값을 연결하여 리스트로 가져오기
//		list = Arrays.asList(arr1); // 얕은 복사 
//		System.out.println(list);
		
		// 깊은 복사 : 복사하여 가져오기
		List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
		List<String> list2 = new ArrayList<>(Arrays.asList(arr2));
		
		// addAll(list) : 모든요소 추가
		list1.addAll(list2);
		System.out.println(list1);
		
		// 2개의 배열을 하나의 리스트로 생성 => 출력
//		List<String> list = new ArrayList<>();
//		
//		for(String s : arr1) {
//			list.add(s);
//		}
//		for(String s: arr2) {
//			list.add(s);
//		}
//		
//		System.out.println(list);
//		
//		// 정렬 => 출력
//		Collections.sort(list);
//		System.out.println(list);

	}

}
