import java.util.*; 
public class  minmax{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			       
				int arr[]={1,5,8,7,6,5};
				 
				 
				System.out.println("enter the number for finding ");
				  
				   
				   int flag=1;
				   int z=arr.length;
				   for(int i=0;i<arr.length;i++)
				   {    
				        for(int j=0;j<arr.length;j++)
						{
					     if(arr[i]<arr[j])
						   {
						      flag=arr[j];
                                arr[j]=arr[i];
							  arr[i]=flag;
							      							  
							}
				        
						  }
					      					 
						 
						 
					  }
					     
						    
							System.out.println("min="+arr[0]);
							System.out.println("max="+arr[z-1]);
							 
				        
				   
				    
				     
				    
			   
}
}