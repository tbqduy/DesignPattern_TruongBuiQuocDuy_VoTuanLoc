class Person {
  private String name;

  public String getName() {
    return name;
  }
  public void setName(String arg) {
    name = arg;
  }
}

class de{
  public static void main(String[] agr){
  	Person p = new Person();
  	p.setName("John");
  	System.out.println(p.getName());
  }

}