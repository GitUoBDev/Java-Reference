import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args){

        Player playerOne = new Player("Micky", 3);

        System.out.println("\n\nWelcome " + playerOne.name + "! Adventurer with " + playerOne.hearts + " hearts \n" );
        
        Scanner myScanneer = new Scanner(System.in);
        
        while (playerOne.hearts > 0) {

            Treasure treasureBox = new Treasure();

            System.out.print("\nNew Treasure Found. Make a choice (1 Open, 2 Ignore): ");
            int choice = myScanneer.nextInt();
            
            if(choice == 1){ playerOne.openTreasure(treasureBox);}
            else if(choice == 2){ playerOne.ignoreTreasure(treasureBox);}

        }

        myScanneer.close();
        System.out.println("\n\nGame over! Final score: " + playerOne.score);

    }

}




 class Treasure {

    public String contents;

    Treasure(){

        String[] possibilities = {"Monster","Apples","Oranges","Gold"};

        Random random = new Random();
        int randomIndex  = random.nextInt(possibilities.length);
        contents =  possibilities[randomIndex];

    }
    
}



 class Player {
    
    public String name;
    public int hearts;
    public int score;

    Player(String n, int h){ 
        this.name = n; 
        this.hearts = h;
    }

    public void openTreasure(Treasure t){
        
        switch(t.contents){
            case "Apples": System.out.println("\nApples found. (+5Pts)"); this.score+= 5; break;
            case "Oranges":System.out.println("\nOranges found. (+10Pts)"); this.score+= 10; break;
            case "Monster":System.out.println("\nYikes! Monster Attacked. (-1 hearts)"); this.hearts-= 1; break;
            default:System.out.println("\nFound << " + t.contents + " >>. Meh. Whatever."); break;
        }

    }

    public void ignoreTreasure(Treasure t){
        
        System.out.println("\nIgnored chest containg: << " + t.contents + " >>");

    }

}


