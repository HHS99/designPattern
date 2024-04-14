import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
  List<MenuItem> menuItems;
  public PancakeHouseMenu() {
    menuItems = new ArrayList<MenuItem>();

    addItem("Pancake Set", "Pancakes with coke", true, 2.99);
    addItem("regular", "regular Pancakes", false, 2.99);
    addItem("blueberry", "blueberry Pancakes", true, 3.49);
    addItem("waffle", "waffle Pancakes", true, 3.59);
  }

  public void addItem(
    String name,
    String description,
    boolean vegetarian,
    double price 
  ) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public Iterator createIterator() {
    return new PancakeHousemenuIterator(menuItems);
  }
}
