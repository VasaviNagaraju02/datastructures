package datastructures;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {11,12,13,14,15,16,17,18,19,20};
int srch=13;
int li=0;
int hi=a.length-1;
int mi=(li+hi)/2;

while(li<=hi)
{
	if(a[mi]==srch)
	{
		System.out.println("element is present.."+mi+"index position");
		break;
	}
	else if(a[mi]<srch)
	{
		li=mi+1;
	}
	else
	{
		hi=mi-1;
	}
	mi=(li+hi)/2;
}
if(li>hi)
{
	System.out.println("not found");
}
	}

}
