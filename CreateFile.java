import java.io.*;
class CreateFile
{
public static void main(String args[])
{
File f=new File("C:\\Aditya\\Adu.txt");
if(f.createNewFile())
{
System.out.println("File successfully created");
}
else
{
System.out.println("File already exist");
}
}
}