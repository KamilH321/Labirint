public class Moovment{

	public boolean moov_up(Lvl1 lvl1){
		if ((lvl1.getY()-1 >= 0) && (lvl1.getY()-1 <= 9) && lvl1.getLvl()[lvl1.getY()-1][lvl1.getX()] != '#'){
			lvl1.setY(lvl1.getY() - 1);
			lvl1.setLvl(lvl1.getLvl());
			lvl1.print_map(lvl1.getLvl());
			lvl1.count_Stars();
			return true;
		}
		else{
			lvl1.setLvl(lvl1.getLvl());
			lvl1.print_map(lvl1.getLvl());
			lvl1.count_Stars();
			return false;
		}
	}

	public boolean moov_left(Lvl1 lvl1){
		if ((lvl1.getX()-1 >= 0) && (lvl1.getX()-1 <= 9) && (lvl1.getLvl()[lvl1.getY()][lvl1.getX()-1] != '#')){
			lvl1.setX(lvl1.getX() - 1);
			lvl1.setLvl(lvl1.getLvl());
			lvl1.print_map(lvl1.getLvl());
			lvl1.count_Stars();
			return true;
		}
		else{
			lvl1.setLvl(lvl1.getLvl());
			lvl1.print_map(lvl1.getLvl());
			lvl1.count_Stars();
			return false;
		}
	}

	public boolean moov_down(Lvl1 lvl1){
		if ((lvl1.getY()+1 >= 0) && (lvl1.getY()+1 <= 9) && lvl1.getLvl()[lvl1.getY()+1][lvl1.getX()] != '#'){
			lvl1.setY(lvl1.getY() + 1);
			lvl1.setLvl(lvl1.getLvl());
			lvl1.print_map(lvl1.getLvl());
			lvl1.count_Stars();
			return true;
		}
		else{
			lvl1.setLvl(lvl1.getLvl());
			lvl1.print_map(lvl1.getLvl());
			lvl1.count_Stars();
			return false;
		}
	}

	public boolean moov_right(Lvl1 lvl1){
		if ((lvl1.getX()+1 >= 0) && (lvl1.getX()+1 <= 9) && lvl1.getLvl()[lvl1.getY()][lvl1.getX()+1] != '#'){
			lvl1.setX(lvl1.getX() + 1);
			lvl1.setLvl(lvl1.getLvl());
			lvl1.print_map(lvl1.getLvl());
			lvl1.count_Stars();
			return true;
		}
		else{
			lvl1.setLvl(lvl1.getLvl());
			lvl1.print_map(lvl1.getLvl());
			lvl1.count_Stars();
			return false;
		}
	}

}