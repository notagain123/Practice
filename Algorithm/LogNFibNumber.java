public static void main(String[] args) {
		
		int[][] fib = {{1,1},{1,0}};
	    int n = 17;
	    fibS(fib,n);
	    System.out.println(fib[0][1]);

	}
	
	public static void fibS(int[][] fib, int n){
		if(n == 1){
			return;
		}
		int M[][] = new int[][]{{1,1},{1,0}};
		fibS(fib, n/2);
		multiply(fib, fib);
		
		if (n%2 != 0){
		    multiply(fib, M);
		 }
		
	}
	
	public static void multiply(int[][] F, int[][] M){
		int x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
	    int y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
	    int z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
	    int w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];
	      
	    F[0][0] = x;
	    F[0][1] = y;
	    F[1][0] = z;
	    F[1][1] = w;
	}
