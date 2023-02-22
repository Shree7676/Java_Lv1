import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1 choose!");
        String RockOrPaperOrScissors = input.nextLine();

        System.out.println("Player 2 choose!");
        String RockOrPaperOrScissors2 = input.nextLine();
        System.out.println(RockOrPaperOrScissors.equals(RockOrPaperOrScissors2));
        
        if (RockOrPaperOrScissors.equals("Rock") && RockOrPaperOrScissors2.equals("Paper")) {
            System.out.println("Paper beats rock, Player 2 Wins!");
        }
        else if (RockOrPaperOrScissors.equals("Paper") && RockOrPaperOrScissors2.equals("Rock")) {
            System.out.println("Paper beats rock, Player 1 Wins!");
        }
        else if (RockOrPaperOrScissors.equals("Scissors")  && RockOrPaperOrScissors2.equals("Paper")) {
            System.out.println("Scissors beats Paper, Player 1 Wins!");
        }
        else if (RockOrPaperOrScissors.equals("Paper") && RockOrPaperOrScissors2.equals("Scissors")) {
            System.out.println("Scissors beat Paper, Player 2 Wins!");
        }
    }
}
