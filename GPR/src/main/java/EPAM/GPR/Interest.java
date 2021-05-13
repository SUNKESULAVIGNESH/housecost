package EPAM.GPR;


public class Interest {
	float rate,time;
	long principle;
	
	public double compoundInterest(long p,float r,float t)
	{
    	principle=p;
		rate=r;
		time=t;
		double CI = principle *
                (Math.pow((1 + rate / 100), time));
    	return CI;
	}
	public double simpleInterest(long p,float r,float t)
	{
		principle=p;
		rate=r;
		time=t;
    	double SI = principle* rate*time/100;
    	return SI;
	}
	
	
	
}
