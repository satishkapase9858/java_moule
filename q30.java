import java.util.*; 
public class  q30{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			    int num1=sc.nextInt();
				 int num2=sc.nextInt();
		 	   
				   while(num1<=num2)
				   {
                       int flag=0;
                     for(int j=2;j<=num1/2;j++)
                        {
                          if(num1%j == 0)
                           {
                             flag=1;
							 
							   break;
							  
							}
							
							
				   	     }
						  if(flag==0)
						   {
						       System.out.println(num1);
						   }
						num1++;
						
						 
			      }
			   
}
}