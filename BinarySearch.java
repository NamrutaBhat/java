import java.util.*;

class BinarySearch{
public static void main(String []args){
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
int n=sc.nextInt();
int []arr=new int[n];

System.out.println("enter the" +n+" values");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}

System.out.println("enter the number to search");
int num=sc.nextInt();
	BinarySearch.binarySearch(arr,num);
}

static void binarySearch(int []arr,int num){
	Arrays.sort(arr);
	int lower=0;
	int upper=arr.length;
	int mid=0;
	
	while(lower<upper){
		mid=(lower+upper)/2;
		
		if(arr[mid]==num){
			System.out.println(num+"found");
			break;
		}
		else if(num<arr[mid])	
			upper=mid;
		
		else if(num>arr[mid])	
			lower=mid;
			
			
	
	
	}
	
	
	
}







}