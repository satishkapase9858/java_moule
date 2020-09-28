 import java.util.*; 
 class overload{
       Scanner sc=new Scanner(System.in);
	        private int radius;
			 private double area	;
			    
					   
			void multiply(int a,double b)
			 { 
			            double  mul=a*b;
			          System.out.println("multiply by float"+mul);
				 }
				void multiply(int a,int b)
			 { 
			            int  mul=a*b;
			          System.out.println("multiply by float"+mul);
				 }
				 void multiply(double a,double b,double c)
			 { 
			            double mul=a*b*c;
			          System.out.println("multiply by float"+mul);
				 }
				 void multiply(int arr[])
			 { 
			            int  mul=arr[0]*arr[1];
			          System.out.println("multiply by array"+mul);
				 }
				 
			  
				  
			 
			
 } 
 
    
    class q36{  
		
		 
		  public static void main( String  args[]){
			 
			  
				      overload o1=new overload();
					   o1.multiply(10,12.5);
					   o1.multiply(10,12);
					   o1.multiply(10.5,10.5,12.5);
 
                      int a[]=new int[]{10,12,13,14,15};
				 o1.multiply( a);
				  
				 
		  }
	}
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 