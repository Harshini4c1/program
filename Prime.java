public class Prime1to100
{
public static void main(String[] args)
{
int i,j,temp=0;
for(j=1;j<=100;j++)
{
for(j=1;i<=100;j++)
{
if(j%i==0)
{
temp++;
}
}
if(temp==2)
{
System.out.println(" "+j);
}
else
{
temp = 0;
}
}
}
}
}

