package task4.Interest;
import java.io.*;
import java.util.*;
public class SimpleInterest {
	double principle;
	double interest_rate;
	double term_of_loan;
	double result;
	public SimpleInterest(double principle,double interest_rate,double term_of_loan)
	{
		this.principle=principle;
		this.interest_rate=interest_rate;
		this.term_of_loan=term_of_loan;
		
	}
	public  double calc_simple_interest()
	{
		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		result=(principle*interest_rate*term_of_loan)/100;
		return(result); 
				
	}
		
	

}
