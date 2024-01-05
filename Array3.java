import java.util.Arrays;
class Main{
public static void main(String args[]){
int[] numbers={12,4,5,-9,0,20,9,8,12};
int sum=0;
Double average;
for(int number:numbers){
sum+=number;
}
int arrayLength=numbers.length;
average=((double)sum/(double)arrayLength);
System.out.println("sum="+sum);
System.out.println("Avreage="+average);
}
}
