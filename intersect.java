import java.util.*; 
public class  intersect{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			     
				int arr[]={10,56,15,23,12};
				int arr1[]={40,56,78,23,45};
				   
				int even=0;int odd=0;int k=0;
				int arr2[]=new int[5];
				   for(int i=0;i<5;i++)
				   {
				      for(int j=0;j<5;j++)
					  {
				      if(arr[i]==arr1[j])
					   {
					     arr2[k]=arr[i];
						 k++;
						}
						 
				       }
				   }
				   for(int j=0;j<arr2.length;j++)
				   {
					    if(arr2[j]==0)
						{
							 continue;
						}
				     System.out.println(arr2[j]);
				   }
			   
}
}