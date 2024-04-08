public class TemplateMethodApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("------------create tea------------");
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println();
        
        System.out.println("------------create coffe------------");
        Coffe coffe = new Coffe();
        coffe.prepareRecipe();
        System.out.println();
    }
}
