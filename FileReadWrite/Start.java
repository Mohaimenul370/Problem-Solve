import fileio.*;
import java.io.*;

class Start{
	public static void main (String[] args)
	{
		myfileclass m1 = new myfileclass();
		m1.writeInFile("hello world");
		m1.readFromFile();
	}
}