import java.util.*;

class student{

  public int rollno;
   public String name;
   public int age;
     public int score;


        student(int rollno, String name,int age,int score)
        {
          this.rollno=rollno;
            this.name=name;
            this.age=age;
              this.score=score; 
        }
          void show()
          {
            System.out.println("student score between"+name);
            System.out.println("student score between"+age);
            System.out.println("student score between"+rollno);
            System.out.println("student score between"+score);
            System.out.println("==================");
          }

          

        
}

  class q40{
         
       public static void main( String args[]) {
        Scanner sc= new Scanner(System.in);
            // student arr[]=new student[5];
               student arr[]={new student(10,"satish",26,78),new student(11,"satis",26,56),
               new student(12,"sajjj",26,89), new student(13,"satishd",26,75),
               new student(10,"satishddd",26,87)};
                      
            for(student s : arr)
            {
                  if(s.score>0  &&  s.score<50 )
                    {
                         s.show();


                    }
                     else if (s.score>50  &&  s.score<90 )
                     {
                        s.show();
                     }
                       else
                       {
                             System.out.println("==================");
                       }
            }

            /* for(int i=0;i<arr.length;i++)

             {
                System.out.println("enter the rollno"); 
                int rollno= sc.nextInt();
                System.out.println("enter the name"); 
                 String name= sc.next();
                 System.out.println("enter the age"); 
                 int age= sc.nextInt(); 
                 System.out.println("enter the score"); 
                 int score= sc.nextInt();  
                  student s1=new student(rollno,name,age,score);
                   arr[i]=s1;
             }
               student.arrange(arr);   */     
           
       }
  }