import java.util.*; 
public class  oddevensum{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			    int arr1[]=new int[5];
				 int arr2[]=new int[5];
				int arr[]={10,56,15,23,12};
				int even=0;int odd=0;
				   for(int i=0;i<5;i++)
				   {
				      if(arr[i]%2==0)
					   {
					     arr1[i]=arr[i];
						 }
						 
				      if(arr[i]%2==1)
					   {
					     arr2[i]=arr[i];
						 }
				   }
				   for(int i=0;i<5;i++)
				   {
				       even=even+arr1[i];
					    odd=odd+arr2[i];
				   }
			   System.out.println("sum of even="+even);
			     System.out.println("sum of odd="+odd);
}
}