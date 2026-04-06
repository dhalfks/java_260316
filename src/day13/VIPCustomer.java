package day13;

public class VIPCustomer extends Customer {
	/* - VIP : 제품 구입시 할인 10% / 보너스 포인트 적립 5%
	 * - VIP 등급은 전담 상담사 멤버변수를 추가(agentName, agentNum)*/
	private double saleRatio;
	private String agentName;
	private String agentNum;
	
	public VIPCustomer() {}
	public VIPCustomer(String id, String name, String agentName, String agentNum) {
		super(id, name); // 부모 생성자 호출
		super.setCustomerGrade("VIP");
		super.setBonusRatio(0.05);
		this.saleRatio = 0.1;
		this.agentName = agentName;
		this.agentNum = agentNum;
	}
	
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		return  price - (int)(price * saleRatio);
	}
	
	@Override
	public void printInfo() {
		// 기존 출력 내용은 유지
		// - 전담 상담사는 짱구이고, 번호는 1111입니다. <- VIP만
		super.printInfo();
		System.out.println("전담 상담사는 "+agentName+"이고, 번호는 "+agentNum+"입니다.");
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentNum() {
		return agentNum;
	}
	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}
	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentName=" + agentName + ", agentNum=" + agentNum + "]";
	}
	
	
}
