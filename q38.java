 class employee{
 
 
         int empno;
		   int totalsal;
		     int  salary;
			 employee(int empno,int salary)
			   {
			       this.empno=empno;
				    this.salary=salary;
                     this.totalsal=this.empno*this.salary;					
				 }
               void display()
			   {
			      System.out.println("totalsal"+totalsal);
				  System.out.println("empno"+empno);
	 
	            }
	 
	}
	
	 
	
	public class q38{
		  static int emp=100;
	  public static void main(String[] args){
	  employee e1=new employee(emp++,2000);
	       e1.display();
		    employee e2=new employee(emp,2000);
		  e2.display();
		 }
		 }
	
	
	