import java.util.Scanner;

class LinearSearch{
public static void main(String[] args){
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

LinearSearch.search(arr,num);
}

 static void search(int []arr,int num){
	 int count=0;
         for(int i=0;i<arr.length;i++){
	
              if(num==arr[i])
                   count++;
		 }	
				   if(count>0)
					 System.out.println(num);					 

				   else
				 System.out.println("number not found");
    }
 





}