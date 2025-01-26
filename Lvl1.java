public class Lvl1{
	private char[][] lvl = {
		{'#', '*', '#', '#', '#', '#', '#', '#', '#', '#'}, 
		{'#', '.', '#', '.', '.', '.', '.', '#', '#', '#'},
		{'#', '.', '.', '.', '#', '#', '.', '#', '#', '#'},
		{'#', '#', '#', '.', '#', '#', '.', '#', '#', '#'},
		{'#', '#', '.', '.', '#', '#', '.', '#', '#', '#'},
		{'#', '#', '.', '#', '#', '#', '.', '.', '.', '#'},
		{'#', '#', '.', '#', '.', '.', '.', '#', '.', '#'},
		{'#', '.', '.', '#', '.', '#', '#', '#', '.', '#'},
		{'#', '*', '#', '#', '.', '#', '#', '*', '.', '#'},
		{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
	};
	private int x = 5;
	private int y = 6;
	private int cor_str1_x = 1;
	private int cor_str2_x = 1;
	private int cor_str3_x = 7;
	private int cor_str1_y = 0;
	private int cor_str2_y = 8;
	private int cor_str3_y = 8;
	private char player = '@';
	private int count_stars = 0;

	public void setCor_strsXY1(int x1, int y1){
		this.cor_str1_x = x1;
		this.cor_str1_y = y1;
	}

	public void setCor_strsXY2(int x2, int y2){
		this.cor_str2_x = x2;
		this.cor_str2_y = y2;
	}

	public void setCor_strsXY3(int x3, int y3){
		this.cor_str3_x = x3;
		this.cor_str3_y = y3;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setCount_Stars(int count_stars){
		this.count_stars = count_stars;
	}

	public void setLvl(char[][] lvl){
		ClearConsole clear = new ClearConsole();
		clear.clear_console();
		lvl[y][x] = player;
		if (lvl[y][x-1] == '@'){
			lvl[y][x-1] = '.';
		}
		else if (lvl[y][x+1] == '@'){
			lvl[y][x+1] = '.';
		}
		else if (lvl[y+1][x] == '@'){
			lvl[y+1][x] = '.';
		}
		else if (lvl[y-1][x] == '@'){
			lvl[y-1][x] = '.';
		}
		this.lvl = lvl;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;	
	}

	public int getCount_Stars(){
		return count_stars;
	}

	public char[][] getLvl(){
		return lvl;
	}

	public void print_map(char[][] lvl){
		for (int i = 0; i < lvl.length; i++){
			for (int j = 0; j < lvl[i].length; j++){
				System.out.print(lvl[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public void count_Stars(){
	 	if (x == cor_str1_x &&  y == cor_str1_y) {
	 		setCount_Stars(getCount_Stars() + 1);
	 		setCor_strsXY1(-1, -1);
	 	}
	 	else if (x == cor_str2_x &&  y == cor_str2_y){
	 		setCount_Stars(getCount_Stars() + 1);
	 		setCor_strsXY2(-1, -1);
	 	}
	 	else if (x == cor_str3_x &&  y == cor_str3_y){
	 		setCount_Stars(getCount_Stars() + 1);
	 		setCor_strsXY3(-1, -1);
	 	}
	 }
	
	public void print_count_Stars(){
	 	if (count_stars == 1){
	 		System.out.println("You take: " + count_stars + " star");
	 	}
	 	else{
	 		System.out.println("You take: " + count_stars + " stars");
	 	}
	}
}