/*
 * Isaac Van Meter
 * Project 2
 * 5/4/23
 * This is my own original work.
 */
package Project2;

import java.util.HashSet;
import java.util.Set;

public class Dice {

    private Set<Die> rolls;
    private int[] lastRolls;

    public Dice() {
        rolls = new HashSet<Die>();
    }

    public void addDie(Die die) {
        rolls.add(die);
    }

    public int rollAllDice() {
        int tot = 0;
        lastRolls = new int[rolls.size()];
        int i = 0;
        for (Die die : rolls) {
            int roll = die.roll();
            tot += roll;
            lastRolls[i++] = roll;
        }
        return tot;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int result = 0;
        sb.append("-- Dice roll --\n");
        for (int i = 0; i<rolls.size(); i++) {
            int roll = lastRolls[i];
            sb.append("result = ").append(roll).append("\n");
            result += roll;
        }
        sb.append("Total result = ").append(result);
        return sb.toString();
    }
}



