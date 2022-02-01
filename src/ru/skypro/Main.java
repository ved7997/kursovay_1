package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Employee gotalskiy = new Employee("Готальский", "Виниамин", "Георгиевич", 10, 1,85500.0);
        Employee Sifon = new Employee("Сифон", "Юрий", "Винидиктович", 20, 2,8700000.0);
        Employee boroda = new Employee("Борода", "Прохор", "Петрович", 30, 3,8900000.0);
        Employee classov = new Employee("Классов", "Виктор", "Марьянович", 40, 4,9100000.0);
        Employee obiektov = new Employee("Обьектов", "Джузепе", "Поликарпович", 50, 5,9400000.0);
        Employee skobochkin = new  Employee("Скобочкин", "Элоизий", "Сперидонович", 60, 6,9700000.0);
        Employee kudasov = new Employee("Кудасов", "Инокентий", "Леопольдович", 70, 7,10000000.0);
        Employee kovichkin = new Employee("Ковычкин", "Алексей", "Казимирович", 80, 8,10100000.0);
        Employee pechkin = new Employee("Печкин", "Александр", "Вадимович", 90, 9,10200000.0);
        Employee petrosyn= new Employee("Петросян", "Евгений", "Ваганович", 100, 10,1000000.0);

        System.out.println(gotalskiy.getOb());
        for (int i = 10;i <=100;i+=10){
            System.out.println();
        }

    }
}
