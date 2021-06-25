public class Player extends Person{
    public Player(String name){
        super(name);

    }
    public void Kick(){
        System.out.println(getName() + " kicking the ball");
    }

    public void Fall(){
        System.out.println(getName() + " is falling");
    }
}
