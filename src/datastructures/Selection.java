package datastructures;

public class Selection {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index]) {
					index=j;
					
				}
			}
			int smallerNumber= arr[index];
			arr[index]=arr[i];
			arr[i]=smallerNumber;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {9,12,15,43,58,22};
System.out.println("Before sorting ");
for(int i:arr1) {
	System.out.print(i+"");
}
System.out.println();
selectionSort(arr1);
System.out.println("After sorting ");
for(int i:arr1) {
	System.out.println(i+"");
}
	}

}
