package miniproject01;

public class Addr implements ShowData {
//	필드 , private로 캡슐화
	private String name;
	private String telNum;
	private String email;
	private String address;
	private String group;
	
	public Addr() {
		this.name=name;
		this.telNum=telNum;
		
	}
//	추상메소드
	@Override
	public void showData() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+telNum);
	}
		
	
	
//	get메소드, 변수값 얻기
	public String getName() {
		return name;
	}
	public String getTelNum() {
		return telNum;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getGroup() {
		return group;
	}
	
//set메소드 변수값 저장
	public void setName(String name) {
		this.name=name;
	}
	public void setTelNum(String telNum) {
		this.telNum=telNum;
		}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void setGroup(String group) {
		this.group=group;
	}
	
//	저장 정보 출력 메소드 
	public void printinfo() {
//		System.out.println("이름: "+name);
//		System.out.println("전화번호: "+telNum);
		System.out.println("이메일: "+email);
		System.out.println("주소: "+address);
//		System.out.println("그룹: "+group);
	}
	

	

}