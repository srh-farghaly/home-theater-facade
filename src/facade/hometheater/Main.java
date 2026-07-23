package facade.hometheater;

public class Main {
    public static void main(String[] args) {

        // ---- Wiring/assembly step: build all subsystem devices ----
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner");
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player");
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player");
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        Screen screen = new Screen("Theater Screen");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amp, cd, dvd, popper, projector, screen, lights, tuner
        );

        // ---- Client usage step: only touches the Facade from here ----
        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}