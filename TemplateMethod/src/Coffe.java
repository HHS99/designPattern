import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffe extends CaffeineBeverage {

  @Override
  void brew() {
    System.out.println("Brewing coffee with the filter");
  }

  @Override
  void addCondiments() {
    System.out.println("adding sugar and milk");
  }

  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    if ("y".toLowerCase().startsWith(answer)) {
      return true;
    } else {
      return false;
    }
  }
  
  private String getUserInput() {
    String answer = null;

    System.out.println("Do you want milk and sugar in your coffee? (y/n)?");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.err.println("input error");
    }
    if (answer == null) {
      return "no";
    }
    return answer;
  }

}
