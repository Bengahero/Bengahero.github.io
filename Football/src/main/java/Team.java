import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> playerList = new ArrayList<Player>();

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }
    public void addPlayer(Player[] players){
        for(Player play: players){
            addPlayer(play);
        }
    }
    public void changePlayer(Player player1, Player player2){
        if(playerList.contains(player1) && !playerList.contains(player2)){
            playerList.remove(player1);
            playerList.add(player2);
        }
        else throw new IllegalArgumentException();

    }
}
