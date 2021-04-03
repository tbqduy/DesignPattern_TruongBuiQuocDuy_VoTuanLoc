import java.util.*;
class Customer {
  private static Dictionary instances = new Hashtable();

  
  static void loadCustomers() {
    new Customer("Lemon Car Hire").store();
    new Customer("Associated Coffee Machines").store();
    new Customer("Bilston Gasworks").store();
  }
  private void store() {
    instances.put(this.getName(), this);
  }

  private final String name;
  public static Customer getNamed(String name) {
    return (Customer) instances.get(name);
  }
  private Customer(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}

class Order {
  private Customer customer;
  public String getCustomerName() {
      return customer.getName();
  }
  public void setCustomer(String customerName) {
    customer = Customer.getNamed(customerName);
  }
  public Order(String customerName) {
    customer = Customer.getNamed(customerName);
  }
}

class de{
  public static void main(String[] arg){
    Order _customer = new Order("Lemon Car Hire");
  }
}
