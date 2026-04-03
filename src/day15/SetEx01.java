package day15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		// set에 1~45 까지 중복되지 않는 랜덤수 6자리 생성 => 출력
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			int random = (int)(Math.random()*45)+1;
			set.add(random);
		}
		
		System.out.println(set);
		
		System.out.println("----------");
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		while(treeSet.size() < 6) {
			int random = (int)(Math.random()*45)+1;
			treeSet.add(random);
		}
		
		System.out.println(treeSet);
		
		// first() : 가장 앞에 있는 값 / last() : 가장 뒤에 있는 값
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		// headSet(값)  / teilSet(값) : 값 기준으로 앞쪽 / 뒷쪽 값을 출력
		System.out.println(treeSet.headSet(20)); // 기준값 보다 작은거
		System.out.println(treeSet.tailSet(20)); // 기준값 보다 큰거
		
		// subSet(start, end) : 범위의 값 출력 (끝값은 미포함)
		System.out.println(treeSet.subSet(10, 20));
		
	}

}
