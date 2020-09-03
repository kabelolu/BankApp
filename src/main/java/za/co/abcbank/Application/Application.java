package za.co.abcbank.Application;

import java.util.Scanner;
import za.co.abcbank.Account.Account;
import za.co.abcbank.Transaction.Transaction;
import za.co.abcbank.customer.Customer;

public class Application{
Application (){}

public static void main(String [] args){

Scanner scan = new Scanner(System.in);
Account acc = new Account();
Customer cust = new Customer();
Transaction trans = new Transaction();


int z =0;
do{
System.out.println(" Welcome to ABC Bank ");
System.out.println("<<< SELECT OPTION BELOW  >>>");
System.out.println("1. Open Account");
System.out.println("2. Deposit ");
System.out.println("3. Withdraw ");
System.out.println("4. Check Balance ");
System.out.println("5. Statements ");
System.out.println("6. More Option ");
int a =scan.nextInt();
if (a==1){
System.out.println("<<< Open Account >>>");
System.out.print("Enter Surname : ");
scan.nextLine();
String surname = scan.nextLine();
System.out.print("Enter Name : ");
String name = scan.nextLine();
System.out.print("Enter Gender : ");
String gender = scan.nextLine();
System.out.print("Enter Email : ");
String email = scan.nextLine();
System.out.println("Enter Date Of Birth.Starting with Day ");
System.out.print("Enter Day Of Birth : ");
scan.nextLine();
String day = scan.nextLine();
System.out.print("Enter Month Of Birth : ");
String month = scan.nextLine();
System.out.print("Enter Year Of Birth: ");
String year = scan.nextLine();
System.out.print("Enter Account Number : ");
String accountNumber = scan.nextLine();
System.out.println("Transcation Succesfull. Current Balance :R");
}
if (a==2){
System.out.println("<<< Deposit >>>");
System.out.print(" Enter Amount :R");
double amount = scan.nextDouble();
System.out.println(" Enter Date Of Deposit. Begin with day");
System.out.print(" Enter Day : ");
scan.nextLine();
String transactionDay = scan.nextLine();
System.out.print(" Enter Month : ");
String transactionMonth = scan.nextLine();
System.out.print(" Enter Year : ");
String transactionYear = scan.nextLine();
System.out.println("Deposit Succesfull. Current Balance is R");
}
if (a==3){
System.out.println("<<< Withdraw >>>");
System.out.print(" Enter Amount :R");
double amount = scan.nextDouble();
System.out.println(" Enter Date Of Withdraw. Begin with day");
System.out.print(" Enter Day : ");
scan.nextLine();
String transactionDay = scan.nextLine();
System.out.print(" Enter Month : ");
String transactionMonth = scan.nextLine();
System.out.print(" Enter Year :" );
String transactionYear = scan.nextLine();
System.out.println("Withdraw Succesfull. Current Balance is R:");
}
if (a==4){
System.out.println("Current Balance :R");
}
if (a==5){
System.out.println("<<< Statements >>>");
System.out.println("Amount 	Type 	Date");
System.out.println("R"  	 	 	);
System.out.println("R" );
}
if (a==6){
System.out.println("<<< More Option >>>");
System.out.println("1. Change Pin ");
System.out.println("2.Send Money ");
}
z++;
}while (z<=2);

}
}
