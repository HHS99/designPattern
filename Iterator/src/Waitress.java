import java.util.Iterator;

public class Waitress {
  Menu pancakeHouseMenu;
  Menu dinerMenu;
  Menu cafeMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.cafeMenu = cafMenu;
  }

  public void printMenu() {
    Iterator<MenuItem> pancakIterator = pancakeHouseMenu.creatIterator();
    Iterator<MenuItem> dinerIterator = dinerMenu.creatIterator();
    Iterator<MenuItem> cafeIterator = cafeMenu.creatIterator();

    System.out.println("menu----");
    System.out.println("brunch");
    printMenu(pancakIterator);
    System.out.println("diner");
    printMenu(dinerIterator);
    System.out.println("cafe");
    printMenu(cafeIterator);
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}
