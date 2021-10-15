class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}
class Altimeter {
  @Override
  public String toString() {
    return "Measure height\n";
  }
}
class AirGauge {
@Override
  public String toString() {
    return "Measure air pressure\n";
  }
}
class ControlPanel {
  private Altimeter altimeter = new Altimeter();
  private AirGauge airGauge = new AirGauge();
public void control() {
  System.out.println(altimeter.toString() + airGauge.toString());
}
}
    