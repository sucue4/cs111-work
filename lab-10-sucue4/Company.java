public class Company {
  private Employee[] employees;

  public Company(int size){
    this.employees = new Employee[size];
  }
  
  // add employee to the company
  public void add(Employee e){
    for(int i = 0; i < this.employees.length; i++){
      if(this.employees[i] == null){ // find first empty spot
        this.employees[i] = e;
        return;
      }
    }
  }
  
  // counts how many employees for each certain type
  private int countByType(String type){
    int count = 0;

    for(Employee e : this.employees){
      if (e == null) {
        continue;
      }

      if(type.equalsIgnoreCase("Manager")){
        if(e instanceof Manager){
          count++;
        }
      } else if(type.equalsIgnoreCase("Developer")){
        if(e instanceof Developer){
          count++;
        }
      }
    }
    return count;
  }
  
  // gets all the developers in the company
  public Developer[] getAllDevelopers(){
    Developer[] devs = new Developer[countByType("Developer")]; // array for developers
    int index = 0;

    for (Employee e : employees) {
      if (e instanceof Developer) {
        devs[index] = (Developer) e; // cast the employee to a developer
        index++;
      }
    }
    return devs;
  }
  
  // get all the developers who know a specific programming language
  public Developer[] findDevelopersByLanguage(String language){
    Developer[] allDevs = getAllDevelopers(); // get all the developers
    int count = 0;

    // count how many languages they know
    for(Developer d : allDevs) {
      if(d.knowsLanguage(language)){
        count++;
      }
    }

    Developer[] filteredDevs = new Developer[count]; // array for filtered developers
    int index = 0;
    
    // add developers who know the language
    for(Developer de : allDevs) {
      if(de.knowsLanguage(language)){
        filteredDevs[index] = de;
        index++;
      }
    }
    return filteredDevs;
    
  } 
  
  // get all managers in the company
  public Manager[] getAllManagers(){
    Manager[] manager = new Manager[countByType("Manager")];
    int index = 0;
    for (Employee e : employees) {
      if (e instanceof Manager) {
        manager[index] = (Manager) e; // cast employee into Manager
        index++;
      }
    }
    return manager;
  }

  @Override
  public String toString() {
      StringBuilder s = new StringBuilder();
      for(Employee e : employees){
        if(e == null){
          continue;
        }
        s.append(e.toString()).append("\n");
      }
      return s.toString();
  }
}
