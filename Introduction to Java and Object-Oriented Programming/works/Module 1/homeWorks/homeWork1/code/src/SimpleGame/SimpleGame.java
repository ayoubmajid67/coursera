package simplegame.src.SimpleGame;

import java.util.Scanner;



public class SimpleGame {

	public String convertTime(int seconds){
		// TODO: Your code goes here
		if(seconds == 0) return "0:0:0";
		else if(seconds < 0) return "-1:-1:-1";
		else {
			int L = seconds % 60;
			int D = seconds / 60;
			int R = D % 60;
			D = D / 60;
			return D + ":" + R + ":" + L;
		}
	}


	public int digitsSum(int input){
		// TODO: Your code goes here
		String str = String.valueOf(input);
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (str.charAt(i) - '0');
		}
		return sum;
	}

	public static void main(String[] args) {
		// Create an instance of the simplegame.src.SimpleGame.SimpleGame class.
		// TODO: Your code goes here
		SimpleGame game = new SimpleGame();

		Scanner sc = new Scanner(System.in);

		// Ask the user which game to play.
		// Then ask the user for input and pass the value to the corresponding method.

		// If the user enters 1, ask for an integer to convert and call the convertTime method.
		// If the user enters 2, ask for an integer and call the digitsSum method.

		// TODO: Your code goes here
		System.out.println("_______Enter Your choice_______\n1 - Convert time : \n2 - sum : ");
		int choice = sc.nextInt();

		if(choice == 1) {
			System.out.println("Enter the Seconds : ");
			int input = sc.nextInt();
			System.out.println(game.convertTime(input));
		} else if(choice == 2) {
			System.out.println("Enter a Number : ");
			int input = sc.nextInt();
			System.out.println("The sum :"+ game.digitsSum(input));
		}

		sc.close();
	}
}