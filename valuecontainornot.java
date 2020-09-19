import java.util.*; 
public class  valuecontainornot{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			       
				int arr1[]={1,3,5,6,7,9};
				 
				System.out.println("enter the number for finding ");
				   int number=sc.nextInt();
				   
				   int flag=1;
				   for(int i=0;i<arr1.length;i++)
				   {    
				         
					     if(arr1[i]==number)
						   {
						      System.out.println("value is present");
							    flag=0;
								}
				        
						  
					      					 
						 
						 
					  }
					    if(flag==1)
						    {
							System.out.println("value is not  present");
						  }
						  
				        
				   
				    
				     
				    
			   
}
}