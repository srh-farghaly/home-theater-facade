package facade.hometheater;

public class Tuner {
    String description;
    double frequency;
    public Tuner( String descrption){
        this.description = descrption;
    }
public void on(){
        System.out.println(description + "ON now");
}

public void off(){
        System.out.println(description + "Off now");
    }

public void setFrequency(double frequency){
        System.out.println(description + " frequency is set to " + frequency);
        this.frequency = frequency;
}

public void setAm() {

    System.out.println(description + " setting AM mode ");

}

public void setFm() {

        System.out.println(description + " setting AM mode");

    }
}
