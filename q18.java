import java.util.*; 
class  q18{
 
 public static void main(String args[])
		 {
		      int flag=0;
		      Scanner sc=new Scanner(System.in);
			 
				 int number=sc.nextInt();
				  
				 for(int i=2;i<number/2;i++)
				 { 
				    if(number%i==0)
					{
					   flag=1;
					   break;
			           }
				   	     
			  }
			  if(flag==0)
			    {
				  System.out.println("given number is  prime number"+number);
				  }
				  else
				  {
				  
				  System.out.println("given not number is prime number"+number);
				  }
				    
}
}