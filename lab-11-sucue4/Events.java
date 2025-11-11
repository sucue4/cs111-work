public class Events {
  Event[] events;

  public Events(){
    this.events = new Event[20];
  }

  public void add(Event e){
    if(isFull()){
      extend(10);
    }
    for(int i = 0; i < events.length; i++){
      if(events[i] == null){
        events[i] = e;
        return;
      }
    }
  }

  private void extend(int extension){
    Event[] temp = new Event[this.events.length + extension];
    for(int i = 0; i < this.events.length; i++){
      temp[i] = this.events[i];
    }
    this.events = temp;
  }

  private boolean isFull(){
    for(Event e : events){
      if(e == null){
        return false;
      }
    }
    return true;
  }

  public String toFileString(){
    StringBuilder s = new StringBuilder();
    for(Event e : events){
      if(e == null){ continue; }
      s.append(e.toFileString());
    }
    return s.toString();
  }

  @Override
  public String toString() {
      StringBuilder str = new StringBuilder();
      str.append("Events:\n");
      for(Event e : events){
        str.append(e.toString());
      }
      return str.toString();
  }
}
