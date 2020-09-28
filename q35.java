 import java.util.*; 
 import java.lang.Math; 
 class mathoperation{
      
	        private int a;
			 private double b;	 
			    
				static int sum(int a,int b )
			{
			           
			       return a+b;
			}
			
			static int sub(int a,int b )
			{
			            
			       return a-b;
			}
			
			static int mul(int a,int b )
			{
			             
			       return a*b;
			}
			static double power(double a,double b )
			{
			          
			       return (Math.pow(a,b));
			}
				
			 
 } 
 
    
    class q35{  
 	 	  public static void main( String  args[]){
			  Scanner sc=new Scanner(System.in);
			    System.out.println("enter first number");
				      int a=sc.nextInt();
				System.out.println("enter second number");
					   int b=sc.nextInt();
					 mathoperation m1=new mathoperation();
                            int add= mathoperation.sum( a,b);
                            int sub=  mathoperation.sub( a,b);	
                             int mul=  mathoperation.mul( a,b);	
                             double pow=  mathoperation.power( (double)a,(double)b);								   
                    System.out.println("  addition"+add);
					System.out.println(" substraction"+sub);
					System.out.println("multiplication"+mul);
					System.out.println("pwer"+pow);
 
				 
				  
				 
		  }
	}
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 