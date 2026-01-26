import java.util.Scanner;
public class BinarySearch {
public static void main(String[] args){

int[] arr={2,4,6,8,10,12};
Scanner sc=new Scanner(System.in);
System.out.println("Enter binary element in the search");
int key=sc.nextInt();

int low=0;
int high=arr.length-1;
int key=12;

while(low<=high){
int mid=(low+high/2);

if(arr[mid]==key){
System.out.println("Element is found in  index:"+mid);
found=true;
break;
}
else if (key<=arr[mid]){
high=mid-1;
}
else (key>=arr[mid]){
low=mid+1;
}
}
if(!found){
System.out.println("Element not found");
} 
}
}

