import java.util.Scanner;


public class Game{
	public void game_process(int num, Menu menu){
		Scanner in = new Scanner(System.in);
		ClearConsole clear = new ClearConsole();
		Lvl1 lvl1 = new Lvl1();
		if (num == 1){
			lvl1 = lvl1;
		}
		Moovment moov = new Moovment();
		lvl1.setLvl(lvl1.getLvl());
		lvl1.print_map(lvl1.getLvl());
		String step = "";
		while(!step.equals("0") && lvl1.check_ending() == 0){
			step = in.next();
			switch(step){
				case "w":
					if (moov.moov_up(lvl1)){
						break;
					}
					break;
				case "a":
					if (moov.moov_left(lvl1)){
						break;
					}
					break;
				case "s":
					if (moov.moov_down(lvl1)){
						break;
					}
					break;
				case "d":
					if (moov.moov_right(lvl1)){
						break;
					}
					break;
			}
		}
		clear.clear_console();
		menu.win_window(lvl1.getCount_Stars());
	}
}
