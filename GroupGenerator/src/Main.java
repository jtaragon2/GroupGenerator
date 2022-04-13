import java.util.*;
import java.io.*;

public class Main
	{

		static ArrayList<Student> studentList = new ArrayList<Student>();
		static int groupNumber = -1, groupSize = -1;

		public static void main(String[] args) throws IOException
			{
				readTxt("textFileGroups.txt");
				GroupLists.addToGroupsRoundOne(studentList);
				printLists(GroupLists.Group1);
				printLists(GroupLists.Group2);
				printLists(GroupLists.Group3);
			}

		public static void readTxt(String s) throws IOException
			{
				Scanner myFile = new Scanner(new File(s));
				String header = myFile.nextLine();
				String[] statistics = header.split(" ");
				if (statistics[0].equalsIgnoreCase("Number"))
					{
						groupNumber = Integer.parseInt(statistics[1]);
					}
				else if (statistics[0].equalsIgnoreCase("Size"))
					{
						groupSize = Integer.parseInt(statistics[1]);
					}
				while (myFile.hasNext())
					{
						String line = myFile.nextLine();

						String[] splitArray = line.split(" ");

						for (int i = 0; i < splitArray.length - 1; i += 2)
							{
								studentList.add(new Student(splitArray[i], splitArray[i + 1], 3));

							}
					}

			}

		public static void printLists(List<Student> l)
			{
				System.out.println("\nGroup Size: " + l.size());
				for (Student st : l)
					{
						System.out.println(st.getLastName() + ", " + st.getFirstName());
					}
			}
	}
