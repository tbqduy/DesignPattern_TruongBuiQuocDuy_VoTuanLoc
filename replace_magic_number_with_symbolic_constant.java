class Circle {
  static final double PI_ = 3.14;

  double perimeter(double r) {
    return r * 2 * PI_;
  }
}

class de{
  public static void main(String[] agr){
  	Circle c = new Circle();
  	System.out.println(c.perimeter(8));
  }

}