package Life;

public class Tree extends Plant {

    String name;

    public Tree(String name) {

        this.name = name;
    }

    public void breathe() {
        System.out.println(this.name + " Tree breath. ");


    }
    @Override

    public void photosynthesize(){
        System.out.println(this.name + " Tree photosynthesize.");
    }
}
