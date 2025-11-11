public class Employee {
  String name;
  String id;
  
  public Employee(String name, String id){
    this.name = name;
    this.id = id;
  }

  @Override
  public String toString() {
      StringBuilder s = new StringBuilder();
      s.append("[").append(this.id).append("] ").append(this.name).append("\n");
      return s.toString();
  }
}
