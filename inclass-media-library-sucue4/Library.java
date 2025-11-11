public class Library {
  private Media[] media;

  public Library(int size){
    this.media = new Media[size];
  }

  public boolean add(Media m){
    for(int i = 0; i < this.media.length; i++){
      if(this.media[i] == null){
        this.media[i] = m;
        return true;
      }
    }
    return false;
  }

  public Media findBest(){
    double highest = 0.0;
    Media best = null;

    for (int i = 0; i < media.length; i++) {
      if (media[i] != null && media[i].getRating() > highest) {
        highest = media[i].getRating();
        best = media[i];
      }
    }

    return best;
  }

  public Movie mostExpensive(){
    int budget = 0;
    Movie film = null;
    for(Media m : this.media){
      if(m == null){
        continue;
      }
      if(m instanceof Movie){ // Checks instance of the media and whether its an instance of the movie
        Movie f = (Movie) m; // if it is, cast the media into a film (TODO Q1 in the response.txt)
        if(budget < f.getBudget()){
          budget = f.getBudget();
          film = f;
        }
      }
    }
    return film;
  }

  public TVShow longestShow(){
    int length = 0;
    TVShow show = null;
    for(Media m : this.media){
      if (m == null){
        continue;
      }
      if (m instanceof TVShow) {
        TVShow f = (TVShow) m;
        if(length < f.getEpisodes()) {
          length = f.getEpisodes();
          show = f;
        }
      }
    }
    return show;
  }

  @Override
  public String toString() {
      StringBuilder s = new StringBuilder();
      for(Media m : this.media){
        if(m != null){
          s.append(m.toString()).append("\n");
        }
      }
      return s.toString();
  }
}
