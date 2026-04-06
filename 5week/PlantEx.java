class Orgaism{
    void breath(){
        System.out.println("식물이 숨을 쉽니다");

    }
}

class Plant extends Orgaism{
    void photosynthesize(){
        System.out.println("식물이 햇빛을 받아 광합성을 합니다.");
    }

}
class Tree extends Plant {
    String name;

    Tree(String name){
        this.name = name;
    }

    @Override
    void breath(){
        System.out.println(this.name + "가 맑은 공기를 뿜으며 숨을 쉽니다. ");

    }
    @Override
    void photosynthesize(){
        System.out.println(this.name + "가 푸른 잎으로 광합성을 합니다. ");

    }
}


public class PlantEx {
    public static void main(String[] args)
    {
        Tree pineTree = new Tree("소나무");

        System.out.println("---소나무의 행동 ---");

        pineTree.photosynthesize();
        pineTree.breath();


    }
}
