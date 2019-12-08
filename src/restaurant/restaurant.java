package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class restaurant {

        public static void main(String[] args) {

            Menu menu = new Menu ();

            ArrayList<MenuItem> menuItems = new ArrayList<>();

            MenuItem menuItem1 = new MenuItem(1, "Pizza", "this crust cheese pizza", "Lunch", 4.00, new Date());
            menuItems.add(menuItem1);

            MenuItem menuItem2 = new MenuItem(2, "Talapia", "grilled talapia", "Sea food", 12.50, new Date());
            menuItems.add(menuItem2);

            menu.setMenuItems(menuItems);

            System.out.println(menu);
        }
    }

