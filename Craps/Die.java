package Project2;

/*
 * Isaac Van Meter
 * Project 2
 * 5/4/23
 * This is my own original work.
 */
import java.util.Random;

public class Die {

    private int sides;
    private Random random;
    private int roll;

    public Die(int sides){
        this.sides = sides;
        this.random = new Random();
    }

    public int roll(){
        this.roll = this.random.nextInt(this.sides) + 1;
        return this.roll;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Result = "+this.roll);
        return sb.toString();
    }
    
}
