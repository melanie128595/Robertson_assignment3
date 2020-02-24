import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;
public class CAI2 {
	private static int answer;
	private static int firstnum;
	private static int secondnum;
	public static void quiz()
	{
	      askQuestion();
	      readResponse();
	      isAnswerCorrect();
	}
	public static int askQuestion() 
	{
		Scanner ask = new Scanner(System.in);
	      SecureRandom questionNumbers = new SecureRandom();

	      int firstnum; 
	      firstnum= questionNumbers.nextInt(10);
	      int secondnum;
	      secondnum= questionNumbers.nextInt(10);  
	     
		System.out.printf("What is " +firstnum+ " times " +secondnum+ "?\n");
	
		return firstnum*secondnum;
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
		public static void main(String[] args)
	{
		quiz();
	}
}


