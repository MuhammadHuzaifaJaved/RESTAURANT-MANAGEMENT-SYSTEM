package RestaurantManagement;
import java.util.*;
import java.io.*;
public class test {

	public static void main(String[] args) {
		
		Restaurant r=new Restaurant();
		r.display();
		
		FoodOrder[] O=new FoodOrder[10];
		for(int i=0;i<10;i++){
			O[i]=new FoodOrder();}
		
			Customer[] C=new Customer[10];
			for(int i1=0;i1<10;i1++){
				C[i1]=new Customer();
		}
		int to=0;
		int z=0;
	
				try {
			File F=new File("food.txt");
			Scanner input = new Scanner(F);
			to=input.nextInt();
			for(int i1=0;i1<to;i1++){
				C[i1].o_num=input.nextInt();
				C[i1].c_name=input.next();
				O[i1].quantity=input.nextInt();
				O[i1].total=input.nextInt();
			}
		} 
		
			
			
			
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int choice;
		while (z==0){
		Scanner sc=new Scanner(System.in);
		System.out.println("1) MANAGE DATA");
		System.out.println("2) SEARCH DATA");
		System.out.println("3) DATA REPORTS");
		System.out.println("4) TERMINATE PROGRAM");
		System.out.println("ENTER YOUR CHOICE :");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			int a=0;
			int choice1=0;
			while(a==0){
				 Scanner sc1=new Scanner(System.in);
				System.out.println("1) ADD ORDER");
				System.out.println("2) DISPLAY ORDER");
				System.out.println("3) UPDATE ORDER");
				System.out.println("4) DELETE ORDER");
				System.out.println("5) GO TO MAIN MENU");
				System.out.println("ENTER YOUR CHOICE :");
				choice1=sc1.nextInt();
				switch(choice1){
				case 1:
					if(to<10){
					O[to].displayMenu();
					C[to].setter();
					O[to].order();
					to++;
					System.out.println(to);
					}
					else{
						System.out.println("CAN'T REGISTER MORE ORDERS :");
					}
					break;
				case 2:
					for(int i1=0;i1<to;i1++){
						System.out.println("ORDER NUMBER: "+C[i1].o_num);
						System.out.println("CUSTOMER NAME: "+C[i1].c_name);
						System.out.println("TOTAL BILL: "+O[i1].total);
					}
								
						
					
					break;
				case 3:
					if(to==0){
						System.out.println("LIST IS EMPTY");
					}
					else {
						int m;
						System.out.println("ENTER ORDER NUMBER");
						m=sc.nextInt();
						boolean check=true;
						for(int i1=0;i1<to;i1++){
							if(C[i1].o_num==m){
								C[i1].setter();
								check=false;
							}
						if(check){
							System.out.println("NO DATA FOUND");
						}
							}
						
						}
					
					break;
				case 4:
					if(to==0){
						 System.out.print("lIST IS EMPTY");
					}
					else{
						
						int m;
						System.out.println("ENTER ORDER NUMBER");
						m=sc.nextInt();
						boolean check=true;
						for(int i1=0;i1<to;i1++){
							if(C[i1].o_num==m){
								C[i1]=new Customer();
								check=false;
							}
						if(check){
							System.out.println("NO DATA FOUND");
						}
						
							
							
						
							}
					}
					to--;
					System.out.println("ORDER HAS BEEN DELETED");
				break;
				case 5:
					System.out.println("MAIN MENU");
					a=1;
					
						break;
				default:
					System.out.println("ENTER CORRECT CHOICE");
					break;
		}	
		}
			
			
			
			try {
				Writer w=new FileWriter("food.txt");
				w.write(to+"\n");
				for(int i1=0;i1<to;i1++){
					w.write(C[i1].o_num+" "+C[i1].c_name+" "+O[i1].quantity+" "+O[i1].total+"\n");
				}		
				w.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		case 2:
			System.out.println("WELLCOME TO SEARCH DATA MANAGMENT");
			int s=0;
			
			if(to!=0){
				System.out.println("ENTER ORDER NUMBER YOU WANT TO SEARCH");
				s=sc.nextInt();
				System.out.println(to);
			for(int i1=0;i1<to;i1++){
			if(s==C[i1].o_num){
				C[i1].display();
				
			}
			}
		}
			else{
				System.out.println("No order found");
			}
			break;
		case 3:
			System.out.println("YOUR TOTAL ORDER REPORT ");
			if(to!=0){
			for(int i1=0;i1<to;i1++){
				
			C[i1].display();
			
				}	
			}
			else{
				System.out.println("THERE IS NO REPORT DATA TO SHOW");
			}
			break;
		case 4:
			System.out.println("PROGRAM TERMINATED");
			z=1;
			break;
			default :
				System.out.println("INVALID CHOICE");
				break;
		}
		
	}	
		

	
}
}