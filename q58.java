 import java.util.*;
class q58{
	  public static void main( String args[]){
      Scanner sc=new Scanner(System.in);
	      String arr[]={ "sun","mon","tues","wed","thur","frid","Sat"};
		  int k= sc.nextInt();
		    try{
              for(int i=0;i<arr.length;i++)
			    {
				 
				    if(arr[k]==arr[i])
					{
					  System.out.println(arr[k]);
					  break;
					}
				  
				
				}



			}catch(ArrayIndexOutOfBoundsException  e){
                  System.out.println("========");


				}
		  }
		  }