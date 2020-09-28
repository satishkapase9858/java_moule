   class  person
      {
	      int pid;
		    person()
			{  // this(200);
			  pid=0;
			  System.out.println("parametrless constructo of super class");
			  }
			  person(int pid)
			  {  //this();
			     this.pid=pid;
				 System.out.println("parameter constructor of super class");
				 }
	}
	class employee extends person{
	               int empid;
		       employee()
			   {
			     empid=0;
				 System.out.println("parametrless constructo of employee class");
			   }
			    employee( int empid)
			   {   super(30);
			     this.empid=empid;
				 System.out.println("parametrless constructo of employee class");
			   }
			   
		}
		class q47{
                public static void main( String  args[]){
                      employee ep= new employee(300);
					     
					  //  person p=new person(45);
						 
}  
}					  
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   