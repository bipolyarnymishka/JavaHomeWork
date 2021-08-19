public class Dog extends Animal {
    public Dog (int run, int swim) {
        super(run, swim);
    }
    public void move() {
        if (swim <= 20) {
            System.out.println("Собака проплыла " + swim + " м");
        } else {
            System.out.println("Собака не проплыла " + swim + " м");
        }
        if (run <= 200) {
            System.out.println("Собака пробежала " + run + " м");
        } else {
            System.out.println("Собака не пробежала " + run + " м");
        }
    }
}

