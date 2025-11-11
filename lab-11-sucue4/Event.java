public class Event {
  String name;
  String venue;
  String startDate;
  String endDate;

  public Event(String name, String venue, String startDate, String endDate){
    this.name = name;
    this.venue = venue;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public String toFileString(){
    StringBuilder s = new StringBuilder();
    s.append(this.name).append(",").append(this.venue).append(",").append(this.startDate).append(",").append(this.endDate);
    return s.toString();
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append(this.name).append(" @ ").append(this.venue).append(": ").append(this.startDate).append(" - ").append(this.endDate).append("\n");
    return str.toString();
  }
}
