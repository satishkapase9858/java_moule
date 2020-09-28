class main1{
        int rollno;
              main1()
              {   rollno=10;
                  System.out.println("  mmmm===============");
              }

              void show1()
              {
                System.out.println("  mmmm==============="+rollno);
              }
              void  m1111()
            {
                System.out.println(" mmmmmmmmmmmm ");
            }

}
 class sub1 extends main1{
    int marks;
        sub1()
        {    marks=2000;
            System.out.println("  sssss===============");
        }
        void show()
              {
                System.out.println(" ssssss==============="+marks);
              }
            void  sub11()
            {
                System.out.println(" sssssssssssssssssss ");
            }

 }
 class sub12 extends main1{
    int marks;
        sub12()
        {    marks=2000;
            System.out.println("  sssss====dddddd===========");
        }
        void show()
              {
                System.out.println(" ssssss==============="+marks);
              }
            void  sub112()
            {
                System.out.println(" ssssshjkgkgkhgjhfjssssssssssssss ");
            }

 }
 class q46{

  public static void main(String args[]) {

         // sub1 m1=new sub1();
           // m1.show1();
          main1 m1=new sub1();
             m1.show1();
             m1.m1111();
            // m1.sub11();
             sub1 s1=(sub1)m1;
             s1.show1();
             s1.m1111();
             s1.show1();
              s1.sub11();

                main1 m[]={   new sub1(),new sub12(), new sub12(),new sub1() };
                   for( main1 s22:m)
                   {
                         if( s22 instanceof sub1)
                          {
                              System.out.println("++++++++++++++++++");
                             // s22.sub11();
                          }
                          if( s22 instanceof sub12)
                          {
                            System.out.println("++++++++kkkkkkk++++++++++");
                          }
                   }
  }          

 }