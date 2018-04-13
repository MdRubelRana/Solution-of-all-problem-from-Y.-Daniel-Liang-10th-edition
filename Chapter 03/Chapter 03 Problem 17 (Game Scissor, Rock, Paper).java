


/**
 * Chapter 03 Problem 3.17  (Game: scissor, rock, paper).
 * 
 * Write a program that plays the popular scissor-rock-paper game. 
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
 * The program prompts the user to enter a number 0, 1, or 2  and
 *  displays a message indicating whether the user or the computer wins, loses, or draws.
 *  
 */
import java.util.Scanner;

public class ScissorRockPaper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int computer = (int) (Math.random() * 3);

		System.out.print("scissor (0), rock (1), paper (2): ");

		int player = input.nextInt();

		String text1 = "The computer is ";
		String text2 = "You are ";
		String text3;

		switch (computer) {
		case 0:
			text1 += "scissor. ";
			break;
		case 1:
			text1 += "rock. ";
			break;
		case 2:
			text1 += "paper. ";
			break;
		}
		switch (player) {
		case 0:
			text2 += "scissor";
			break;
		case 1:
			text2 += "rock";
			break;
		case 2:
			text2 += "paper";
			break;
		}
		if (computer == player) {
			text2 += " too. ";
			text3 = "It is a draw";
		} else if (player == computer + 1 || player == computer - 2) {
			text2 += ". ";
			text3 = "You won";
		} else {
			text2 += ". ";
			text3 = "You lost";
		}
		System.out.println(text1 + text2 + text3);
	}
}