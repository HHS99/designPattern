public class AdapterApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Duck mallarDuck = new MallarDuck();
        Turkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("say duck");
        mallarDuck.quack();
        mallarDuck.fly();

        System.out.println("say turkey");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("say turkey adapter");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
