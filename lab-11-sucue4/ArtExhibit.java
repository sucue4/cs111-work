public class ArtExhibit extends Event {
  String[] art;  
  
  public ArtExhibit(String name, String venue, String startDate, String endDate, String[] art){
    super(name, venue, startDate, endDate);
    this.art = art;
  }

  public String toFileString(){
    StringBuilder s = new StringBuilder();
    s.append("art,");
    s.append(super.toFileString());
    s.append(",");
    for(String a : art){
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
    str.append("Art presented:\n");
    for (String works : art) {
      str.append("- ").append(works).append("\n");
    }
    return str.toString();
   }
}
