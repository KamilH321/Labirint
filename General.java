public class General{
    public static void main(String[] args){
        Game game = new Game();
        Menu menu = new Menu();
        menu.main_menu_window();
        if (menu.getLvl_num() == 1){
            game.game_process(1, menu);
        }
    }
}   





