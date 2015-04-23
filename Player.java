public class Player{

	private Sprite player;

	//The Constructor
	public Player(int width, int height){
		player = new Sprite("player_left_stand1-0.png");
		player.setPosition(0, height/2);
		player.setSize(78,76);

	}

	public Sprite getPlayer(){
		return player;
	}

	//player Standing Left Sprite
	public static String[] playerStandingLeftImages(){
		String[] playerStandingLeft = new String[3];
		playerStandingLeft[0] = "player_left_stand1-0.png";
		playerStandingLeft[1] = "player_left_stand1-1.png";
		playerStandingLeft[2] = "player_left_stand1-2.png";

		return playerStandingLeft;
	}


	//player Walking Left
	public static String[] playerWalkLeft(){
		String[] playerWalkLeft = new String[4];
		playerWalkLeft[0] = "player_left_walk1-0.png";
		playerWalkLeft[1] = "player_left_walk1-1.png";
		playerWalkLeft[2] = "player_left_walk1-2.png";
		playerWalkLeft[3] = "player_left_walk1-3.png";

		return playerWalkLeft;
	}

	//player Walking Left Widths
	public static int[] playerWalkLeftSize(){
		int[] playerWalkLeft = new int[4];

		playerWalkLeft[0] = 65;
		playerWalkLeft[1] = 70;
		playerWalkLeft[2] = 70;
		playerWalkLeft[3] = 74;

		return playerWalkLeft;

	}


}
