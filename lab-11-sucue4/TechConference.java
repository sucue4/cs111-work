public class TechConference extends Event {
  String[] speakers;

  public TechConference(String name, String venue, String startDate, String endDate, String[] speakers){
    super(name, venue, startDate, endDate);
    this.speakers = speakers;
  }

  public String toFileString(){
    StringBuilder s = new StringBuilder();
    s.append("tech,");
    s.append(super.toFileString());
    s.append(",");
    for(String a : speakers){
      s.append(a).append("-");
    }
    s.deleteCharAt(s.length() - 1);
    s.append("\n");
    return s.toString();
  }


 @Override
 public String toString() {
  StringBuilder str = new StringBuilder();
  str.append(super.toString());
  str.append("People speaking:\n");
  for (String speaker : speakers) {
    str.append("- ").append(speaker).append("\n");
  }
  return str.toString();
 }
}