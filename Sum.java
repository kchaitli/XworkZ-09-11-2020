class Sum{
	public static int sum(int[] arr){
		int s=0;
		for(int i=0;i<5;i++){
			s=s+arr[i];
		}
		return s;
	}
	public static void main(String[] args){
		int arr[]={2,3,4,5,6};
		System.out.println("sum is"+" "+sum(arr));
	}
}