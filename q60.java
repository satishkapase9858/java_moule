import java.util.*;
  class InvalidFeeException extends RuntimeException{
	  InvalidFeeException(){
		   super("++++++");
	  }
  }	  
interface studentfee  {
    int fee=0;
    void getfee(); 


}

class student implements studentfee {
   String name;
    int fee;
  
         public void  getfee()    
		 {  Scanner sc=new Scanner(System.in);
		       name="jjj";
		    int fee=sc.nextInt();
              		 if(fee>2000 || fee<0)
					  {
					    throw new InvalidFeeException();
					  }
		 }
 
}
class q60{

  public static void main(String args[]){
  
          student s1 =new student();
          try{
		  s1.getfee();
          }catch(InvalidFeeException e){
			  
			  System.out.println("invalid entry in fee column");
		  }
			  
}
}