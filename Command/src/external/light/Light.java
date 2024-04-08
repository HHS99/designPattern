package external.light;

public class Light {
  String location;

  public Light(String string) {
    this.location = string;
  }

  public void on() {
    System.out.println(location + "light on");
  }

  public void off() {
    System.out.println(location + "light off");
  }
}
