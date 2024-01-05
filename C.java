class C{
void m(){System.out.println("hello m");}
void n(){
System.out.println("hello n");
this.m();
}
}class TestThis{
public static void main(String args[]){
C c=new C();
c.n();
}
}