package prime.factors;

public class PrimeFactors {
	
	public static void main(String[] args) {
		//Java requires an entry point to start. Put code in here to call generate()
		
		int n = 5;
		System.out.print(generate(n) + " ");
		//System.out.print(generate(5) + ": " );
		
	}
	
	
	public static int generate(int n)
	{
		int i = 2;
		 while( n >1)
		 {
			 if(n %i ==0)
			 {
				 System.out.print(i + " ");
				 n = n/i;
			 }
			 else
				 i++;
		 }
		
		return n;
		
	}

}
