public class Basics {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
        // System.out.println(p1.tip);
        System.out.println(p1.getTip());
        // p1.color = "Red";
        p1.setColor("Red");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.price[0] = 5;
        p1.price[1] = 10;
        p1.price[2] = 15;

        Pen p2 = new Pen(p1);
        System.out.println(p2.color);
        System.out.println(p2.tip);
        System.out.println(p1.price[0]);
        // System.out.prin
        p1.price[1] = 11;
        for(int i=0; i<3; i++){
            System.out.println(p2.price[i]);
        }
        Fish f1 = new Fish();
        f1.eat();
        f1.breath();
        Dogs d1 = new Dogs();
        d1.eat();

        Deer deer = new Deer();
        deer.eat();
    }
}


interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.err.println("up, down, right, left, diagonal ( all 4 dirctions )");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.err.println("up, down, right, left, diagonal ( up, down, right, left )");
    }
}class King implements ChessPlayer{
    public void moves(){
        System.err.println("up, down, right, left, diagonal ( single step )");
    }
}
class Pen {
    // private String color;
    // private int tip;
    String color;
    int tip;
    int price[] = new int[3];
    //Shallow
    // Pen(Pen p1){
    //     price = new int[3];
    //     this.color = p1.color;
    //     this.tip = p1.tip;
    //     this.price = p1.price;
    // }
    //Deep
    Pen(Pen p1){
        price = new int[3];
        this.color = p1.color;
        this.tip = p1.tip;
        for(int i=0; i<3; i++){
            price[i] = p1.price[i];
        }
    }
    Pen(){
        System.out.println("Contructor is called...");
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}


class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}
class Mammals extends Animal{
    int legs;
}

class Dogs extends Mammals{
    String breeds;
}
class Cat extends Animal{
    String breed;
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}

