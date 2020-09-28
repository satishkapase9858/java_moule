class employee{
     int empid;
	  String empname;
	   int salary;
	     employee( int empid,String empname,int salary )
		 {
		    this.empid=empid;
			  this.empname=empname;
			    this.salary=salary;
		 
		  }
		  }
   class q50{
     public static void main(String args[]){
	    
		   employee e1=new employee(1,"satish",500000);
		   employee e2=new employee(1,"abhi",500000);
		   employee e3=new employee(3,"manoj",500000);
		   employee e4=new employee(4,"prashant",500000);
		   employee e5=new employee(4,"anna",500000);
	         employee earr[]={e1,e2,e3,e4,e5};
			 
			  for(int i=0;i<earr.length;i++)
			  {  int flag=0;
				  for(int j=0;j<earr.length;j++)
				  {   if(i==j)
					  {
						  j=++j;
						  
					  }
					   if(i==5 &&j==5)
					   {
						   --j;
					   }
					  
					  if(earr[i].empid==earr[j].empid)
					  {
						    flag=1;
							 
					  }
					  
				  }
				    if(flag==1)
				    System.out.println("alreay existed=="+earr[i].empid);
				  
				  
			  }
	 
	 }
   }