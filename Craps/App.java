/*
 * Isaac Van Meter
 * Project 2
 * 5/4/23
 * This is my own original work.
 */
package Project2;

public class App {
    public static void main(String[] args) {
        Player Isaac = new Player("Isaac");
        Player Regan = new Player("Regan");
        Player Garrett = new Player("Garrett");

        Craps game1 = new Craps(Isaac);
        game1.play();
        Craps game2 = new Craps(Regan);
        game2.play();
        Craps game3 = new Craps(Garrett);
        game3.play();

    }
}

