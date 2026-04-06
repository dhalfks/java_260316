package day13;

public class Customer {
	// 멤버변수 : 고객ID, 고객명, 등급, 보너스포인트(적립), 적립비율
	
	/* 등급 
	 * Silver(기본) / Gold / VIP
	 * - Silver : 제품 구입시 할인 0% / 보너스 포인트 적립 1%
	 * - Gold : 제품 구입시 할인 5% / 보너스 포인트 적립 3%
	 * - VIP : 제품 구입시 할인 10% / 보너스 포인트 적립 5%
	 * - VIP 등급은 전담 상담사 멤버변수를 추가(agentName, agentNum)
	 * */
	private String customerID;
	private String customerName;
	private String customerGrade; // 등급
	private int bonusPoint; 
	private double bonusRatio; // 적립비율
	
	// 생성자, getter/setter, toString
	public Customer() {
		
	}
	public Customer(String customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	
	// 메서드
	// 구매금액 보너스 포인트 누적 => 결제 금액 리턴
	// 매개변수 : 구매금액 => int price
	// 리턴타입 : 결제금액 리턴 => int
	public int calcPrice(int price) {
		int point = (int)(price * bonusRatio);
		this.bonusPoint += point;
		// 실버등급은 할인율이 없음. 
		return price;
	}
	
	// 출력메서드
	// - 홍길동님은 VIP고객이며, 현재 보너스포인트는 5000점입니다.
	public void printInfo() {
		System.out.print(customerName+"님은 "+customerGrade+"고객이며, ");
		System.out.println("현재 보너스포인트는 "+ bonusPoint+"점입니다.");
	}
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
}
