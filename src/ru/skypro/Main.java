package ru.skypro;

public class Main {
    public static Employee[]  arr = new  Employee[10];

    public static void main(String[] args) {

        Employee gotalskiy = new Employee("Готальский", "Виниамин", "Георгиевич", 1, 8550.0);
        Employee sifon = new Employee("Сифон", "Юрий", "Винидиктович", 2, 8700.0);
        Employee boroda = new Employee("Борода", "Прохор", "Петрович", 3, 8900.0);
        Employee classov = new Employee("Классов", "Виктор", "Марьянович", 4, 9100.0);
        Employee obiektov = new Employee("Обьектов", "Джузепе", "Поликарпович", 5, 9400.0);
        Employee skobochkin = new  Employee("Скобочкин", "Элоизий", "Сперидонович", 4, 9700.0);
        Employee kudasov = new Employee("Кудасов", "Инокентий", "Леопольдович", 3, 10000.0);
        Employee kovichkin = new Employee("Ковычкин", "Алексей", "Казимирович", 2, 10100.0);
        Employee pechkin = new Employee("Печкин", "Александр", "Вадимович", 1, 10200.0);
        Employee petrosyn= new Employee("Петросян", "Евгений", "Ваганович", 5, 10500.0);

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
        System.out.println();
        amountSalaries();
        System.out.println();
        minimumWage();
        System.out.println();
        maximumWage();
        System.out.println();
        averageSalary();
        System.out.println();
        printOut();



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
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum + " $");
    }

    public static void minimumWage(){
        String nam = "";
        double min = 1000000.0;
        for (int i = 0;i <= arr.length - 1;i ++){
            if (arr[i].getZp() <= min){
                min = arr[i].getZp();
                 nam = arr[i].getName();
            }
        }
        System.out.println("Минимальная зарплата: " + nam  + " " + min + " $");
    }

    public static void maximumWage(){
        String nam = "";
        double max = 0.0;
        for (int i = 0;i <= arr.length - 1;i ++){
            if (arr[i].getZp() >= max){
                max = arr[i].getZp();
                nam = arr[i].getName();
            }
        }
        System.out.println("Максимальная зарплата: " + nam  + " " + max + " $");
    }

    public static void averageSalary(){
        double average = 0;
        for (int i = 0;i <= arr.length - 1;i ++){
            average = average + arr[i].getZp();
        }
        System.out.println("Средняя зарплата в месяц: " + average/10 + " $");
    }

    public static void printOut() {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i].getName());
            System.out.print(" ");
            System.out.print(arr[i].getFirstName());
            System.out.print(" ");
            System.out.print(arr[i].getLastName());
            System.out.println();
        }
    }


}
