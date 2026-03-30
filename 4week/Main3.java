class Animal{
    public void speak() {
        System.out.println("동물이 소리를 냅니다.");
    }
}
class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("야옹");
    }
}

public class Main3 {
    public static void main(String[] args){

        Dog myDog = new Dog();
        Cat myCat = new Cat();

        System.out.println("----개별 호출----");
        myCat.speak();
        myDog.speak();
    }
    
}
