package facade.hometheater;

public class HomeTheaterFacade {
Amplifier amp;
CdPlayer cd;
DvdPlayer dvd;
PopcornPopper popcornPopper;
Projector projector;
Screen screen;
TheaterLights theatreLights;
Tuner tuner;


public HomeTheaterFacade(Amplifier amp,
    CdPlayer cd,
    DvdPlayer dvd,
    PopcornPopper popcornPopper,
    Projector projector,
    Screen screen,
    TheaterLights theatreLights,
    Tuner tuner) {
    this.amp = amp;
    this.cd = cd;
    this.dvd= dvd;
    this.screen = screen;
    this.popcornPopper = popcornPopper;
    this.projector=projector;
    this.tuner=tuner;
    this.theatreLights=theatreLights;
}

public void watchMovie(String movie) {

    System.out.println("turning movie theater on...");
popcornPopper.on();
popcornPopper.pop();
theatreLights.dim(12);
screen.down();
projector.on();
projector.wideScreenMode();
amp.on();
amp.setSurroundSound();
amp.setVolume(6);

dvd.on();
dvd.play(movie);
}

public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theatreLights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
