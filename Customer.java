package RestaurantManagement;
import java.util.*;
public class Customer {
	String c_name;
	int o_num;
	
	
	Customer(){
	
		c_name="";
		o_num=0;
	}
	void setter(){
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER CUSTOMER NAME:");
		c_name=sc.next();
		System.out.println("ENTER CUSTOMER ORDER NUMBER:");
		o_num=sc.nextInt();
		
	}
	void display(){
		
		System.out.println("CUSTOMER NAME : "+c_name);
		System.out.println("CUSTOMER ORDER NUMBER : "+o_num);
	}
	
}
