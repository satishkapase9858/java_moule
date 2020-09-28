class onebhk
  {
      public  int roomarea;
      public  int hallarea;
      public  int price;
       
                onebhk()
                {
                    roomarea=10;
                      hallarea=20;
                        price=3000;
                         System.out.println("============");
                }
                onebhk( int roomarea,int hallarea,int price)
                {
                    this.roomarea=roomarea;
                      this.hallarea=hallarea;
                        this.price=price;
                }
                void show()
                 {
                   System.out.println("roomarea="+roomarea);
                   System.out.println("hallarea="+hallarea);
                   System.out.println("price="+price);
   }
 
  }

    class twobhk extends onebhk{
         int room2area;
                          twobhk()
                           {   super();
                                room2area=200;  
                                  
                           }
                           twobhk(int room2area,int roomarea,int hallarea,int price)
                           {  
                            super(roomarea,hallarea,price);
                                this.room2area=room2area;  
                                 
                           }
                           void show()
                             {
                                 System.out.println("room2area  from subclass="+room2area);
                                 System.out.println("values from the superclass ="+super.roomarea+" "+super.hallarea+"  "+super.price);
                             }
          }
   class q43{

         public  static void main( String args[]) {
                twobhk t1=new twobhk();
                 t1.show();
                  //t1.show();
                   // onebhk o1=new onebhk();
                   //   o1.show();
         }
   }