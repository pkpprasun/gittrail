package java_in_one_video;

public class yoin_switch {
    //why it is that we need switch 
    //
    public static void main(String [] args ) {

    char n='z'; // we can pass string and int char 
   /* int n=3;
    if(n==1)
             System.out.println("one");
 else if(n==2)
            System.out.println("two");
    else if(n==3)
           System.out.println("three");
    else if(n==4) 
           System.out.println("four");
    else if (n==5)
         System.out.println("five");
         */

         switch(n)
         {
         case 'A':
         System.out.println("one");
         break;
         case 'B':
         System.out.println("two");
         break;
         case 'C':
         System.out.println("three");
         break;
         case 'D':
         System.out.println("four");
         break;
         case 'E':
         System.out.println("five");
         break;
         default:
         System.out.println("no match");
         }

}

}
/*basically we did here is 
switch(n) 
    {
       case 1:
       syso
       break;
       case 2:
       syso
       break;
       default:
       syso("pussy cat")
    }
       



*/