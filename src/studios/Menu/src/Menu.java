import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> restaurantMenu;
    private Date updated;

    Menu () {
        this.restaurantMenu = new ArrayList<>();
        this.updated = new Date ();
    }

public void addMenuItem (MenuItem item) {

        this.restaurantMenu.add(item);
        this.updated = new Date();
        }
}
