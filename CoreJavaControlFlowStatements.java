import java.util.Scanner;

public class CoreJavaControlFlowStatements {


public static void main(String[] args) {
	// Core Java Exercise Control Flow (Conditional) Statements	
	// 1
			int x = 15;
			if (x < 10) {
				System.out.println("Less than 10");
		    }
	// 2
			int x = 15;
			if (x < 10) {
				System.out.println("Less than 10");
			} else {
			System.out.println("Greater than 10");
			}

	// 3
			int x = 25;
			if (x < 10) {
				System.out.println("Less than 10");
			} else if (x > 10 && x < 20) {
				System.out.println("Between 10 and 20");
			} else {
				System.out.println("Greater than or equal to 20");
			}

	// 4
			int x = 15;
			if (x < 10 || x > 20) {
				System.out.println("Out of range");
			} else {
				System.out.println("In range");
			}
			
	// 5
			Scanner sc = new Scanner(System.in);
			
			int score;
			String grade;
			
			System.out.print("Enter test score:");
			score = sc.nextInt();
			
			if (score >= 90 && score <= 100) {
				grade = "A";
			} else if (score >= 80 && score < 90) {
				grade = "B";
			} else if (score >= 70 && score < 80) {
				grade = "C";
			} else if (score >= 60 && score < 70) {
				grade = "D";
			} else if (score < 60 && score > 0 && score < 60){
				grade = "F";
			} else {
				grade = "Not in range.";
			}
				System.out.println("Grade:" + grade);
			
	// 6
			Scanner weekdays = new Scanner(System.in);
			
			int day;
			System.out.print("Enter a day number to get the day of the week: ");
			day = weekdays.nextInt();
			
			switch (day) {
			case 1:
				System.out.println("Monday");
			break;
			case 2:
				System.out.println("Tuesday");
			break;
			case 3:
				System.out.println("Wednesday");
			break;
			case 4:
				System.out.println("Thursday");
			break;
			case 5:
				System.out.println("Friday");
			break;
			case 6:
				System.out.println("Saturday");
			break;
			case 7:
				System.out.println("Sunday");
			break;
			default: System.out.println("Not in range.");
			}
			
			
	}
			
			
			
}
			
			
			
			
