  import java.util.*; 
class  greater{
  
         public static void main(String args[])
		 {
		 
		      Scanner sc=new Scanner(System.in);
			    int p=sc.nextInt();
				 int q=sc.nextInt();
				  int r=sc.nextInt();
				 
				 
				 if(p>q && p>r)
				   {
				     System.out.println( " value="+p+" is greter tehn all three");
				     
				   }
				   else if(q>p && q>r)
				   {
				     System.out.println( " value="+q+" is greter tehn all three");
				     
				   }
				   
				     else if(r>p && r>q)
				   {
				     System.out.println( "  value="+r+" is greter tehn all three");
				     
				   }
				 else
				 {
				  System.out.println( "values are mismatched");
				  }
				    
			   
			  			     
			  }
}