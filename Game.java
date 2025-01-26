import java.util.Scanner;


public class Game{
	public void game_process(){
		Scanner in = new Scanner(System.in);
		Lvl1 lvl1 = new Lvl1();
		Moovment moov = new Moovment();
		lvl1.setLvl(lvl1.getLvl());
		lvl1.print_map(lvl1.getLvl());
		String step = "";
		while(!step.equals("0")){
			step = in.next();
			switch(step){
				case "w":
					if (moov.moov_up()){
						break;
					}
					break;
				case "a":
					if (moov.moov_left()){
						break;
					}
					break;
				case "s":
					if (moov.moov_down()){
						break;
					}
					break;
				case "d":
					if (moov.moov_right()){
						break;
					}
					break;
			}
		}
	}
}
