package datastructures;

public class Linear_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"vasu","anu","poo","lp"};
		String item="lp";
		String temp=null;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				System.out.println("index position..."+i);
				temp=temp+1;
			}
		}
		if(temp==null)
		{
			System.out.println("item  not found");
		}
			}
		}
	


