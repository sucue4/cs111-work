public class SportsEvent extends Event {
  String[] teams; 
  
  public SportsEvent(String name, String venue, String startDate, String endDate, String[] teams){
    super(name, venue, startDate, endDate);
    this.teams = teams;
  }
  public String toFileString(){
    StringBuilder s = new StringBuilder();
    s.append("sports,");
    s.append(super.toFileString());
    s.append(",");
    for(String a : teams){
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
      str.append("Teams Playing:\n");
      for(String team : teams){
        str.append("- ").append(team).append("\n");
      }
      return str.toString();
  }
}
