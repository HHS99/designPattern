public class GumBallMachine {
  final static int SOLD_OUT = 0;
  final static int NO_QUARTER = 1;
  final static int HAS_QUARTER = 2;
  final static int SOLD = 3;

  int state = SOLD_OUT;
  int count = 0;

  public GumBallMachine(int count) {
    this.count = count;
    if (count > 0) {
      state = NO_QUARTER;
    }
  }

  public void insertQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("insert only one coin");
    } else if (state == NO_QUARTER) {
      state = HAS_QUARTER;
      System.out.println("inserted coin");
    } else if (state == SOLD_OUT) {
      System.out.println("Sold out. Please try again next time");
    } else if (state == SOLD) {
      System.out.println("exporting kernel");
    }
  }

  public void ejectQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("eject coin");
      state = NO_QUARTER;
    } else if (state == NO_QUARTER) {
      System.out.println("please put in coin");
    } else if (state == SOLD_OUT) {
      System.out.println("too late");
    } else if (state == SOLD) {
      System.out.println("is not coin");
    }
  }

  public void turnCrank() {
    if (state == HAS_QUARTER) {
      System.out.println("turn the crank");
      state = SOLD;
      dispond();
    } else if (state == NO_QUARTER) {
      System.out.println("please put in coin");
    } else if (state == SOLD_OUT) {
      System.out.println("sold out");
    } else if (state == SOLD) {
      System.out.println("turn the crank only once");
    }
  }

  public void dispond() {
    if (state == HAS_QUARTER) {
      System.out.println("Cannot export kernel");
      state = SOLD;
      dispond();
    } else if (state == NO_QUARTER) {
      System.out.println("please put in coin");
    } else if (state == SOLD_OUT) {
      System.out.println("sold out");
    } else if (state == SOLD) {
      System.out.println("exporting kernel");
      count = count - 1;
      if (count == 0) {
        System.out.println("no kernel");
        state = SOLD_OUT;
      } else {
        state = NO_QUARTER;
      }
    }
  }

  @Override
  public String toString() {
    System.out.println();
    System.out.println("gumball game!!!");
    System.out.println("Remaining count: " + count);
    System.out.println("Waiting to insert coin, " + state);

    return "";
  }

}
