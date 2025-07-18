public class D6toD20Adapter implements Dice {
  private final D6 d6;
  
  public D6toD20Adapter(D6 d6) {
    this.d6 = d6;
  }

  @Override
  public int roll() {
    int res = 0;
    for (int i = 0; i < 3; i++) {
      res = res * 6 + (d6.roll() - 1);
    }
    return (res % 20) + 1;
  }
}
