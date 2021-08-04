package java_in_one_video;

public class special_case_odd_even_nesting {
    public static void main (String [] args){
        int i = 8;
        if(i==0)
        System.out.println("nothing");
        else {
            if(i%2==0)
            System.out.println("even");
            else
            System.out.println("odd");
        }
        
    }
}
