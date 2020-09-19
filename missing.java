import java.util.*; 
public class  missing{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			      // arr[]=new int[10]; 
				int arr[]={1,3,5,6,7,9};
				 int arr1[]={1,2,3,4,5,6,7,8,9};
				 
				   
				int even=0;int odd=0;int k=0;
				int arr2[]=new int[10];
				   for(int i=0;i<arr1.length;i++)
				   {   int flag=0;
				      for(int j=0;j<arr.length;j++)
					  {
				        
						  if(arr1[i]==arr[j])
					     {
						   flag=1;
					     }						 
						 
						 
					  }
						 
						 if(flag==0)
						 {
							 System.out.println(arr1[i]);
						 }
				        
				   }
				    
				     
				    
			   
}
}