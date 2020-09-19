 import java.util.*; 
class  interest{
  
         public static void main(String args[])
		 {
		 
		      Scanner sc=new Scanner(System.in);
			    long principal=sc.nextInt();
				int time=sc.nextInt();
				int rate=sc.nextInt();
				 
				 double interest= (principal*time*rate)/100; 
				 
				 
				 
			  System.out.println( "simple interest="+interest);
			   
			  
			  }
			  
			  }