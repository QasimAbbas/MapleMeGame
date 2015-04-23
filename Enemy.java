public class Enemy{

	private Sprite enemy;

	//The Constructor
	public Enemy(int width, int height){
		enemy = new Sprite("enemy_left_stand1-0.png");
		enemy.setPosition(width, height/2);
		enemy.setSize(78,76);
	}

	public Sprite getEnemy(){
		return enemy;
	}

	//Enemy Standing Left Sprite
	public static String[] enemyStandingLeftImages(){
		String[] enemyStandingLeft = new String[3];
		enemyStandingLeft[0] = "enemy_left_stand1-0.png";
		enemyStandingLeft[1] = "enemy_left_stand1-1.png";
		enemyStandingLeft[2] = "enemy_left_stand1-2.png";

		return enemyStandingLeft;
	}

	//Enemy Standing Left
	public static void enemyStandingLeft(Animation window, Sprite enemy, int fps){

		String[] enemyStanding = enemyStandingLeftImages();
		boolean somethingHappened = false;
		int counter = 0;
		int i = 0;
		while(somethingHappened == false){

			if(counter % 30 ==0 ){
				if(i < enemyStanding.length){

					enemy.setImage(enemyStanding[i]);
				}else{
					i = 0;
				}
			}

		}

	}




	//Enemy Walking Left
	public static String[] enemyWalkLeft(){
		String[] enemyWalkLeft = new String[4];
		enemyWalkLeft[0] = "enemy_left_walk1-0.png";
		enemyWalkLeft[1] = "enemy_left_walk1-1.png";
		enemyWalkLeft[2] = "enemy_left_walk1-2.png";
		enemyWalkLeft[3] = "enemy_left_walk1-3.png";

		return enemyWalkLeft;
	}

	//Enemy Walking Left Widths
	public static int[] enemyWalkLeftSize(){
		int[] enemyWalkLeft = new int[4];

		enemyWalkLeft[0] = 65;
		enemyWalkLeft[1] = 70;
		enemyWalkLeft[2] = 70;
		enemyWalkLeft[3] = 74;

		return enemyWalkLeft;

	}


//Static Enemy Walking Left
	public static void enemyMovement(Animation window,Sprite player, Sprite enemy){
		String[] enemyWalk = enemyWalkLeft();
		int[] enemyWalkSize = enemyWalkLeftSize();

		int j = 0;
		int counter = 0;

		int i = enemy.getXposition();

		while(enemy.getXposition() != player.getXposition()){
			counter++;
			enemy.setPosition(i, enemy.getYposition());
			i--;

			if(counter % 10 == 0){

				if(j >= 3){
					j = 0;
				}else{
					j++;
				}

				enemy.setImage(enemyWalk[j]);
				enemy.setSize(enemyWalkSize[j], 76);
			}

			window.frameFinished();
		}

	}

}
