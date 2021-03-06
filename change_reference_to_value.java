import java.util.*;

class Customer {
  private final String name;
  private Date birthDate;

  @Override public boolean equals(Object arg) {
    if (!(arg instanceof Customer)) {
      return false;
    }
    Customer other = (Customer) arg;
    return (name.equals(other.name) &&
        birthDate.compareTo(other.birthDate) == 0);
  }
  @Override public int hashCode() {
    return name.hashCode();
  }
  public String getName() {
    return name;
  }
  public Date getBirthDate() {
    return birthDate;
  }
  public Customer(String name, Date birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }
}

class de{
  public static void main(String[] arg){
    Customer john = new Customer("John Smith", new Date(1985, 1, 1));
  }
}