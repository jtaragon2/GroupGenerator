import java.util.*;
import java.io.*;
public class Main
	{

		static ArrayList <Student> studentInfo = new ArrayList<Student>();
		
		public static void main(String[] args) throws IOException
					{
						readTxt();
					}
		
		public static void readTxt() throws IOException
		{
						Scanner myFile = new Scanner(new File("textFileGroups.txt"));
						
						while(myFile.hasNext())
							{
								String line = myFile.nextLine();
								
						String [] splitArray = line.split(" ");
									
						studentInfo.add(new Student(splitArray [0], splitArray [1]));
							}

		}

}
