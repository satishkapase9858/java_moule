    import java.util.Scanner;    
	class q53{
	  public static void main(String args[]){
	       Scanner sc=new Scanner(System.in);
		 //String str=sc.next(); 
		    String str=sc.nextLine();
		    String arr[]=str.split(" ");
			  int sum=0;
		        for(int i=0;i<arr.length;i++)
				{    int t=Integer.parseInt(arr[i]);
					  sum=sum+t;
				}
			   System.out.println(sum);
			   
	       }
		   }
		   
	
	       