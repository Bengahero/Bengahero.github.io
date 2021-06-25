public class Main {
    public static void main(String[] args) {
        Match match = new Match();
        match.setA(new TeamHungary());
        match.setB(new TeamGermany());
        match.matchStart();
        for(Player player: match.getA().getPlayerList()){
            System.out.println(player.getName());
        }
        match.stopMatch();
    }
}
