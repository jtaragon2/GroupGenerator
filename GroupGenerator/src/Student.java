
public class Student
	{
		private String firstName;
		private String lastName;
		int[] groups = new int[3];
		public Student(String fName, String lName) {
			firstName = fName;
			lastName = lName;
		}
		public String getFirstName()
			{
				return firstName;
			}
		
		public String getLastName()
			{
				return lastName;
			}
		public int firstGroup() {
			return groups[0];
		}
		public int secondGroup() {
			return groups[1];
		}
		public int thirdGroup() {
			return groups[2];
		}

	}
