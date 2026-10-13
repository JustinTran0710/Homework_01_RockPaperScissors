import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Declarations
        String A = "";
        String B = "";

        System.out.println("Player A. Rock, Paper, or Scissors!");
        A = in.next();
        System.out.println("Player B. Rock, Paper, or Scissors!");
        B = in.next();
            if (A.equalsIgnoreCase("R") && B.equalsIgnoreCase("P")) {
                System.out.println("Paper Covers Rock! \nPlayer B Wins!!");
            } else if (A.equalsIgnoreCase("P") && B.equalsIgnoreCase("R")) {
                System.out.println("Paper Covers Rock! \nPlayer A Wins!!");
            } else if (A.equalsIgnoreCase("S") && B.equalsIgnoreCase("P")) {
                System.out.println("Scissors Cuts Paper! \nPlayer A Wins!!");
            } else if (A.equalsIgnoreCase("P") && B.equalsIgnoreCase("S")) {
                System.out.println("Scissors Cuts Paper! \nPlayer B Wins!!");
            } else if (A.equalsIgnoreCase("R") && B.equalsIgnoreCase("S")) {
                System.out.println("Rock Crushes Scissors! \nPlayer A Wins!!");
            } else if (A.equalsIgnoreCase("S") && B.equalsIgnoreCase("R")) {
                System.out.println("Rock Crushes Scissors! \nPlayer B Wins!!");
            }
            else if(A.equalsIgnoreCase("R") && B.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs. Rock \nIt's a Tie!!");
            }
            else if(A.equalsIgnoreCase("P") && B.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs. Paper \nIt's a Tie!!");
            }
            else if(A.equalsIgnoreCase("S") && B.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors vs. Scissors \nIt's a Tie!!");
            }
            else
            {
              System.out.println("Your Input is invalid, Try again!");
            }
    }

}