import java.io.*;
public class alphabets
{
public static void main(String[]args)
{
int rows,colmns;
for(rows=1;rows<=4;rows++)
{
 for(colmns=1;colmns<=4;colmns++){
if(rows==colmns)
{System.out.print(" a");}
else
{System.out.print(" b");}
}
System.out.println();
}}}