public class Manager extends Employee {

  String department;

  public Manager(String name, String id, String department){
    super(name, id);
    this.department = department;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("{Manager}\n");
    s.append(super.toString());
    s.append("Department: ").append(this.department).append("\n");
    return s.toString();
  }
  
}
