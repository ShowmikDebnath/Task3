/*
    Name: Showmik Debnath
    ID: 2012020075
    Section: B
    Email: cse_2012020075@lus.ac.bd
    Date: 11-09-2021
 */

package showmik;

public class Cricket extends Sports{

    String matchType;
    int over;

    Player player;

    Cricket(String matchType, int over, Player player)
    {
        this.matchType=matchType;
        this.over=over;
        this.player=player;
    }

    void display()
    {
        System.out.println("The Match type: "+matchType);
        System.out.println("Over: "+over);
        System.out.println("Name of the player: "+player.playerName);
        System.out.println("Jersey Number of the player: "+player.jerseyNumber);

    }
}
