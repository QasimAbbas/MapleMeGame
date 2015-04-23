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
		
		window.frameFinished();


	}
}
