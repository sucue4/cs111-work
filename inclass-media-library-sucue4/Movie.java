public class Movie extends Media {

  int budget;
  int releaseYear;

  public Movie(String name, int duration, String genre, double rating, int budget, int releaseYear){
    super(name, duration, genre, rating); 
    this.budget = budget;
    this.releaseYear = releaseYear;
  }

  public int getBudget() {
      return budget;
  }

  @Override
  public String toString() {
      StringBuilder s = new StringBuilder();
      s.append(super.toString());
      s.append("Release Year: ").append(this.releaseYear).append("\n");
      s.append("Budget: $").append(this.budget).append("\n");
      return s.toString();
  }

}
