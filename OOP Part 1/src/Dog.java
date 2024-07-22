public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large") , weight);

        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(){
        super("Mutt", "Big", 50);
    }

    @Override
    public void makeNoise() {
        if (type == "wolf"){
            System.out.print("Ooow owwwwwwwwwwwwwww ");
        }

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow" ){
            walk();
            wagtail();
        }else {
            run();
            wagtail();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print("Woof!! ");
    }
    private void run(){
        System.out.print("Dog Barking. ");
    }
    private void walk(){
        System.out.print("Dog Walking. ");
    }
    private void wagtail(){
        System.out.print("Dog is wagging its tail. ");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
