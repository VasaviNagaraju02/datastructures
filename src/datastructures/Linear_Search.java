package datastructures;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {4,5,8,7,9,12};
int item=5;
int temp=0;
for(int i=0; i<arr.length;i++)
{
	if(arr[i]==item)
	{
		System.out.println("index position..."+i);
		temp=temp+1;
	}
}
if(temp==0)
{
	System.out.println("item  not found");
}
	}
}
