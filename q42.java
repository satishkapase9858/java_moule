import java.util.*;

class tile{
            public int edge;
            tile()
            {
                 this( 200);
                 // edge=0;
                // System.out.println("constructor of super class ");
            }
               tile( int a)
               {
                   this.edge=a; 
                  // System.out.println("constructor of super class with parametr ");
               }

}
    class floor extends tile{
         public  int length;
          public int width;
                floor( int length,int width  )
                {
                    this.length=length;
                      this.width=width;
                      System.out.println("constructor of sub class ");
                }

               void totaltile( tile t)
                {
                     int total=  (length*width)/t.edge;
                      System.out.println("total tile are required "+total);
                }


    }
    class q42{
     public static void main( String args[]) {
                    tile t=  new tile ();
                 floor f1=new floor(200,200);
                     f1.totaltile( t);
     }



    }