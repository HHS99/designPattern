public class Tea extends CaffeineBeverage {

  @Override
  void brew() {
    System.out.println("Brewing tea leaves");
  }

  @Override
  void addCondiments() {
    System.out.println("adding remon");
  }

}
