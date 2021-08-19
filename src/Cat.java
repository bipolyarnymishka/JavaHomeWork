public class Cat extends Animal {
    public Cat (int run, int swim) {
        super (run, swim);
    }
    public void move() {
        if (swim < 0 || swim >=0)
        {
            System.out.println("Кот не умеет плавать");
        }
        if (run <= 200)
        {
            System.out.println("Кот пробежал " + run + " м");
        }
        else
        {
            System.out.println("Кот не проюежал " + run + " м");
        }
        System.out.println();
    }
}
