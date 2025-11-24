public class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }
    
    public void fly() {
        if (canFly) {
            System.out.println(name + " летит в небе");
        } else {
            System.out.println(name + " не умеет летать");
        }
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Чик-чирик!");
    }
    
    public boolean isCanFly() {
        return canFly;
    }
}