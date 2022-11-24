
import java.util.*;
public class Calculater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE");
        int CH;
        CH= sc.nextInt();
        
       switch(CH){
         case 1 : 
                int x =10;
                int y=19;
              // int  SUM;
           //    SUM= x+y; 
                System.out.println("SUM OF YOUR NUMBER:"+ x+y);
         break;
         case 2 :
               int x =10;
               int y=19;
               int  Z ;
              Z= x-y; 
         System.out.println("DIFFERENCE="+ Z);
         
         System.out.println("NAMASTE");
         break;
         case 3 : System.out.println("BONJOUR");
         break;
         case 4 : System.out.println("AALUKUM ASLAM");
         break;
         default:  System.out.println("INVALID CHOICE");
        
    }
    }   

}


