import java.util.Scanner;
class Calculation{
	
	public static void main(String args[]){
	int choose,sum,sub,mul,div,num1=0,num2=0;
	char operation;
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Calculation Started...\n");
	System.out.println("Choose which operation you want to do!!!");
	System.out.println("1: Sum\n2: Sub\n3: Mult\n4: Div\n");
	System.out.println("Choose your selection...");
	choose=sc.nextInt();
	System.out.println("Calculation Started...");
	if(choose==1){
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("Result is :"+sum);
		}
	else if(choose==2){
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		sub=num1-num2;
		System.out.println("Result is :"+sub);
		}
	else if(choose==3){
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		mul=num1*num2;
		System.out.println("Result is :"+mul);
		}
	else if(choose==4){
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		div=num1/num2;
		System.out.println("Result is :"+div);
		System.out.println("Want more operation y/n :");		
		}
	sc.close();
}
}