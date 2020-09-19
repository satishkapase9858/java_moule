import java.util.*; 
public class q21{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			    int arr[]=new int[5];
				int sum=0;
		 	       
				     for(int i=0;i<5;i++)
				   
				   {
                           
						  int num1=sc.nextInt();
						    arr[i]=num1;
						
						 
			      }
				  
				    for(int j=0;j<5;j++)
				   
				   {
                           
						   
						   sum=sum+arr[j];
						   
						
						 
			      }
				  System.out.println(sum);
				  System.out.print(sum/arr.length);
			  
}
}