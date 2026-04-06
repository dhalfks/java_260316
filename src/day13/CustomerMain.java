package day13;

public class CustomerMain {

	public static void main(String[] args) {
		// 백화점 고객
		/* - 일반고객(적립) / Gold 고객(할인+적립) / VIP 고객(할인+적립)
		 * 
		 * 고객 => Customer (부모)
		 * - 멤버변수 : 고객ID, 고객명, 등급, 보너스포인트(적립), 적립비율
		 * 
		 * - 기본 등급 : Silver
		 * - 기본 적립비율 : 구매금액의 1% 적립
		 * 
		 * 등급 
		 * Silver(기본) / Gold / VIP
		 * - Silver : 제품 구입시 할인 0% / 보너스 포인트 적립 1%
		 * - Gold : 제품 구입시 할인 5% / 보너스 포인트 적립 3%
		 * - VIP : 제품 구입시 할인 10% / 보너스 포인트 적립 5%
		 * - VIP 등급은 전담 상담사 멤버변수를 추가(agentName, agentNum)
		 * 
		 * 1. 보너스 적립 계산 메서드
		 * - 구매금액의 적립 보너스 계산 => 누적 적립
		 * - 보너스 적립, 할인여부도 체크하여 구매 금액을 리턴
		 * 
		 * 2. 출력
		 * - 홍길동님은 VIP고객이며, 현재 보너스포인트는 5000점입니다.
		 * - 전담 상담사는 짱구이고, 번호는 1111입니다. <- VIP만
		 * 
		 * */
		
		Customer[] customer = new Customer[10];
		customer[0] = new VIPCustomer("1111", "홍길동","순이","1002");
		customer[1] = new GoldCustomer("2222", "최순자");
		customer[2] = new VIPCustomer("3333","박순철","영이","1001");
		customer[3] = new Customer("4444", "최길동");
		customer[4] = new GoldCustomer("5555", "김길동");
		customer[5] = new Customer("6666", "황길동");
		customer[6] = new Customer("7777", "고길동");
		customer[7] = new GoldCustomer("8888", "이순신");
		customer[8] = new VIPCustomer("9999", "김순신","영이","1001");
		customer[9] = new Customer("1110", "최순신");
		
		System.out.println("-지불금액과 포인트 계산 출력-");
		
		int price = 100000;
		for(int i=0; i<customer.length; i++) {
			int salePrice = customer[i].calcPrice(price); // 각자 보너스 계산
			customer[i].printInfo();
			System.out.println("지불금액: "+salePrice+"원");
		}
		
		System.out.println("-----------------");
		price = 150000;
		for(int i=0; i<customer.length; i++) {
			int salePrice = customer[i].calcPrice(price); // 각자 보너스 계산
			customer[i].printInfo();
			System.out.println("지불금액: "+salePrice+"원");
		}
		
		// 다운 캐스팅 사용예시
		// 상담사 영이(1001) => 철이(1003)
		for(int i=0; i<customer.length; i++) {
			if(customer[i] instanceof VIPCustomer) {
				// VIP 고객이라면... (다운 캐스팅)
				VIPCustomer vip = (VIPCustomer)customer[i];
				if(vip.getAgentName().equals("영이")) {
					vip.setAgentName("철이");
					vip.setAgentNum("1003");
				}
			}
		}
		
		
		// VIP고객 리스트
		System.out.println("--VIP 고객정보 리스트--");
		for(int i=0; i<customer.length; i++) {
			if(customer[i] instanceof VIPCustomer) {
				customer[i].printInfo();
			}
			
//			if(customer[i].getCustomerGrade().equals("VIP")) {
//				
//			}
		}
		
		
		// ClassCastException 예외발생
		GoldCustomer gold = (GoldCustomer)customer[0];
		System.out.println(gold);
		
		

	}

}
