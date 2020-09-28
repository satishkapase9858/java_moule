 import java.util.*;
 
 class product{
 
 
         int pid;
		   int price;
		     int  quantity;
			 product(int pid,int price,int quantity )
			   {
			       this.pid=pid;
				    this.price=price;
                     this.quantity=quantity;					
				 }
               void show()
			   {
				   
				   System.out.println(pid);
			   }
	            static void shocal( product arr[])
				{
					   int a=  arr[0].price * arr[0].quantity;
					     System.out.println(" valur of toyto "+a);
				}
	}
	
	 
	
	public class q39{
		  
	  public static void main(String[] args){
		    Scanner sc=new Scanner(System.in);
	     product  arr[]=new product[3];
		    for(int i=0;i<arr.length;i++)
			{
                 System.out.println("enter the pid");
				   int pid=sc.nextInt();
				   System.out.println("enter the price");
				   int price=sc. nextInt();
				System.out.println("enter the quantity");
				   int quantity=  sc. nextInt();
	                 product p1=new product( pid,price,quantity);
					   arr[i]=p1;
			}
			 
               
		           if(arr[0].pid>arr[1].pid  &&arr[0].pid>arr[2].pid)
				   {
					   System.out.println(arr[0].pid);
				   }
				   else if(arr[1].pid>arr[0].pid  &&  arr[1].pid>arr[2].pid)
				   {
					   System.out.println(arr[1].pid);
				   }
				   else {
					      System.out.println("arr[2] is gretatter than all"+arr[2].pid+""+arr[2].price);
				   }
				   
				    product.shocal(arr);
			 
		 }
		    
		 }
	
	
	