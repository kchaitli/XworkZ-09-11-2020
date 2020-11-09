 class EvenNum{
	public static int[] even(int a[]){
	int evenNum[]= new int[a.length];
	int pos=0;
	for(int i=0;i<a.length;i++){
		if(a[i]%2==0){
			evenNum[pos++]=a[i];
			}
		}
	return evenNum;//my answer array is in evenNum array which is returned to main
	}
	
	public static void main(String args[]){
		int a[] = {2,3,4,5,6,7,8,22,33,31};
		a = even(a);// calling my method here passing array a
					//i am storing answer in the array itself instead of creating new array
					//i looped it through the array and then print
		for(int I:a)//this is my original array with empty spaces
			System.out.println(I+" ");//printing answer
			System.out.println();
			for(int I:a){
				if(I!=0)//since i dont know how many even numbersare there 
						// to eleminate zeros and leave even numbers in the array
					System.out.println(I+" ");//printing answer
			}
	}
 }