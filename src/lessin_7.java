public class lessin_7 {
    public static void main(String[] args) {
        Plate plate = new Plate(30);

        Kitty[] kitties = {
                new Kitty("Пикси", 10),
                new Kitty("Живоглот", 15),
                new Kitty("Букля", 7)
        };

        for (Kitty kitty : kitties) {
            kitty.eat(plate);
        }

        plate.addFood(40);

        for (Kitty kitty : kitties) {
            kitty.eat(plate);
        }

    }
}
