class Organism {
    void breathe() {
        System.out.println("생물이 숨을 쉽니다.");
    }
}

class Plant extends Organism {
    void photosynthesize(){
        System.out.println("식물이 햇빛을 받아 광합성을 합니다.");
    }
}

class Tree extends Plant{
    String name;

    Tree(String name){
        this.name = name;
    }

    void growBark() {
        System.out.println(this.name + "에 단단한 나무 껍질이 자랍니다.");
    }
}

public class Main2 {
    
    public static void main(String[] args) {
        Tree pineTree = new Tree("소나무");

        System.out.println("---소나무의 행동---");

        pineTree.growBark();;
        pineTree.photosynthesize();
        pineTree.breathe();

    }
}
