import java.util.ArrayList;

public class GroupLists
	{
		private static ArrayList<Student> targetList;

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

								for (int j = 0; j < Main.groupSize-1; j++)
									{
										sList.get(counter).groups[0] = i + 1;
										counter++;
									}

							}
						for (int i = 0; i < sList.size() % Main.groupSize; i++)
							{
								sList.get(counter).groups[0] = i + 1;
								counter++;
							}
					}
				else
					{
						int counter = 0;
						if (Main.studentList.size() % Main.groupSize != 0)
							{
								Main.groupNumber = (Main.studentList.size() / Main.groupSize) + 1;
							}
						else
							{
								Main.groupNumber = Main.studentList.size() / Main.groupSize;
							}
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
			}

		public boolean checkGroups(Student s, int currentRound, int targetGroup)
			{
				targetList = new ArrayList<Student>();

				for (Student stud : Main.studentList)
					{
						if (stud.groups[currentRound] == targetGroup) targetList.add(stud);
					}
				for (Student stud : targetList)
					{
						if (stud.groups[0] == s.groups[0]) return false;
					}
				if (currentRound == 3)
					{
						for (Student stud : targetList)
							{
								if (stud.groups[1] == s.groups[1]) return false;
							}
					}
				return true;
			}
	}
