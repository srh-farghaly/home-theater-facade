package facade.hometheater;

public class Amplifier {
    String description;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    public Amplifier(String description){
        this.description = description;
    }

    public void on(){
        System.out.println(description + " on");
    }

    public void off(){
        System.out.println(description + " off");
    }

    public void setStereoSound(){
        System.out.println( description + " stereo mode");
    }

    public void setSurroundSound() {
        System.out.println( description + " Surround mode");
    }

    public void setVolume(int level){
        System.out.println(description + " setting volume to " + level);
    }

    public void setTuner(Tuner tuner){
        System.out.println(description + " setting tuner to " + tuner);
        this.tuner = tuner;
    }

    public void setDvd(DvdPlayer dvd){
        System.out.println(description + " setting dvd to " + dvd);
        this.dvd = dvd;
    }

    public void setCd(CdPlayer cd) {
        System.out.println(description + " setting cd to " + cd);
        this.cd = cd;
    }
}
