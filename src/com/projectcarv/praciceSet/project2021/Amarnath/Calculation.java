import java.util.Scanner;
class Calculation{
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
   	int num1,num2,res;
		


	System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
	int choice = sc.nextInt();
      		    while (choice == 1) {
		 	System.out.println("Enter first number: ");
		  	num1=sc.nextInt();
		    	System.out.println("Enter second number: ");
		    	num2=sc.nextInt();
		    	int sum=num1+num2;
		    	System.out.println("Result is :"+sum);
		    	System.out.println("Want more Operation y/n");
		    	char op= sc.next().charAt(0);
			if(op=='y'){
				System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
			        choice = sc.nextInt();
			}
			else{
				break;
			}
			}
		   while(choice == 2) {
			System.out.println("Enter first number: ");
			num1=sc.nextInt();
			System.out.println("Enter second number: ");
			num2=sc.nextInt();
			int sub=num1-num2;
			System.out.println("Result is :"+sub);
			System.out.println("Want more Operation y/n");
		    	char op= sc.next().charAt(0);
			if(op=='y'){
				System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
			        choice = sc.nextInt();
			}
			else{
				break;
			}
		}
		while(choice==3){
			System.out.println("Enter first number: ");
			num1=sc.nextInt();
			System.out.println("Enter second number: ");
			num2=sc.nextInt();
			int mul=num1*num2;
			System.out.println("Result is :"+mul);
			System.out.println("Want more Operation y/n");
		    	char op= sc.next().charAt(0);
			if(op=='y'){
				System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
			        choice = sc.nextInt();
			}
			else{
				break;
			}
			}
		while(choice==4){
			System.out.println("Enter first number: ");
			float n1=sc.nextFloat();
			System.out.println("Enter second number: ");
			float n2=sc.nextFloat();
			Float div=n1/n2;
			System.out.println("Result is :"+div);
			System.out.println("Want more Operation y/n");
		    	char op= sc.next().charAt(0);
			if(op=='y'){
				System.out.println("Which operation you want to do \n 1: Sum\n 2: Sub\n 3: Mult\n 4: Div");
			        choice = sc.nextInt();
			}
			else{
				break;
			}
   		 	}
       
      }
}