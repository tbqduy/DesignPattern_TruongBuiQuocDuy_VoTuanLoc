class Customer {
  public Customer (String name) {
    _name = name;
  }
  public String getName(){
    return _name;
  }
  private final String _name;
}

class Order{
  public Order (String customer){
    _customer = new Customer(customer);
  }
  public String getCustomer(){ 
    return _customer.getName();
  }

  private Customer _customer;
  
  public void setCustomer(String customerName){
    _customer = new Customer(customerName);
  }
  static String numberOfOrdersFor(int numorder, String customer) {
    String num = String.valueOf(numorder);
    return "Customer: " + (String) customer +  "|" + num;
  }
}

class de{
  public static void main(String[] arg){
    Order a = new Order("ABC");

    Order b = new Order("ABC");

    a = new Order("ABC");

    a.numberOfOrdersFor(5, "ABC");
  }
}