 class student{
       
	        private int rno;
			 private String name;
			 
			   student()
			   {
			        rno=100;
					  name="satish";
					    System.out.println("constructor is calling");
					  
					  }
					  
					   student( int rno, String name)
			   {
			        this.rno=rno;
					 this.name=name;
					    System.out.println("constructor is calling with parameter");
					  
					  }
			 
			void setdata(int a,String b)
			 {
			     rno=a;
				   name=b;
				   
				 }
				  
			void showdata( )
			 {
			    System.out.println("value of roll no="+ rno);
				System.out.println("value of roll no="+   name);
				 
				   
			 }
			
 } 
 
    
    class q33{ static int c=1;
		
		 
		  public static void main( String  args[]){
			 
			  
				     student s1=new student( 100,"kkkk");
					   s1.setdata(10,"satish");
					   s1.showdata();
 
				 
				  System.out.println("static"+c);
				    System.out.println("static"+c);
					  System.out.println("static"+c);
				 
		  }
	}
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 