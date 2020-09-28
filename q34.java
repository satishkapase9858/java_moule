 import java.util.*; 
 class circle{
       Scanner sc=new Scanner(System.in);
	        private int radius;
			 private double area	;
			    
					   
			void init()
			 { 
			          radius=sc.nextInt();
				 }
				 
			  void calarea()
			  {
				   
				   area=3.14*radius*radius;
			  }
				  
			void showdata( )
			 {
			    System.out.println("value of roll no="+area );
				 
				 
				   
			 }
			
 } 
 
    
    class q34{  
		
		 
		  public static void main( String  args[]){
			 
			  
				      circle c1=new circle();
					   c1.init();
					   c1.calarea();
					   c1.showdata();
 
 
				 
				  
				 
		  }
	}
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 