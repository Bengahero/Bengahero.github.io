import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class TestFootball {
    Team testTeam;

    @BeforeEach
    public void Setup() {
        testTeam = new Team();
    }

    @Test
    public void changePlayerTest() {
        Player player1 = new Player("Messi");
        Player player2 = new Player("Cr7");
        testTeam.addPlayer(player1);
        testTeam.changePlayer(player1, player2);
        List<Player> list = testTeam.getPlayerList();
        Assertions.assertTrue(list.contains(player2));
    }

    @Test
    public void changePlayerTestException (){
        Player player1 = new Player("Messi");
        Player player2 = new Player("Cr7");
        testTeam.addPlayer(player1);
        Assertions.assertThrows(IllegalArgumentException.class,()-> testTeam.changePlayer(player2, player1));
    }

}
