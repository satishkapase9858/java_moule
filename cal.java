class cal{
  
     public static void main(String args[]){
	 
	    int y;
		int x=10;
		 int z;
		y=x*x+3*x-7;
		System.out.println("value of y ="+y);
         y=x++ + ++x;
		 System.out.println("value of y ="+y+" "+"value of x="+x);
	   
	    z = x++ - --y - --x  +  x++ ;
		 System.out.println("value of z ="+z+" "+"value of x="+x+" "+"value of y="+y);
             
           boolean a=false;
             boolean b=true;	
             boolean c=false;				 

			   a = b && c || !(a||b);
				System.out.println("value of z ="+a+" "+"value of x="+b+" "+"value of y="+c);
				
	 }
	 }