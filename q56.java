    import java.util.Scanner;    
	public class q56{
	  public static void main(String args[]){
	       Scanner sc=new Scanner(System.in);
		  
		    String str=sc.nextLine();
		    String arr[]=str.split(" ");
			  String capital="";
			  for(String a:arr )
			  {
				  String s=a.substring(0,1);
				  String aftersub=a.substring(1);
				  capital+=s.toUpperCase()+aftersub+" ";
                    // capital.trim();				  
			  }
			   System.out.print(capital);
	       }
		   }
		   
	
	       