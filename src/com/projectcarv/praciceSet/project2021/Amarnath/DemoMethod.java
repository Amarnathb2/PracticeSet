import java.util.Scanner;
class DemoMethod{
	static int sum(int n1,int n2){
	int res= n1+n2;
	return res;
	}
	static int mult(int n1,int n2){
	int res= n1*n2;
	return res;
	}
	static int mult(int n1,int n2){
	int res= n1-n2;
	return res;
	}
	static int mult(int n1,int n2){
	int res= n1/n2;
	return res;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Which operation you want to do: /n1: Sum/n2: Mult/n3: Sub/n4: Div");
		int choose= sc.nextInt();
		if(choose==1){
		System.out.println("Enter first no: ");
		int num1= sc.nextInt();
		System.out.println("Enter second no: ");
		int num2= sc.nextInt();
		int result= sum(num1,num2);
		System.out.println("Result is :"+result);
		}
		else if(choose==2){
		System.out.println("Enter first no: ");
		int num1= sc.nextInt();
		System.out.println("Enter second no: ");
		int num2= sc.nextInt();
		int result= sum(num1,num2);
		System.out.println("Result is :"+result);
		}
		else if(choose==3){
		System.out.println("Enter first no: ");
		int num1= sc.nextInt();
		System.out.println("Enter second no: ");
		int num2= sc.nextInt();
		int result= sum(num1,num2);
		System.out.println("Result is :"+result);
		}
		else if(choose==4){
		System.out.println("Enter first no: ");
		int num1= sc.nextInt();
		System.out.println("Enter second no: ");
		int num2= sc.nextInt();
		int result= sum(num1,num2);
		System.out.println("Result is :"+result);
		}
	}
}