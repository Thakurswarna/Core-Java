package www.dl.three;


//Inside Abs class we can have Instance v, Static v and Local v, We can execute static v and local v, but not instance v
public abstract class Client {
int a=10;
int b=20;

static int aa=11;
static int bb=12;

public static void main(String[] args) {
	int x=22;
	int y=33;
	
	System.out.println(aa);
	System.out.println(bb);
	
	System.out.println(x);
	System.out.println(y);
}
}
