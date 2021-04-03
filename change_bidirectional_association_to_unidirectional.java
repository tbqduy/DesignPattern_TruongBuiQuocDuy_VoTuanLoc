import java.util.*;

class Order
{


  public final Customer getCustomer()
  {
    CustomerSearch tempVar = new CustomerSearch();
    tempVar.Order = this;
    var customer = Customer.FindCustomer(tempVar);
    if (customer.size() < 1)
    {
      throw new RuntimeException("not found");
    }
    if (customer.size() > 1)
    {
      throw new RuntimeException("not found");
    }
    return customer.Single();
  }



}

class Customer
{


  private HashSet<Order> _orders = new HashSet<Order>();

  public final HashSet<Order> getOrders()
  {
    return _orders;
  }
  public static java.lang.Iterable<Customer> GetAllCustomer()
  {
    return new ArrayList<Customer>();
  }

  public static java.lang.Iterable<Customer> FindCustomer(CustomerSearch cus)
  {
    return new ArrayList<Customer>();
  }
}


class CustomerSearch
{

  private Order order;
  public final Order getOrder()
  {
    return order;
  }
  public final void setOrder(Order value)
  {
    order = value;
  }
}
