public class TeamHungary extends Team{
    public TeamHungary(){
        for (int i = 0; i <3 ; i++) {
            Player newPlayer = new Player("Kovács" + (i+1) );
            addPlayer(newPlayer);
        }
    }
}
