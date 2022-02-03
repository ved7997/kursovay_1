package ru.skypro;

public class Main {
    public static Employee[]  arr = new  Employee[10];

    public static void main(String[] args) {

        Employee gotalskiy = new Employee("Готальский", "Виниамин", "Георгиевич", 1, 85500.0);
        Employee sifon = new Employee("Сифон", "Юрий", "Винидиктович", 2, 87000.0);
        Employee boroda = new Employee("Борода", "Прохор", "Петрович", 3, 89000.0);
        Employee classov = new Employee("Классов", "Виктор", "Марьянович", 4, 9100000.0);
        Employee obiektov = new Employee("Обьектов", "Джузепе", "Поликарпович", 5, 94000.0);
        Employee skobochkin = new  Employee("Скобочкин", "Элоизий", "Сперидонович", 4, 97000.0);
        Employee kudasov = new Employee("Кудасов", "Инокентий", "Леопольдович", 3, 100000.0);
        Employee kovichkin = new Employee("Ковычкин", "Алексей", "Казимирович", 2, 101000.0);
        Employee pechkin = new Employee("Печкин", "Александр", "Вадимович", 1, 102000.0);
        Employee petrosyn= new Employee("Петросян", "Евгений", "Ваганович", 5, 1000000.0);

            arr[0] = gotalskiy;
            arr[1] = sifon;
            arr[2] = boroda;
            arr[3] = classov;
            arr[4] = obiektov;
            arr[5] = skobochkin;
            arr[6] = kudasov;
            arr[7] = kovichkin;
            arr[8] = pechkin;
            arr[9] = petrosyn;

        listEmployees();
        amountSalaries();

    }
    public static void listEmployees(){
        for (int i = 0;i <= arr.length - 1;i ++){
            System.out.println(arr[i].toString());
        }
    }

    public static void amountSalaries(){
        double sum = 0;
        for (int i = 0;i <= arr.length - 1;i ++){
               sum = sum + arr[i].getZp();
        }
        System.out.println(sum);
    }


}
