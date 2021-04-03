class Range {
  private int low, high;

  int getLow() {
    return low;
  }
  int getHigh() {
    return high;
  }
  void setLow(int arg) {
    low = arg;
  }
  void setHigh(int arg) {
    high = arg;
  }
  public boolean includes(int arg) {
    return arg >= getLow() && arg <= getHigh();
  }
  public void grow(int factor) {
    setHigh(getHigh() * factor);
  }
  public Range(int low, int high) {
    this.low = low;
    this.high = high;
  }
}

class de{
  public static void main(String[] agr){
  	Range r = new Range(2, 3);
    r.setLow(5);
    r.setHigh(15);
  	System.out.println(r.includes(8));
  }

}