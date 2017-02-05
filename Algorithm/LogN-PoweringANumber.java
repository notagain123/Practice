public static void main(String[] args) {
		
		double x = 6;
		int n = 2;
	    x = poweringNumber(x,n);
	   

	}
	
	public static double poweringNumber(double x,int n){
		double result;
		if(n == 1){
			return x;
		}
		
		result = poweringNumber(x, n/2);	
		if(n % 2 == 0){
			return result * result;
		}else{
			return result * result * x;
		}
	}
