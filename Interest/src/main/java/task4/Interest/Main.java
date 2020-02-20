package task4.Interest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
public class Main 
   {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("Enter principle");
		int principle=s.nextInt();
		myout.print("Enter interest_rate");
		int interest_rate=s.nextInt();
		myout.print("Enter term_of_loan");
		int term_of_loan=s.nextInt();
		SimpleInterest si=new SimpleInterest(principle,interest_rate,term_of_loan);
		myout.print("Simple Intterest is:");
		myout.print(si.calc_simple_interest());
		myout.print("Enter initial_principle_balance:");
		double initial_principle_balance=s.nextDouble();
		myout.print("Enter rate_of_interest:");
		double rate_of_interest=s.nextDouble();
		myout.print("Enter number_of_times_interest_applied");
		double number_of_times_interest_applied=s.nextDouble();
		myout.print("Enter number_of_time_periods_elapsed");
		double number_of_time_periods_elapsed=s.nextDouble();
		CompoundInterest ci=new CompoundInterest(initial_principle_balance,rate_of_interest,number_of_times_interest_applied,number_of_time_periods_elapsed);
		myout.print("Compound Interest is:");
		myout.print(ci.calc_compound_interest());
		
		
		
	}

}
