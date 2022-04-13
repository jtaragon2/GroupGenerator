import java.util.ArrayList;

public class GroupLists
	{
		static ArrayList<Student> Group1 = new ArrayList<Student>();
		static ArrayList<Student> Group2 = new ArrayList<Student>();
		static ArrayList<Student> Group3 = new ArrayList<Student>();
		
		public static void addToGroups(ArrayList<Student> sList)
			{
				Group1 = new ArrayList<Student>();
				Group2 = new ArrayList<Student>();
				Group3 = new ArrayList<Student>();
				int counter = 0;
				for (int i = 0; i < 3; i++)
					{
						
						if (counter >= sList.size())
							{
								System.out.println("Oops");
								break;
							}
							
						for (int j = 0; j < sList.size() / 3; j++)
							{
								if (i == 0)
									{
										Group1.add(sList.get(counter));
									}
								else if (i == 1)
									{
										Group2.add(sList.get(counter));
									}
								else
									{
										Group3.add(sList.get(counter));
									}
								counter++;
							}
							
					}
				for (int i = 0; i < sList.size() % 3; i++)
					{
						if (i == 0)
							{
								Group1.add(sList.get(counter));
							}
						else if (i == 1)
							{
								Group2.add(sList.get(counter));
							}
							counter++;
					}
			}
	}
