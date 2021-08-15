import java.security.AllPermission;

public class lesoon_5 {
    public static void main(String[] args) {
        Staff[] allStaff = new Staff[5];
        allStaff[0] = new Staff(
                "Смирнов Максим Михайлович",
                "Менеджер",
                "Smirnov@mail.ru",
                "+7-911-111-11-11",
                35000,
                30);
        allStaff[1] = new Staff(
                "Лебедева Анна Ивановна",
                "Юрист",
                "Lebedeva@mail.ru",
                "+7-921-522-22-22",
                50000,
                35);
        allStaff[2] = new Staff(
                "Егоров Виктор Альбертович",
                "Системный администратор",
                "EgorovV@mail.ru",
                "+7-981-121-34-56",
                50000,
                44);
        allStaff[3] = new Staff(
                "Макаров Владимир Евгеньевич",
                "Тестировщик",
                "makarVE@mail.ru",
                "+7-950-656-88-77",
                47000,
                38);
        allStaff[4] = new Staff(
                "Васильева Алиса Анатольевна",
                "Логист",
                "AlisaA@mail.ru",
                "+7-911-789-65-43",
                56000,
                55);


        int minAge = 40;
        for (Staff staff : allStaff) {
            if (staff.age > minAge) {
                staff.info();
                System.out.println();
            }
        }
    }
}
