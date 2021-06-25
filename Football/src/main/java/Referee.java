public class Referee extends Person {
    public Referee(String name){
        super(name);
    }
    public void Whistle(){
        System.out.println(getName() + " whistles");
    }
}
