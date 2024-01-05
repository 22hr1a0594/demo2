class A{
A(){System.out.println("hello default constructor");}
A(int x){
this();
System.out.println(x);
}
}
class TestThis{
public static void main(String args[]){
A a=new A(10);
}
}