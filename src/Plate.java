public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void littleFood(int appetite) {
        if (!muchFood(appetite)) {
            System.out.println("В тарелке мало еды");
        }
        else food = food - appetite;
    }

    public boolean muchFood(int appetite) {
        return appetite < food;
    }

    public void addFood(int add) {
        food += add;
    }
}
