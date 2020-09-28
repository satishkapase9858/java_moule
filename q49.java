interface taxable{
	    int salestax=7;
		  double incometax=10.5;
		    
		  void caltax();
}
class employee implements taxable{
	   int empid;
	   String name;
	    int salary;
		
		  employee()
		  {
			    empid=1;
				  name="satish";
				    salary=2000;
		  }
		   public void caltax()
			{
				double incometaxamount=((salary*12)/100)*incometax;
				  System.out.println("incometax of employee"+incometaxamount);
			}
				
}
class product implements taxable{
	   int pid;
	   int price;
	    int quantity;
		
		  product()
		  {
			    pid=1;
				  price=100;
				    quantity=2000;
		  }
		   public void caltax()
			{
				double salestaxamount=((price*quantity)/100)*salestax;
				  System.out.println("salestax of product"+salestaxamount);
			}
				
}
class q49{
	    public static void main(String args[])
		{
			   employee e1=new employee();
			      e1.caltax(); 
				  taxable p1=new product();
				    p1.caltax();
		}
}
				
				
				