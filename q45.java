  import java.util.*;
class student{
     int rollno;
      int percentage;
          student()
          {
              rollno=1;
              percentage=0;
          }
            student(int rollno,int percentage)
           {
               this.rollno=rollno;
               this.percentage=percentage;
           }
             void show()
             {
                 System.out.println("from super class student roll no and percentage"+rollno+" ===="+percentage);
             }
}
 class collegestudent extends student{
          int semister;
                   collegestudent()
                   {
                        semister=1;
                   }
            collegestudent(int rollno,int percentage,int semister)
            {
                super(rollno,percentage);
                  this.semister=semister;
            }

              void show1()
              {
                super.show();
                   System.out.println("from class collegestuent"+semister);

              } 
 }
   class schoolstuent extends student{
         String classname;
               
                       schoolstuent()
                       {   
                           classname="1st";

                       }
                       schoolstuent( String classname,int rollno,int percentage)
                       {      super(rollno,percentage);
                           this.classname=classname;

                       }
                       void show()
                       {
                             super.show();
                             System.out.println("from class collegestuent"+classname);
                               
                       }


   }
       class q45{
            public static void main(String args[]) {
                
                student arr[]={ new collegestudent(1,96,11),new collegestudent(2,94,22),
                                   new schoolstuent("satish",1,77),new schoolstuent("kapase",2,75),
                                   new schoolstuent("rukadi",3,74) };
                                  int count=0;
                                   for(student s:arr)
                                   { 
                                    Scanner sc=new Scanner(System.in);    
                                    System.out.println("rollno");
                                    int a=sc.nextInt();   
                                        
                                         if(s instanceof collegestudent)
                                         {
                                              if(s.rollno==a)
                                            { 
                                                   s.show();
                                            }

                                            if(s.percentage>75)
                                            { 
                                                count++;
                                            }
                                            
                                        }
                                                 if(s instanceof schoolstuent)
                                                 {
                                                    if(  s.rollno==a)
                                                   { 
                                                   s.show();  
                                                   
                                                    }
                                                    if(s.percentage>75)
                                                    { 
                                                        count++;
                                                    }
                                                }
                                   }

                           System.out.println("countting of student whos percentage is greatter than 75"+count);


            }
 

       }