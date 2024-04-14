import java.util.List;

public class PancakeHousemenuIterator implements Iterator {
  List<MenuItem> menuItems;
  int position;

  public PancakeHousemenuIterator(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    if (position >= menuItems.size() || menuItems.get(position) == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public MenuItem next() {
   MenuItem menuItem = menuItems.get(position);
   position++;
   return menuItem; 
  }

}
