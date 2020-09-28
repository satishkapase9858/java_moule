abstract class processer{
   int member;
       processer()
	   {
		   member=156;
	   }
          abstract void process();
		    void show()
			{
			    System.out.println(" "+member);
				}
}
class factorial extends processer{
              int fact;
			     factorial()
				 {
				      fact=244;
				 }
           void process(){
		       System.out.println (" factorial="+super.member+fact);
		   
		         }
		     }
			 
	class circle extends processer{
       int area;
	       circle()
		   {
		       area=3000;
		   }
          void process(){
		    System.out.println ("area of circle"+(super.member+area));
		   
		   
		   }
		   }
		   
	class q48{
                  public static void main( String args[])
				  {
                   // circle c1=new circle();
					 // c1.process();
					   processer p1=new circle();
					   p1.process();
				  }
	}



					  
		   
		   
		   
	 			 			