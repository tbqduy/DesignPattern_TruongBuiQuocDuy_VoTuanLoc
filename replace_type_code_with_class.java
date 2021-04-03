class Person {
  private BloodGroup bloodGroup;

  public Person(BloodGroup bloodGroup) {
    bloodGroup = bloodGroup;
  }
  public void setBloodGroup(BloodGroup bloodGroup) {
    bloodGroup = bloodGroup;
  }
  public BloodGroup getBloodGroup() {
    return bloodGroup;
  }
}

class BloodGroup {
  private final int code;

  private BloodGroup(int code) {
    this.code = code;
  }
  public int getCode() {
    return this.code;
  }

  public static BloodGroup O() {
    return new BloodGroup(0);
  }
  public static BloodGroup A() {
    return new BloodGroup(1);
  }
  public static BloodGroup B() {
    return new BloodGroup(2);
  }
  public static BloodGroup AB() {
    return new BloodGroup(3);
  }

  
}

class de{
  public static void main(String[] arg){
    // Person kent = Person.createMale();
    Person parent = new Person(BloodGroup.O());
    Person child = new Person(BloodGroup.A());
    child.setBloodGroup(parent.getBloodGroup());
  }
}