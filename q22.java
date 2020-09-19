import java.util.*; 
public class  q22{
 
 public static void main(String args[])
		 {
		     
		      Scanner sc=new Scanner(System.in);
			    //int arr[]=new int[5]
				int arr[]={10,56,15,23,12};
				int a;
				
		 	       int i=0;int j=0;int o=0;
				   
				     int min;
				   
			   while(j<5)
				   
				   {  
				      for(int k=0;k<5;k++)
					  {
                           if(arr[j]>arr[k])
						   {
						      a= arr[j];
							  arr[j]=arr[k];
							   arr[k]=a;
						   }
						   
					  }
						  
						  
						  
						 j++;
						 
						 
			         }
				    
					while( o<5)
				   
				   {
                           System.out.println(arr[o]);
						   o++;
			      }
}
}