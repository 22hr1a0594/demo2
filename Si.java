import java.util.Scanner;
class Si{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
double r=sc.nextDouble();
double t=sc.nextDouble();
double si=p*t*r/100;
System.out.println(si);
}
}