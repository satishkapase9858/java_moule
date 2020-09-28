    import java.util.Scanner;    
	public class q57{
	  public static void main(String args[]){
	       Scanner sc=new Scanner(System.in);
		  
		    String str=sc.nextLine();
		    String each_word[]=str.split(" ");
		   
		      String reversestring=" ";
			  for( int i=0;i<each_word.length;i++)
			  {
				    String word=each_word[i];
					  String reverseword="";
					  for(int j=word.length()-1;j>=0;j--)
					  {
						  reverseword=reverseword+word.charAt(j);
					  }
					  reversestring=reversestring+reverseword+" ";
		       
			  }
		        System.out.println(reversestring);
	       }
		   }
		   
	
	       