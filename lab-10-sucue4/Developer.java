public class Developer extends Employee {
  String[] programmingLanguages;

  public Developer(String name, String id, String[] programmingLanguages){
    super(name, id);
    this.programmingLanguages = programmingLanguages;
  }

  public String[] getProgrammingLanguages(){
    return this.programmingLanguages;
  }

  public boolean knowsLanguage(String programmingLanguage){
    for(String lang : programmingLanguages){ 
    // for loop to iterate through the programming languages and if the system recognizes it
      if(lang.equalsIgnoreCase(programmingLanguage)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("{Developer}\n");
    s.append(super.toString());
    s.append("Programming Languages:\n");
    for(String language : programmingLanguages){
      s.append("- ").append(language).append("\n");
    }
    return s.toString();
  }
}
