import java.util.Scanner;

public class Menu{
	Scanner in = new Scanner(System.in);
	private int lvl_num = 0;
	ClearConsole clear = new ClearConsole();

	public void setLvl_num(int lvl_num){
		this.lvl_num = lvl_num;
	}

	public int getLvl_num(){
		return lvl_num;
	}

	public void main_menu_window(){
		System.out.println("<--------------------------------------->");
		System.out.println("<           Добро пожаловать!           >");
		System.out.println("<           Выберете действие:          >");
		System.out.println("<           1.Выбрать уровень           >");
		System.out.println("<           2.Правила                   >");
		System.out.println("<--------------------------------------->");
		int choice = in.nextInt();
		if (choice == 1){
			clear.clear_console();
			choice_lvl_window();
		}
		else if (choice == 2){
			clear.clear_console();
			rules_window();
		}
		else{
			System.out.println("Неверная команда");
		}
	}

	public void rules_window(){
		System.out.println("<------------------------------------------------------------------------------>");
		System.out.println("<          Итак, теперь давайте поговрим о правилах игры.                      >");
		System.out.println("<          Всего есть 3 уровня: простой, средний, сложный.                     >");
		System.out.println("<          В каждом уровне будет лабиринт лишь с одним выходом,                >");
		System.out.println("<          а также 3 звезды, вы можете пройти игру на разное                   >");
		System.out.println("<          кол-во звёзд, у лабиринта есть стенки, через котроые                >");
		System.out.println("<          вы естественно не можете пройти. Чтобы выбрать уровень              >");
		System.out.println("<          нужно вписать в консоль 1, 2 или 3. На этом всё, удачной игры!      >");
		System.out.println("<          Хотите вернуться в стартовое меню? 1 - Да, 2 - Нет                  >");
		System.out.println("<------------------------------------------------------------------------------>");
		int choice = in.nextInt();
		if (choice == 1){
			clear.clear_console();
			main_menu_window();
		}
		else if (choice == 2){
			int x = 0;
		}
		else{
			System.out.println("Неверная команда");
		}
	}

	public void choice_lvl_window(){
		System.out.println("<--------------------------------------->");
		System.out.println("<                Уровни:                >");
		System.out.println("<           1.Лёгкий уровень            >");
		System.out.println("<           2.Средний уровень           >");
		System.out.println("<           3.Сложный уровень           >");
		System.out.println("<       4.Вернуться в главное меню      >");
		System.out.println("<--------------------------------------->");
		int choice = in.nextInt();
		if (choice == 1){
			setLvl_num(1);
		}
		else if (choice == 2){
			setLvl_num(2);
		}
		else if (choice == 3){
			setLvl_num(3);
		}
		else if (choice == 4){
			clear.clear_console();
			main_menu_window();
		}
		else{
			System.out.println("Неверная команда");
		}
	}

	public void win_window(int count_str){
		System.out.println("<--------------------------------------->");
		System.out.println("<            Вы нашли выход             >");
		System.out.println("<        Вы собрали " + count_str +" из 3 звёзд        >");
		System.out.println("<                                       >");
		System.out.println("<                                       >");
		System.out.println("<   Желаете вернуться в главное меню?   >");
		System.out.println("<           1 - Да, 2 - Нет             >");
		System.out.println("<--------------------------------------->");
	int choice = in.nextInt();
	if (choice == 1){
		clear.clear_console();
		main_menu_window();
	}
	else if (choice == 2){
		int x = 0;
	}
	else{
		System.out.println("Неверная команда");
	}
	}
}