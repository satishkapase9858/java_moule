import java.util.*; 
class  grosssalary{
  
         public static void main(String args[])
		 {
		 
		      Scanner sc=new Scanner(System.in);
			   int salary=sc.nextInt();
			      int hra,da,gs;
			     if(salary<10000)
				 {
				     hra=  (salary*10)/100;
					 da=    (salary*90)/100;
					 gs=hra+da+salary;
				      System.out.println( "salary="+salary);
			        System.out.println( " gross salary="+gs);
			   
				 }
				 else{
					 hra=2000;
					  da=    (salary*98)/100;
					  gs=hra+da+salary;
					 System.out.println( "salary="+salary);
					  System.out.println( "hra="+hra);
			        System.out.println( " gross salary="+gs);
					 
				 }
					 
			  
			  }
			  
			  }
			  