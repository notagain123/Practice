public static void main(String[] args) {
		int arr[] = { 8,2,4,9,3,6};
		arr = iS(arr);
		for(int idx = 0; idx<arr.length;idx++){
			System.out.print(arr[idx] + " ");
		}
		System.out.println();

	}
	
	public static int[] iS(int[] arr){	
		if(arr.length == 1){
			return arr;
		}
		
		int mid = arr.length/2; 
		int[] left = Arrays.copyOfRange(arr, 0, mid);		
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);			
		iS(left);
		iS(right);
		merge(left, right, arr);
		
		return arr;
	}
	
	public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            arr[k++] = left[i++];
        }
        while (j < leftSize) {
            arr[k++] = right[j++];
        }
    }
