import java.util.Scanner;

public class area 
{
    static double rarea (double l,double b)
    {
        return l*b;
    }
    static double sarea (double side)
    {
        return side*side;
    }
     public static void main(String[] args) {
        double l,b,calrarea,calsarea,side;
         Scanner sc = new Scanner(System.in);
          
            System.out.println("enter length and breadth of rec");
            l=sc.nextDouble();
            b=sc.nextDouble();
            System.out.println("enter the side of sq");
            side=sc.nextDouble();
        
        calrarea=rarea(l,b);
        calsarea=sarea(side);
        System.out.println("area of rec ="+calrarea);
        System.out.println("area of sq = "+calsarea);
        sc.close();
    }
    
}
