package day11;

public class Order {
	// 주문(Order) class : 상품, 개수, 가격(판매금액), 금액(개수*가격)
	// 멤버변수
	private String name; // 상품명
	private int price; // 판매가격
	private int count; // 주문수량
	private int total; // 수량 * 가격
	
	public Order() {}
	public Order(String name, int price, int count) {
		this.name=name;
		this.price = price;
		this.count = count;
		totalCalc();
	}
	
	// total 계산 메서드
	public void totalCalc() {
		this.total = this.price * this.count;
	}
	
	// 주문 추가 메서드 
	public void insertOrder(String name, int price, int count) {
		this.name=name;
		this.price = price;
		this.count = count;
		totalCalc();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "[" + name + "  " + count + "  " + price + " => " + total + "]";
	}	

}
