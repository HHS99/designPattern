/**
 * Connects to Iterator
 */
public class CompositeApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Composite!");

        MenuComponent pancakeMenu = new Menu("pancakeHouse Menu", "breakefast menu");
        MenuComponent dinerMenu = new Menu("diner Menu", "lunch menu");
        MenuComponent cafeMenu = new Menu("cafe Menu", "dining menu");
        MenuComponent dessertMenu = new Menu("dessert Menu", "enjoy dessert");

        MenuComponent allMenus = new Menu("All Menu", "All Menu");
        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeMenu.add(new MenuItem("Pancake Set", "Pancakes with coke", true, 2.99));
        pancakeMenu.add(new MenuItem("regular", "regular Pancakes", false, 2.99));
        pancakeMenu.add(new MenuItem("blueberry", "blueberry Pancakes", true, 3.49));
        pancakeMenu.add(new MenuItem("waffle", "waffle Pancakes", true, 3.59));
        
        dinerMenu.add(new MenuItem("vegetarian BLT", "bean meet", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "pork meet", false, 2.99));
        dinerMenu.add(new MenuItem("soup", "today soup", false, 3.29));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("apple pie", "ice apple pie", true, 1.59));
        
        cafeMenu.add(new MenuItem("Veggie burger set", "Veggie burger", true, 3.99));
        cafeMenu.add(new MenuItem("Today Soup", "Soup with salad", false, 3.79));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
