import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String args[]){
        int a,b,c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First number:");
        a=sc.nextInt();
        System.out.println("Enter Second number:");
        b=sc.nextInt();
        c=a+b;
        sc.close();
        System.out.println("Result: "+c);
}
}