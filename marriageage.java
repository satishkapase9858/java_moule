import java.util.*; 
class  marriageage{
  
         public static void main(String args[])
		 {
		 
		      Scanner sc=new Scanner(System.in);
			     char gender=sc.next().charAt(0);
				 int age=sc.nextInt();
				  
				 
				 
				 if((gender=='m' && age>21)||(gender=='f' && age>18))
				   {
				     System.out.println( "eligible for marrage");
				     
				   }
				   else 
				   {
				     System.out.println( " not eligible");
				     
				   }
				   
				    
			   
			  			     
			  }
}