/*
 * Isaac Van Meter
 * Project 2
 * 5/4/23
 * This is my own original work.
 */
package Project2;

import java.util.Random;
import java.util.Scanner;

public class Craps implements GameInterface {
    
    private Dice dice;
    private Player player;

    public Craps(Player player){
        this.player = player;
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        this.dice = new Dice();
        this.dice.addDie(die1);
        this.dice.addDie(die2);
    }

    public void play(){
        Random rand = new Random();
        boolean isOver = this.isOver();
        while(!isOver){
            System.out.println("\n-----Round-----\n");
            int bet = rand.nextInt(5) * 5;
            System.out.println(this.player.getName() + " placed " + bet + " chips on the pass line.");
            int roll = dice.rollAllDice();
            System.out.println(this.dice.toString());
            if (roll == 7 || roll == 11){
                System.out.println(this.player.getName() + " wins!!!");
                this.player.setChips(this.player.getChips() + bet);
                isOver = this.isOver();
            }
            else if (roll == 2 || roll == 3 || roll == 12){
                System.out.println("Craps! " + this.player.getName() + " losses.");
                this.player.setChips(this.player.getChips() - bet);
                isOver = this.isOver();
            }
            else{
                int point = roll;
                System.out.println("\nThe point is " + point + ".");
                while(true){
                    roll = dice.rollAllDice();
                    System.out.println(this.dice.toString());
                    if (roll == point){
                        System.out.println(this.player.getName() + " wins!!!");
                        this.player.setChips(this.player.getChips() + bet);
                        isOver = this.isOver();
                        break;
                    }
                    else if (roll == 7){
                        System.out.println("A 7 was rolled. " + this.player.getName() + " losses.");
                        this.player.setChips(this.player.getChips() - bet);
                        isOver = this.isOver();
                        break;
                    }
                }
            }
        }
    }

    public void end(){
        System.out.println(this.player.getName() + " ended the game.");
        System.out.println(this.player.getName() + " ended the game with " + this.player.getChips() + " chips!");

    }

    public boolean isOver(){
        if (this.player.getChips() <= 0){
            this.end();
            return true;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.player.getName() + " has " + this.player.getChips() + " chips. Do you wish to keep playing? (yes/no)");
        String response = scanner.nextLine();
        if (response.equals("yes"))
            return false;
        else if (response.equals("no")){
            this.end();
            return true;
        }
        else{
            System.out.println("Invalid response.");
            return this.isOver();
        }
    }
    
}
