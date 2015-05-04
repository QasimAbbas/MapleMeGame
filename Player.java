public class Player{

	private Sprite player;
	private int refreshCounter;

	//The Constructor
	public Player(int width, int height){
		player = new Sprite("player_left_stand1-0.png");
		player.setPosition(width/2, height/2);
		player.setSize(78,76);

	}

	public Sprite getPlayer(){
		return player;
	}


	//player Standing Right Sprites
	public static String[] playerStandingRightImages(){
		String[] playerStandingRight = new String[3];
		playerStandingRight[0] = "player_right_stand1-0.png";
		playerStandingRight[1] = "player_right_stand1-1.png";
		playerStandingRight[2] = "player_right_stand1-2.png";

		return playerStandingRight;
	}

	//player Walking Right Sprites
	public static String[] playerWalkRight(){
		String[] playerWalkLeft = new String[4];
		playerWalkLeft[0] = "player_right_walk1-0.png";
		playerWalkLeft[1] = "player_right_walk1-1.png";
		playerWalkLeft[2] = "player_right_walk1-2.png";
		playerWalkLeft[3] = "player_right_walk1-3.png";

		return playerWalkLeft;
	}


	//player Standing Left Sprites
	public static String[] playerStandingLeftImages(){
		String[] playerStandingLeft = new String[3];
		playerStandingLeft[0] = "player_left_stand1-0.png";
		playerStandingLeft[1] = "player_left_stand1-1.png";
		playerStandingLeft[2] = "player_left_stand1-2.png";

		return playerStandingLeft;
	}


	//player Walking Left Sprites
	public static String[] playerWalkLeft(){
		String[] playerWalkLeft = new String[4];
		playerWalkLeft[0] = "player_left_walk1-0.png";
		playerWalkLeft[1] = "player_left_walk1-1.png";
		playerWalkLeft[2] = "player_left_walk1-2.png";
		playerWalkLeft[3] = "player_left_walk1-3.png";

		return playerWalkLeft;
	}


	//player Walking Widths
	public static int[] playerWalkLeftSize(){
		int[] playerWalkLeft = new int[4];

		playerWalkLeft[0] = 65;
		playerWalkLeft[1] = 70;
		playerWalkLeft[2] = 70;
		playerWalkLeft[3] = 74;

		return playerWalkLeft;

	}


	//Player Walking Left Animation
	public static void playerWalkingLeft(Animation window, Sprite player, boolean walking, boolean goingRight){

		String[] playerWalk = playerWalkLeft();
		int[] playerWalkLeftSize = playerWalkLeftSize();

		int counter = 0;
		int j = 0;
		int i = player.getXposition();

		while(walking){
		counter++;
		player.setPosition(i, player.getYposition());
		i-= 2;

		if(counter % 5 == 0){

			if(j >= 3){
				j = 0;
			}else{
				j++;

			}

			player.setImage(playerWalk[j]);
		}

		if(counter % 10 == 0){
				walking = false;

		}

		window.frameFinished();

		}

	}

	//Player Walking Rigth Animation
	public static void playerWalkingRight(Animation window, Sprite player, boolean walking, boolean goingRight){

		String[] playerWalk = playerWalkRight();
		int[] playerWalkLeftSize = playerWalkLeftSize();

		int counter = 0;
		int j = 0;
		int i = player.getXposition();

		while(walking){
		counter++;
		player.setPosition(i, player.getYposition());
		i+= 2;

		if(counter % 5 == 0){

			if(j >= 3){
				j = 0;
			}else{
				j++;

			}

			player.setImage(playerWalk[j]);
		}

		if(counter % 10 == 0){
				walking = false;

		}

		window.frameFinished();

		}

	}

	//Player Walking Up Animation
	public static void playerWalkingUp(Animation window, Sprite player, boolean walking, boolean goingRight){
		String[] playerWalk = playerWalkRight();
		if(goingRight){
			playerWalk = playerWalkRight();
		}else{
			playerWalk = playerWalkLeft();

		}

		int[] playerWalkLeftSize = playerWalkLeftSize();

		int counter = 0;
		int j = 0;
		int i = player.getYposition();

		while(walking){
		counter++;
		player.setPosition(player.getXposition(), i);
		i+= 2;

		if(counter % 5 == 0){

			if(j >= 3){
				j = 0;
			}else{
				j++;

			}

			player.setImage(playerWalk[j]);
		}

		if(counter % 10 == 0){
				walking = false;

		}

		window.frameFinished();

		}

	}

	//PlayerWalking Down Animation
	public static void playerWalkingDown(Animation window, Sprite player, boolean walking, boolean goingRight){
		String[] playerWalk = playerWalkRight();

		if(goingRight){
			playerWalk = playerWalkRight();
		}else{
			playerWalk = playerWalkLeft();

		}
		int[] playerWalkLeftSize = playerWalkLeftSize();

		int counter = 0;
		int j = 0;
		int i = player.getYposition();

		while(walking){
		counter++;
		player.setPosition(player.getXposition(), i);
		i-= 2;

		if(counter % 5 == 0){

			if(j >= 3){
				j = 0;
			}else{
				j++;

			}

			player.setImage(playerWalk[j]);
		}

		if(counter % 10 == 0){
				walking = false;

		}

		window.frameFinished();

		}

	}


}
