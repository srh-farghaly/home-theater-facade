package facade.hometheater;

public class CdPlayer {

    String description;
    String title;
    int currentTrack;

    public CdPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " playing \"" + title + "\"");
    }

    public void play(int track) {
        currentTrack = track;
        System.out.println(description + " playing track " + currentTrack + " of \"" + title + "\"");
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped \"" + title + "\"");
    }

    public void pause() {
        System.out.println(description + " paused \"" + title + "\"");
    }

    public void eject() {
        title = null;
        System.out.println(description + " eject");
    }
}