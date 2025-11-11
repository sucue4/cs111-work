public class TVShow extends Media {
  int seasons;
  int episodes;
  public TVShow(String name, int duration, String genre, double rating, int seasons, int episodes){
    super(name, duration, genre, rating); 
    this.seasons = seasons;
    this.episodes = episodes;
  }
    
  public int getEpisodes() {
    return episodes;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(super.toString());
    s.append("Seasons: ").append(this.seasons).append("\n");
    s.append("Total Episodes: ").append(this.episodes).append("\n");
    return s.toString();
  }
}
