import java.util.Scanner;
 class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		int numSubjects = sc.nextInt();

		if(numSubjects<=0)
		{
			System.out.println("Please enter a valid number of the subjects");
			return;
		}
		int totalMarks = 0;
		int maxMarksPerSubjects = 100;

		for(int i =1;i<=numSubjects;i++)
		{
			System.out.println("Enter marks obtained in subjects" + i + "(out of 100):");
			int marks = sc.nextInt();

			if(marks < 0 || marks > maxMarksPerSubjects)
			{
				System.out.println("Marks should be in the range of 0 to 100. please enter valid marks");
				i--;
			}
			else
			{
				totalMarks+=marks;
			}




		}
		double averagePercentage = (double) totalMarks /(numSubjects * maxMarksPerSubjects)*100;
		System.out.println("Total Mraks"+totalMarks);
		System.out.println("Average Percentage:"+averagePercentage+"%");


		String grade;

		if(averagePercentage>=90)
		{
			grade = "I+";
		}
		else if(averagePercentage>=80)
		{
			grade ="A";
		}
		else if(averagePercentage>=70)
		{
			grade = "B";
		}
		else if(averagePercentage>=60)
		{
			grade = "C";

		}
		else if(averagePercentage>=50)
		{
			grade = "C";

		}
		else
		{
			grade = "F";
		}

		System.out.println("Grade: "+grade);



	}
}