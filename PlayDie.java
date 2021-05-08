//Alperen İNCi
//18120205016

public class PlayDie{

	public static void main(String[] args){
	
	
		int winCount[] = {0, 0, 0, 0};

		for (int i = 0; i < 1000; i++){
		
			HoldAt20DiePlayer player1 = new HoldAt20DiePlayer();
			HoldAt25DiePlayer player2 = new HoldAt25DiePlayer();
			RaceToGoalDiePlayer player3 = new RaceToGoalDiePlayer();
			MyDiePlayer player4 = new MyDiePlayer();

			DiePlayer players[] = new DiePlayer[4];
			players[0] = player1;
			players[1] = player2;
			players[2] = player3;
			players[3] = player4;

			

			DieGame game = new DieGame(players);
			winCount[game.play()]++;
		}
		System.out.println("\n");
		for (int i = 0; i < winCount.length; i++){
		    System.out.println("Player "+(i+1));
		    System.out.println(winCount[i]); 
		}     
	}
}