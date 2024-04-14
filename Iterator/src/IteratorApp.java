public class IteratorApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Iterator Pattern!");

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
