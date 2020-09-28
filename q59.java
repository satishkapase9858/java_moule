class voter{
   int vtrid;
     String name;
	   int age;
	   
	       voter(int vtrid,String name,int age)
		   {
			     if(age<18)
				 {
					 throw new ArithmeticException(" invalid age for voter");
				 }
		   this.vtrid=vtrid;
             this.name=name;
				this.age=age;			 
		   
		   }
		   
}
     class q59{
	 
	      public static void main(String args[]){
		  
		       voter v1=new voter(011,"satish",17);
		  
		  }
		  }