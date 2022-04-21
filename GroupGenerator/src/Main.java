import java.util.*;
import java.io.*;

public class Main
	{

		static ArrayList<Student> studentList = new ArrayList<Student>();
		static int groupNumber = -1, groupSize = -1;
		private static Scanner tanner = new Scanner(System.in);
		private static ArrayList<Student> tudList = new ArrayList<Student>();

		public static void main(String[] args) throws IOException
			{
				readTxt("textFileGroups.txt");
				GroupLists.addToGroupsRoundOne(studentList);
				printLists(studentList, 0);
			}

		public static void questions()
			{
				// ask number of groups
				System.out.println("1) Do you want to make the median number of groups \nor \n2) A custom number?");
				int answer = tanner.nextInt();

				System.out.println("There will be " + answer + " groups.");
				groupNumber = answer;

				System.out.println();
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
				if (statistics[0].equalsIgnoreCase("Number"))
					{
						groupSize = studentList.size() / groupNumber;
						if (studentList.size() % groupNumber != 0)
							{
								groupSize++;
							}
					}
			}

		public static void printLists(List<Student> l, int round)
			{
				for (int i = 0; i < groupSize; i++)
					{
						tudList = new ArrayList<Student>();
						for (Student s : l)
							{
								if (s.groups[round] == i) tudList.add(s);
							}
						System.out.println("\n\nGroup " + (i+1) + "\nRound " + (round+1));
						for (Student s : l)
							{
								System.out.println(s.getLastName()+", "+s.getFirstName());
							}
					}

			}
	}
