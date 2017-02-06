public static void main(String[] args) {		
		int arr[] = {4,1,3,4,3,8,1,7,13,11,10};
		int k = 13;
		int[] c = new int[k + 1];
		
		arr = cS(arr, c);
		
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();

	}
	
	public static int[] cS(int[] arr, int[] c){
		int[] b = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			c[arr[i]]++;
		}		
		
		for(int i = 1; i < c.length; i++){
			c[i] = c[i] + c[i-1];
		}
		
		for(int i = arr.length-1; i >= 0; i--){
			b[c[arr[i]] - 1] = arr[i];
			c[arr[i]]--;
		}	
		
		return b;
	
	}
