public class Kitty {

    private String name;
    private int appetite;
    private boolean satiety;

    public Kitty(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.muchFood(appetite) && !satiety) {
            System.out.println(name + " кушает");
            plate.littleFood(appetite);
            satiety = true;
        }
        else if (!plate.muchFood(appetite)) {
            System.out.println(name + " Нечего кушать =(");
        }
        else if (satiety) {
            System.out.println(name + " уже покушал");
        }

    }
}
