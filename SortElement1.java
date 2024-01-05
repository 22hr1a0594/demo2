import java.util.Scanner;
class SortElement{
public static void main(String args[]){
int n,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.of element you want in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++){
a[i]=sc.nextInt();}
for(i=0;i<a.length;i++){
for(int j=0;j<a.length-i-1;j++)
{
int temp=0;
if(a[j]>a[j+1]){
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(int x:a) System.out.print(x+" ");
}
}