package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리스트를 생성하여 과일 5가지 정도를 저장하고 => 출력
		List<String> list = new ArrayList<String>();
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list.add("사과");
		list.add("복숭아");
		list.add("바나나");
		list.add("배");
		list.add("오렌지");
		
		System.out.println(list);
		
		// 일반 for문으로 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 향상된 for문으로 출력
		System.out.println("------");
		for(String s : list) {
			System.out.println(s);
		}
		
		// iterator 출력
		System.out.println("------");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		// 내 리스트에 사과가 있으면 사과판매 / 없으면 재고없음 출력
		if(list.contains("수박")) {
			System.out.println("사과판매");
		}else {
			System.out.println("재고없음");
		}
		
		
		int index = list.indexOf("사과");
		if(index != -1) {
			System.out.println("사과판매");
		}else {
			System.out.println("재고없음");
		}
		
		Collections.sort(list);
		System.out.println(list);// 가나다 순으로 정렬
		

	}

}
