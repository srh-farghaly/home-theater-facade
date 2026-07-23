# Home Theater Facade

A quick implementation of the Facade design pattern, based on the classic home theater example from *Head First Design Patterns*.

## What's going on here

The idea is simple: a home theater has a bunch of separate devices — amplifier, DVD player, projector, screen, lights, popcorn popper, tuner, CD player — and none of them know about each other. If you wanted to "watch a movie" without a facade, you'd have to manually turn on and configure every single device yourself, in the right order, every time.

`HomeTheaterFacade` wraps all of that into two methods: `watchMovie(String movie)` and `endMovie()`. The client only ever talks to those two methods and never touches the individual devices directly.

## Structure
src/facade/hometheater/
├── Amplifier.java
├── Tuner.java
├── DvdPlayer.java
├── CdPlayer.java
├── Projector.java
├── Screen.java
├── TheaterLights.java
├── PopcornPopper.java
├── HomeTheaterFacade.java
└── Main.java

Each subsystem class is independent — no shared interface between them, they just have their own methods. `HomeTheaterFacade` holds a reference to each one and calls them directly.

## Running it

`Main.java` builds all the devices, wires them into the facade, then calls `watchMovie("Inception")` followed by `endMovie()`. Just run `Main` and check the console output.

## Why I built this

Practicing the Facade pattern hands-on instead of just reading about it — wanted to actually feel the difference between a facade and a plain helper method, and see a real multi-class subsystem coordinated through one clean interface.
