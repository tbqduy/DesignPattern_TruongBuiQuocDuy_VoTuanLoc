abstract class Employee {
  // ...
  static final int ENGINEER = 0;
  static final int SALESMAN = 1;
  static final int MANAGER = 2;

  abstract public int getType();

  public static Employee create(int type) {
    switch (type) {
      case ENGINEER:
        return new Engineer();
      case SALESMAN:
        return new Salesman();
      case MANAGER:
        return new Manager();
      default:
        throw new RuntimeException("Incorrect Employee Code");
    }
  }

  public int monthlySalary;
  public int payAmount() {
    return monthlySalary;
  }
}

class Engineer extends Employee {
  @Override public int getType() {
    return Employee.ENGINEER;
  }
}

class Salesman extends Employee {
  public int commission;
  @Override public int getType() {
    return Employee.SALESMAN;
  }
  @Override public int payAmount() {
    return monthlySalary + commission;
  }
}

class Manager extends Employee {
  public int bonus;
  @Override public int getType() {
    return Employee.MANAGER;
  }
  @Override public int payAmount() {
    return monthlySalary + bonus;
  }
}

class de{
  public static void main(String[] arg){
    Employee e = new Manager();
    e.payAmount();
  }
}