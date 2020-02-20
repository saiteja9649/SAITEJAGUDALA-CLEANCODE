package clean_code;

public class cleancode {
	
	public double calc_simpleinterest(double principalamount,double interestrate,double noofyears)
	{
	   return principalamount*interestrate*noofyears/100;

	}
	public double calc_compoundinterest(double principalamount,double interestrate,double noofyears)
	{
	   return principalamount*Math.pow((1+interestrate/100),noofyears);
    }
	}