public class MusicFestival extends Event {
  String[] artistLineup; 
  
  public MusicFestival(String name, String venue, String startDate, String endDate, String[] artistLineup){
      super(name, venue, startDate, endDate);
      this.artistLineup = artistLineup;
  }

  public String toFileString(){
    StringBuilder s = new StringBuilder();
    s.append("music,");
    s.append(super.toFileString());
    s.append(",");
    for(String a : artistLineup){
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
    str.append("Artists performing:\n");
    for (String performer : artistLineup) {
      str.append("- ").append(performer).append("\n");
  }
    return str.toString();
  }
}
