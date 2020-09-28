import java.util.*; 
public class q30a{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			       
				 
				int two[][]=new int[3][3];
				     int sum=0;
				   for(int i=0;i<two.length;i++)
				   {    
				        
						for(int j=0;j<two[i].length;j++)
						{   
           					System.out.println("enter number");
					        int a= sc.nextInt();
						    two[i][j]=a;
						   
						   }
						   
					}
						 
						

						for(int i=0;i<two.length;i++)
				   {    
				        for(int j=0;j<two[i].length;j++)
						{ 
                                sum=sum+two[i][j];
						
						   }
						    
					}
					System.out.println("sum="+sum);
						
						
						 
				    
			   
}
}