  import java.util.*;
class employee{
     String empid;
	  String empname;
	   int salary;
	     employee( String empid,String empname,int salary )
		 {
		    this.empid=empid;
			  this.empname=empname;
			    this.salary=salary;
		 
		  }
		  }
   class q50a{
     public static void main(String args[]){
	    
		   employee e1=new employee("1","satish",500000);
		   employee e2= new employee("1","satish",500000);
		   employee e3=new employee("3","manoj",500000);
		   employee e4=new employee("4","prashant",500000);
		   employee e5=new employee("4","anna",500000);
	         employee err[]={e1,e2,e3,e4,e5};
			   Scanner sc=new Scanner( System.in);
			       
				  for(int i=0;i<err.length;i++)
				  {  int fga=0;
					    for(int j=0;j<err.length;j++){
							
							 
							if(i==j)
							{
								continue;
							}
							if(err[i].empid.equals(err[j].empid))
							{  fga=1;}
				  }
				    if(fga==1){
				   System.out.println( " err[i]="+err[i].empid);
				  }}
				  for(int k=0;k<err.length;k++)
				  {
					    System.out.println(err[k].empid);
						System.out.println(err[k].empname);
						System.out.println(err[k].salary);
						System.out.println("============");
				  }
	 }
   }