class Shifting
{
public static void main(String args[])
{
int a,b;
a = Integer.parseInt(args[0]);
b = Integer.parseInt(args[1]);
System.out.println("your right shift:" + a<<2);
System.out.println("your left shift:" + a>>2);
System.out.println("your bitwise and:" + (a&b));
System.out.println("your bitwise or:" + a|b);
System.out.println("your compliment:" + ~a);
System.out.println("your xor :" + a^b);
}
}