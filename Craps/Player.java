/*
 * Isaac Van Meter
 * Project 2
 * 5/4/23
 * This is my own original work.
 */
package Project2;

public class Player {
    private String name;
    private int chips;

    public Player(String name){
        this.name = name;
        this.chips = 50;
    }

    public String getName(){
        return this.name;
    }

    public int getChips(){
        return this.chips;
    }

    public void setChips(int chips){
        this.chips = chips;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + this.name);
        sb.append("\nChips: " + this.chips);
        return sb.toString();
    }
}
