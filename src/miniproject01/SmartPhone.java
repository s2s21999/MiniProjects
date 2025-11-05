package miniproject01;
import java.util.Scanner;
import java.util.ArrayList;

public class SmartPhone {

   Addr[] addrArray = new Addr[10];
   Addr companyaddr = new CompanyAddr();
   Addr cumtomeraddr = new CustomerAddr();
   
   int num = 0;
   
   ShowData a = new Addr();
   public void printContact() {
	   a.showData();
   }

   public Addr[] inputAddrData() {
      return addrArray;
   }

   public void addAddr(Addr Addr) {
      if(num < addrArray.length) {
         addrArray[num] = Addr;
         num++;
      } else {
         System.out.println("주소록이 가득 찼습니다.");
      }
   }

   public void printAllAddr() {
      for(int i = 0; i < addrArray.length; i++) {
         if(addrArray[i] != null){
               addrArray[i].printinfo();
         }
      }
   }
      
   public void searchAddr(String name) {
      for(int i = 0; i < addrArray.length; i++) {
         if(addrArray[i] != null && addrArray[i].getName().equals(name)) {
             addrArray[i].printinfo();
         }
      }
   }
   
   public void editAddr(String name, Addr newAddr) {
	    boolean found = false;
	    for (int i = 0; i < num; i++) {
	        if (addrArray[i].getName().equals(name)) {
	            addrArray[i] = newAddr;
	            found = true;
	            System.out.println("주소록이 수정되었습니다.");
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("해당 이름의 주소록을 찾을 수 없습니다.");
	    }
   }

   public void deleteAddr(String name) {
	    boolean found = false;
	    for (int i = 0; i < num; i++) {
	        if (addrArray[i].getName().equals(name)) {
	            for (int j = i; j < num - 1; j++) {
	                addrArray[j] = addrArray[j + 1];
	            }
	            addrArray[num - 1] = null;
	            num--;
	            found = true;
	            System.out.println("주소록이 삭제되었습니다.");
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("해당 이름의 주소록을 찾을 수 없습니다.");
	    }
   }
}
