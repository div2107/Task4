package task4.Interest;
import java.lang.Math;
public class CompoundInterest {
		double final_amount,initial_principle_balance,rate_of_interest,number_of_times_interest_applied,number_of_time_periods_elapsed;
		public CompoundInterest(double initial_principle_balance,double rate_of_interest,double number_of_times_interest_applied,double number_of_time_periods_elapsed)
		{
			this.initial_principle_balance=initial_principle_balance;
			this.rate_of_interest=rate_of_interest;
			this.number_of_times_interest_applied=number_of_times_interest_applied;
			this.number_of_time_periods_elapsed=number_of_time_periods_elapsed;
			
			
		}
		public  double calc_compound_interest()
		{
			
			final_amount=initial_principle_balance*(1+Math.pow((rate_of_interest/number_of_times_interest_applied),(number_of_times_interest_applied*number_of_time_periods_elapsed)));
			return(final_amount); 
					
		}
			

}
