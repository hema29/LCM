import java.io.*;

class Lcm
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,lcm=1;
System.out.print("Enter the 1st number : ");
a=Integer.parseInt(br.readLine());
System.out.print("Enter the 2nd number : ");
b=Integer.parseInt(br.readLine());
for(int i=a;i<=a*b;i++) 
{
if(i%a==0 && i%b==0) 
{
lcm=i;
break; 
}
}
System.out.println("L.C.M. = "+lcm);
}
}