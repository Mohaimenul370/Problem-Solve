package fileio;
import java.io.*;

public class myfileclass
{
	public void writeInFile(String s)
{
try
{
File file = new File("History.txt");//passing name of the file 
file.createNewFile();//file creation 
FileWriter writer = new FileWriter(file, true);
writer.write(s+"\r"+"\n");
writer.flush();
writer.close();
}
catch(IOException ioe)
{
	ioe.printStackTrace();
}
}


public void readFromFile()
{
try
{
File file = new File("History.txt");
FileReader reader = new FileReader(file);
BufferedReader bfr = new BufferedReader(reader);
String text="";
String temp;
while((temp=bfr.readLine())!=null)
{
text=text+temp+"\n"+"\r";
}
System.out.print(text);
reader.close();
}
catch(IOException ioe)
{
ioe.printStackTrace();
}
}

}