import PlayList;

class WebPlayer implements Playable {
  
  double volume;
  int currentTrack, index;
  PlayList playlist;

  // constructor, getters, setters

  public void play() {
    // implementación de la función play
  }

  public void pause() {
    // implementación de la función pause
  }

  public void mute() {
    this.volume = 0;
    // implementación de la función mute
  }

  public void increaseVolume() {
    this.volume += 0.1;
    // implementación de la función increaseVolume
  }
} 