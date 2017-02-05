public static void main(String[] args) {

		int arr[] = { 6, 10, 13, 5, 8, 3, 2,11};
		qS(arr,0,arr.length);
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();

	}

	public static int partition(int[] arr, int p, int q) {
//		Random random = new Random();
//		int r = p + random.nextInt(q - p);
//		int temp2 = arr[r];
//		arr[r] = arr[p];
//		arr[p] = temp2;
		int i = p;

		for (int j = i + 1; j < q; j++) {
			if (arr[j] <= arr[p]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i];
		arr[i] = arr[p];
		arr[p] = temp;
		
		return i;
	}
	
	public static void qS(int[] arr, int p, int q){
		if(p >= q){
			return;
		}
		if(p < q){
			int r = partition(arr, p ,q);
			qS(arr, p ,r);
			qS(arr, r+1, q);
		}
	}
