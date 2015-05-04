public class Movie{

	public static void main(String[] args){
		int height = 600;
		int  width = 600;
		int fps = 120;

		Animation window = new Animation(width,height);
		window.setBackgroundImage("grass.png");
		window.setFrameRate(fps);

		Player player = new Player(width, height);
		window.addSprite(player.getPlayer());

		Enemy enemy = new Enemy(width,height);
		window.addSprite(enemy.getEnemy());

		boolean game = false;
		boolean goingRight = false;

		while(game == false){

			//PLayer Movement

			if(window.playerMoveLeft() == true){

					goingRight = false;
				//System.out.println("Left");
					player.playerWalkingLeft(window, player.getPlayer(), true, goingRight);

				}else if(window.playerMoveRight() == true){

					goingRight = true;
				// System.out.println("Right");
					player.playerWalkingRight(window, player.getPlayer(), true, goingRight);

				}else if(window.playerMoveUp() == true){


				//	System.out.println("Up");
					player.playerWalkingUp(window, player.getPlayer(), true, goingRight);

				}else if(window.playerMoveDown() == true){

				//	System.out.println("Down");
					player.playerWalkingDown(window, player.getPlayer(), true, goingRight);

				}


				player.playerWalkingLeft(window, player.getPlayer(), false, goingRight);
				player.playerWalkingRight(window, player.getPlayer(), false, goingRight);

				//enemy.enemyMovement(window, player.getPlayer(), enemy.getEnemy());
				window.frameFinished();

			}

	}

}
