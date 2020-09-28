  import java.util.*;
class faculty{
  public int facultyid;
   public int salary ;
        
        void input()
        {
            Scanner sc=new Scanner(System.in);
              System.out.println("enter   facultyid  and  salary");
              facultyid=sc.nextInt();
               // salary=sc.nextInt();
        }
        void printsalary()
        {
            System.out.println("  superclass salary"+salary);
        }


}
   class fulltimefaculty  extends faculty{
          int basicsalary;
           int allowance;

             void input()
             {
                 super.input();
                 Scanner sc=new Scanner(System.in);
              System.out.println("enter fulltime  basicsalry  and allowance");
              basicsalary=sc.nextInt();
                allowance=sc.nextInt();
                  super.salary=basicsalary+allowance;
                    
             }
             void printsalaryfulltimefaculty()
        {
            System.out.println("  fulltimefaculty salary"+super.salary);
        }



   }
    class parttimefaculty extends faculty{

             int workinghour;
             int rateperhour;
                void input()
                {
                    super.input();
                   
                    Scanner sc=new Scanner(System.in);
                 System.out.println("enter  parttimefaculty  workinghour  and rateperhour");
                 workinghour=sc.nextInt();
                   rateperhour=sc.nextInt();
                     super.salary= workinghour*rateperhour;
                    
                }
                void printsalaryparttimefaculty()
        {
            System.out.println("  parttimefaculty salary"+super.salary);
        }

    }
    class q44{
     public static void main(String[] args) {
          
      fulltimefaculty f1=new fulltimefaculty();
         f1.input();
         f1.printsalaryfulltimefaculty();
         parttimefaculty p1=new parttimefaculty();
          p1.input();
          p1.printsalaryparttimefaculty();
      } 
    }
          
       