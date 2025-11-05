package miniproject01;
import java.util.Scanner;

public class SmartPhoneMain {
   public static void printMenu() {
      System.out.println("==== 주소록 메뉴 ====");
      System.out.println(">>1. 주소 입력 (회사)");
      System.out.println(">>2. 주소 입력 (거래처)");
      System.out.println(">>3. 전체 주소 출력");
      System.out.println(">>4. 주소 검색");
      System.out.println(">>5. 주소 삭제");
      System.out.println(">>6. 주소 수정");
      System.out.println(">>7. 프로그램 종료");
      System.out.println("====================");
   }

   public static void main(String[] args) {
      SmartPhone smartphone = new SmartPhone();
      Scanner in = new Scanner(System.in);
      
      while(true) {
         printMenu();
         int choice = in.nextInt();
         in.nextLine();  // 개행 제거
         
         if(choice == 1) {
            System.out.print("이름: ");
            String name = in.nextLine();
            System.out.print("전화번호: ");
            String telNum = in.nextLine();
            System.out.print("이메일: ");
            String email = in.nextLine();
            System.out.print("주소: ");
            String address = in.nextLine();
            System.out.print("회사 이름: ");
            String companyName = in.nextLine();
            System.out.print("부서 이름: ");
            String companyUnit = in.nextLine();
            System.out.print("직책: ");
            String companyPosition = in.nextLine();
            
            CompanyAddr companyaddr = new CompanyAddr();
            companyaddr.setName(name);
            companyaddr.setTelNum(telNum);
            companyaddr.setEmail(email);
            companyaddr.setAddress(address);
            companyaddr.setCompanyName(companyName);
            companyaddr.setCompanyUnit(companyUnit);
            companyaddr.setCompanyPosition(companyPosition);
            
            smartphone.addAddr(companyaddr);
            continue;
            
         } else if(choice == 2) {
            System.out.print("이름: ");
            String name = in.nextLine();
            System.out.print("전화번호: ");
            String telNum = in.nextLine();
            System.out.print("이메일: ");
            String email = in.nextLine();
            System.out.print("주소: ");
            String address = in.nextLine();
            System.out.print("거래처 이름: ");
            String customerName = in.nextLine();
            System.out.print("거래 품목: ");
            String items = in.nextLine();
            System.out.print("직책: ");
            String customerPosition = in.nextLine();
            
            CustomerAddr customeraddr = new CustomerAddr();
            customeraddr.setName(name);
            customeraddr.setTelNum(telNum);
            customeraddr.setEmail(email);
            customeraddr.setAddress(address);
            customeraddr.setCustomerName(customerName);
            customeraddr.setItems(items);
            customeraddr.setCustomerPosition(customerPosition);
            
            smartphone.addAddr(customeraddr);
            continue;
            
         } else if(choice == 3) {
            smartphone.printAllAddr();
            continue;
         
         } else if(choice == 4) {
            System.out.print("검색할 이름을 입력하세요: ");
            String name = in.nextLine();
            smartphone.searchAddr(name);
            continue;
            
         } else if(choice == 5) {
            System.out.print("삭제할 이름을 입력하세요: ");
            String name = in.nextLine();
            smartphone.deleteAddr(name);
            continue;
            
         } else if(choice == 6) {
            System.out.print("수정할 이름을 입력하세요: ");
            String name = in.nextLine();
            
            System.out.println("새 정보를 입력하세요.");
            System.out.print("이름: ");
            String newName = in.nextLine();
            System.out.print("전화번호: ");
            String newTel = in.nextLine();
            System.out.print("이메일: ");
            String newEmail = in.nextLine();
            System.out.print("주소: ");
            String newAddress = in.nextLine();
            System.out.print("회사 or 거래처: ");
            String c = in.nextLine();
            
            if("회사".equals(c)) {
            	CompanyAddr newCompanyAddr = new CompanyAddr();
                System.out.print("회사 이름: ");
                String newCompanyName = in.nextLine();
                System.out.print("부서 이름: ");
                String newCompanyUnit = in.nextLine();
                System.out.print("직책: ");
                String newCompanyPosition = in.nextLine();
                
                newCompanyAddr.setCompanyName(newCompanyName);
                newCompanyAddr.setCompanyUnit(newCompanyUnit);
                newCompanyAddr.setCompanyPosition(newCompanyPosition);
            } else if("거래처".equals(c)) {
            	CustomerAddr newCustomerAddr = new CustomerAddr();
            	System.out.print("거래처 이름: ");
            	String newCustomerName = in.nextLine();
            	System.out.print("거래 품목: ");
            	String newItems = in.nextLine();
            	System.out.print("직책: ");
            	String newCustomerPosition = in.nextLine();

                newCustomerAddr.setCustomerName(newCustomerName);
                newCustomerAddr.setItems(newItems);
                newCustomerAddr.setCustomerPosition(newCustomerPosition);
            }
            
            Addr newAddr = new Addr();
            newAddr.setName(newName);
            newAddr.setTelNum(newTel);
            newAddr.setEmail(newEmail);
            newAddr.setAddress(newAddress);
            
            smartphone.editAddr(name, newAddr);
            continue;
            
         } else if(choice == 7) {
            System.exit(0);
         } else {
            System.out.println("잘못된 입력입니다.");
         }
      }
   }
}
