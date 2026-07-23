package facade.hometheater;

public class DvdPlayer {

    String description;
    String movie;

  public DvdPlayer(String description)
    {
        this.description=description;
    }

  public void on()
  {
      System.out.println(description + " on");
  }

  public void off()
    {
        System.out.println(description + " off");
    }

  public void play(String movie){
      System.out.println(description + " currently playing " + movie);
      this.movie = movie;
  }

  public void stop()
  {
      System.out.println(description + " currently stopped " + this.movie);
  }

  public void eject(){
      System.out.println(description + " eject");
  }

  public void pause()
    {
        System.out.println(description + " currently paused " + this.movie);
    }

}
