import java.util.ArrayList;

public class GroupLists
	{

		public static void addToGroupsRoundOne(ArrayList<Student> sList)
			{
				if (Main.groupNumber != -1)
					{
						int counter = 0;
						for (int i = 0; i < Main.groupNumber; i++)
							{

								if (counter >= sList.size())
									{
										System.out.println("Oops");
										break;
									}

								for (int j = 0; j < sList.size() / Main.groupNumber; j++)
									{
										sList.get(counter).groups[0] = i + 1;
										counter++;
									}

							}
						for (int i = 0; i < sList.size() % Main.groupNumber; i++)
							{
								sList.get(counter).groups[0] = i + 1;
								counter++;
							}
					}
				else
					{

					}
			}
	}
