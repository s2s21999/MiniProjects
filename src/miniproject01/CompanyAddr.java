package miniproject01;

public class CompanyAddr extends Addr {
	String companyName;
	String companyUnit;
	String companyPosition;
	
	public String getCompanyName() {
		return companyName;
	}
	public String getCompanyUnit() {
		return companyUnit;
	}
	
	public String getCompanyPosition() {
		return companyPosition;
	}
	
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setCompanyUnit(String companyUnit) {
		this.companyUnit = companyUnit;
	}
	
	public void setCompanyPosition(String companyPosition) {
		this.companyPosition = companyPosition;
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
		System.out.println("회사 이름: " + companyName);
		System.out.println("부서 이름: " + companyUnit);
		System.out.println("직책: " + companyPosition);
	}
}
