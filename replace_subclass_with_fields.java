class Person {
  static Person createMale() {
    return new Person(true, 'M');
  }
  static Person createFemale() {
    return new Person(false, 'F');
  }
  protected Person(boolean isMale, char code) {
    this.isMale = isMale;
    this.code = code;
  }

  private final boolean isMale;
  private final char code;

  boolean isMale() {
    return isMale;
  }
  char getCode() {
    return code;
  }
}


class de{
  public static void main(String[] arg){
    Person kent = Person.createMale();
    System.out.print("Person's gender is: " + kent.getCode());

  }
}
