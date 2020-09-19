import java.util.*; 
public class  twotime{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			       
				int arr1[]={1,3,5,6,7,9};
				int arr2[]=new int[arr1.length*3]; 
				  
				 
				   
				  int k=0;
				 
				   for(int i=0;i<arr1.length;i++)
				   {    
				       
				        
						  arr2[k++]=arr1[i];
						  arr2[k++]=arr1[i];
						   arr2[k++]=arr1[i];
						  
					      					 
						 
						 
					  }
					  for(int i=0;i<arr2.length;i++)
				   {    
				       
				        
						 System.out.println( arr2[i] );
						   
						  
					      					 
						 
						 
					  }
						 
						  
				        
				   
				    
				     
				    
			   
}
}