import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;
public class CAI5 {
	private static int answer;
	private static int firstnum;
	private static int secondnum;
	private static int userdifficulty;
	private static int problemtype;
	public static void quiz()
	{
	      readDifficulty();
	      readProblemType();
		  askQuestion();
	      readResponse();
	      isAnswerCorrect();
	      displayCompletionMessage();
	}
	public static int askQuestion() 
	{  
		readProblemType();
		if (problemtype==1) 
		{
		System.out.printf("What is " +firstnum+ " plus " +secondnum+ "?\n");
		}
		if (problemtype==2) 
		{
		System.out.printf("What is " +firstnum+ " times " +secondnum+ "?\n");
		}
		if (problemtype==3) 
		{
		System.out.printf("What is " +firstnum+ " minus " +secondnum+ "?\n");
		}
		if (problemtype==4) 
		{
		System.out.printf("What is " +firstnum+ " divided by " +secondnum+ "?\n");
		}
		if (problemtype==5) 
		{
			Random randproblem = new Random();
			int randproblemtype = randproblem.nextInt((4 - 1) + 1) + 1;
			if (randproblemtype==1) 
			{
			System.out.printf("What is " +firstnum+ " plus " +secondnum+ "?\n");
			}
			if (randproblemtype==2) 
			{
			System.out.printf("What is " +firstnum+ " times " +secondnum+ "?\n");
			}
			if (randproblemtype==3) 
			{
			System.out.printf("What is " +firstnum+ " minus " +secondnum+ "?\n");
			}
			if (randproblemtype==4) 
			{
			System.out.printf("What is " +firstnum+ " divided by " +secondnum+ "?\n");
			}
		}
		return firstnum *secondnum;
	}
	public static int readResponse() 
	{
		Scanner response = new Scanner(System.in);
		int answer;
		answer =response.nextInt();
        response.close();
		return answer;
	}
	public static void isAnswerCorrect() 
	{
	
	      if (answer == firstnum * secondnum)
	      {

	        displayCorrectResponse();
	        System.exit(0);
	      }
	      else 
	        displayIncorrectResponse();
	        System.out.println("What is " + firstnum + " times " + secondnum + "?");
	      }
	      	
	public static void displayCorrectResponse() 
	{
		Random randResponse = new Random();
		int randcorrectresponse = randResponse.nextInt((4 - 1) + 1) + 1;
		switch (randcorrectresponse)
		{
		case 1:
		System.out.printf("Very good!");	
		break;
		case 2:
		System.out.printf("Excellent!");	
		break;
		case 3:
		System.out.printf("Nice Work!");	
		break;
		case 4:
		System.out.printf("Keep up the good work!");	
		break;
		}
	}
	public static void displayIncorrectResponse() 
	{
		Random randResponse = new Random();
		int randincorrectresponse = randResponse.nextInt((4 - 1) + 1) + 1;
		switch (randincorrectresponse)
		{
		case 1:
		System.out.printf("No. Please try again.");	
		break;
		case 2:
		System.out.printf("Wrong. Try once more.");	
		break;
		case 3:
		System.out.printf("Don't give up!");	
		break;
		case 4:
		System.out.printf("No. Keep trying.");	
		break;
		}
	}
	public static void displayCompletionMessage()
	{
		for (int i=1;i<=10;i++)
		{
			quiz();
		}
		if((double)((double)answer/10)*100>=(double)75)

        {

         System.out.printf("Congratulations, you are ready to go to the next level!");
         System.out.printf("Would you like to solve another set of problems?");
         Scanner decision = new Scanner(System.in);
 		int userdecision;
 		userdecision =decision.nextInt();
         
        }

        else

        {

         System.out.printf("Please ask your teacher for extra help");
         System.out.printf("Would you like to solve another set of problems?");
         Scanner decision = new Scanner(System.in);
  		 int usersdecision;
  		 usersdecision =decision.nextInt();
        }
	}
	public static int readDifficulty()
	{
		System.out.printf("Please enter the level of difficulty you wish to solve problems for: level 1:0-9, level 2: 0-99, level 3: 0-999, level 4: 0-9999");
		Scanner difficulty = new Scanner(System.in);
		int userdifficulty;
		userdifficulty =difficulty.nextInt();
        difficulty.close();
		return userdifficulty;
	}
	public static void generateQuestionArgument()
	{
		readDifficulty();
		Scanner ask = new Scanner(System.in);
	      SecureRandom questionNumbers = new SecureRandom();
	      if (userdifficulty ==1)
	      {
	    	  int firstnum; 
		      firstnum= questionNumbers.nextInt(10);
		      int secondnum;
		      secondnum= questionNumbers.nextInt(10);   
	      }
	      if (userdifficulty ==2)
	      {
	    	  int firstnum; 
		      firstnum= questionNumbers.nextInt(100);
		      int secondnum;
		      secondnum= questionNumbers.nextInt(100);   
	      }
	      if (userdifficulty ==3)
	      {
	    	  int firstnum; 
		      firstnum= questionNumbers.nextInt(1000);
		      int secondnum;
		      secondnum= questionNumbers.nextInt(1000);   
	      }
	      if (userdifficulty ==4)
	      {
	    	  int firstnum; 
		      firstnum= questionNumbers.nextInt(10000);
		      int secondnum;
		      secondnum= questionNumbers.nextInt(10000);   
	      }
	}
	public static int readProblemType()
	{
		System.out.printf("Please enter the type of problem you would like to solve: addition-1, multiplication-2, subtraction-3, division-4, mix of all four-5");
		Scanner problem = new Scanner(System.in);
		int problemtype;
		problemtype =problem.nextInt();
        problem.close();
		return problemtype;
	}
		public static void main(String[] args)
	{
		quiz();
	}
}

