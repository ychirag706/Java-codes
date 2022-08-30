class Operator
{
public static void main(String args[])
{
int a,predec,postdec,preinc,postinc;
a = Integer.parseInt(args[0]);
postinc = a++;
preinc = ++a;
postdec = a--;
predec = --a;
System.out.println(" uniary operations=" + predec + "&" + postdec + "&" + preinc + "&" + postinc);
}
}

