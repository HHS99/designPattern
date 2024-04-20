
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
  Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

  public CafeMenu() {
    addItem("Veggie burger set", "Veggie burger", true, 3.99);
    addItem("Today Soup", "Soup with salad", false, 3.79);
  }

  public void addItem(
    String name,
    String description,
    boolean vegetarian,
    double price 
  ) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.put(name, menuItem);
  }

  @Override
  public Iterator<MenuItem> creatIterator() {
    return menuItems.values().iterator();
  }

}
