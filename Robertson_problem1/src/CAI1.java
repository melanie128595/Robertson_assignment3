import java.util.Scanner;
import java.security.SecureRandom;
public class CAI1 {
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
	      
	      
	      if (answer != firstnum * secondnum)
	    	   
	      displayIncorrectResponse();
	      System.out.printf("What is " +firstnum+ " times " +secondnum+ "?\n");
	      
	      if (answer == firstnum * secondnum)
	      displayCorrectResponse();
	      System.exit(0);
	      }
	      	
	public static void displayCorrectResponse() 
	{
		System.out.printf("Very good!");	
	}
	public static void displayIncorrectResponse() 
	{
		System.out.printf("No. Please try again");
	}
		public static void main(String[] args)
	{
		quiz();
	}
}
