package project;

	import java.util.*;
	class Guesser
	{
		int guessNum;
		
		public int guessNum()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Guesser kindly guess the number");
			guessNum=sc.nextInt();
			if(guessNum>0 && guessNum<100)
			return guessNum;
			else {
				System.out.println("Guesser kindly guess the number in 1 to 99");
				guessNum=sc.nextInt();
				return guessNum;
			}
			
		}	
	}

	class Player
	{
		int guessNum;
		
		public int guessNum()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Player kindly guess the number");
			guessNum=scan.nextInt();
			if(guessNum>0 && guessNum<100)
			return guessNum;
			else {
				System.out.println("Player kindly guess the number in 1 to 99");
				guessNum=scan.nextInt();
				}
				return guessNum;
		}
				

	}

	class Umpire
	{
		int numFromGuesser;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;
		
		void collectNumFromGuesser()
		{
			Guesser g=new Guesser();
			numFromGuesser=g.guessNum();
		}
		void collectNumFromPlayers()
		{
			Player p1=new Player();
			Player p2=new Player();
			Player p3=new Player();
			numFromPlayer1=p1.guessNum();
			numFromPlayer2=p2.guessNum();
			numFromPlayer3=p3.guessNum();
		}
		void compare()
		{
			if(numFromGuesser==numFromPlayer1)
			{
				if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				{
					System.out.println("All players won the game");
				}
				else if(numFromGuesser==numFromPlayer2 )
				{
					System.out.println("Player 1 & Player2 won");
				}
				else if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 1 & Player3 won");
				}
				else
				{
				System.out.println("Player 1 won the game");
				}
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 2 & Player3 won");
				}
				else
				{
				System.out.println("Player 2 won the game");
				}
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 3 won the game");
			}
			else
			{
				System.out.println("Game lost Try Again!");
			}
			
		}
		
	}

	public class GuesserGame  {

		public static void main(String[] args) {
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();
			

		}
	}

	


