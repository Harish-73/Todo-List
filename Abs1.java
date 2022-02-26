abstract class Abs{
abstract void dis();
void run()
{
System.out.println("Welcome");
}
}
class Abs1 extends Abs{
void dis()
{
System.out.println("Hi...");
}
public static void main(String[] args){
Abs1 s = new Abs1();
s.run();
s.dis();
}
}
