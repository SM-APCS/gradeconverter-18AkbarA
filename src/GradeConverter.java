//Alright, gonna try to use scanner:
import java.util.Scanner;


public class GradeConverter {
	
	//Cuz i dont wanna repeatedly type system.out.print
	public static void displayText(String text){
		System.out.print(text);
	}
	 public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
		 	displayText("What grade did you get? ");
		    int grade = scanner.nextInt();
		    
		    if (grade > 96){
		    	displayText("\n You got an A+. Gj. \n");
		    }
		    
		    else if (grade >= 94 && grade <= 96){
		    	displayText("You got an A. Aight. \n");
		    }
		    else if (grade >= 90 && grade < 94){
		    	displayText("You got an A-. Cool. That's the way to go. \n");
		    }
		    else if (grade >= 86 && grade < 90){
		    	displayText("You got an B+. Average \n");
		    }
		    else if (grade >= 83 && grade < 86){
		    	displayText("You got an B. No comment \n");
		    }
		    else if (grade >= 80 && grade < 83){
		    	displayText("You got an B-. U slippin' boy! \n");
		    }
		    else if (grade < 80){
		    	displayText("C. Fail. I'm not going any lower. \n");
		    	
		    }
		    
		    displayText("So... how did you like that?");
		    String comment = scanner.next();
		    
		    displayText("\n Thanks for the comment! It wasn't sent to any server and 18AkbarA will never read it!");
		 
	 }
}


