import java.util.Iterator;

public class DinerMenu implements Menu {
  static final int MAX_ITEMS = 6;
  int numberOfImtems = 0;
  MenuItem[] menuItems;

  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("vegetarian BLT", "bean meet", true, 2.99);
    addItem("BLT", "pork meet", false, 2.99);
    addItem("soup", "today soup", false, 3.29);
  }

  public void addItem(
      String name,
      String description,
      boolean vegetarian,
      double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfImtems >= MAX_ITEMS) {
      System.out.println("Sorry. don't add menu");
    } else {
      menuItems[numberOfImtems] = menuItem;
      numberOfImtems++;
    }
  }

  @Override
  public Iterator<MenuItem> creatIterator() {
    return new DinerMenuIterator(menuItems);
  }

}
