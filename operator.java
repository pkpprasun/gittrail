package java_in_one_video;

public class operator {
    /* 
    * arithmatic operator  + - % * /
    *bitwise operator 
    *relational operator 
    * logical operator 
    */
    public static void main (String [] args){
    int num1 = 2 ,  num2 = 4, num3 = 6;
    int r1 = num2 + num1  - num3;
    System.out.println(r1);

    int n= 4 ;
    int m = 6;
    double r2 = (double)n/m; // i used / for dividing 
    System.out.println(r2); // this is for printing 
    double r3 = (double)n%m; // i used % operator for reminder 
    System.out.println(r3); //4
    int r4 = n*m; // 24 
    System.out.println(r4);
 // increamenting  post and pre 
    int p = 7;
    int u = 5;
    u = p++;
    System.out.println(u);
    System.out.println(p);
    

    }
}
