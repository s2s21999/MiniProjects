package miniproject01;

public class CustomerAddr extends Addr {
	String customerName;
	String items;
	String customerPosition;
	
	public String getCustomerName() {
		return customerName;
	}
	public String getitems() {
		return items;
	}
	
	public String getcustomerPosition() {
		return customerPosition;
	}
	
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setItems(String items) {
		this.items = items;
	}
	
	public void setCustomerPosition(String customerPosition) {
		this.customerPosition = customerPosition;
	}
	
	@Override
	public void showData() {
		super.showData();
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getTelNum());
	}
	
	@Override
	public void printinfo() {
		super.printinfo();
		System.out.println("고객 이름: " + customerName);
		System.out.println("구매 품목: " + items);
		System.out.println("직책: " + customerPosition);
	}
}
