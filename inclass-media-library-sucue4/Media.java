public class Media {
  String name;
  int duration;
  String genre;
  double rating;

  public Media(String name, int duration, String genre, double rating){
    this.name = name;
    this.duration = duration;
    this.genre = genre;
    this.rating = rating;
  }

  public double getRating(){
    return this.rating;
  }

  @Override
  public String toString() {
      StringBuilder s = new StringBuilder();
      s.append("Title: ").append(this.name).append("\n");
      s.append("Duration: ").append(this.duration).append("\n");
      s.append("Genre: ").append(this.genre).append("\n");
      s.append("Average Rating: ").append(this.rating).append("\n");
      return s.toString();
  }

}
