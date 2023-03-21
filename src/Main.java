import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task21();
        task3();
        task31();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int year = 1200;
        printLeapYear(year);
    }
    public static boolean isYearLeap(int year) {
        return  (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static void printLeapYear(int year) {
        if (isYearLeap(year)) {
            System.out.println(year + " является высокосным");
        } else {
            System.out.println(year + " не является высокосным");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var clientOS1 = 0;
        var clientDeviceYear = 2020;
        printOperatingSystemLink(clientOS1,clientDeviceYear);
    }

    private static void printOperatingSystemLink(int clientOS1, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear >= currentYear && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= currentYear && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS1 == 0) {
            System.out.println("Установите облегченную приложения для iOS по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS1 == 1) {
            System.out.println("Установите облегченную приложения для Android по ссылке");
        } else {
            System.out.println("Выбранная версия ПО не существует");
        }
    }

    public static void task21 () {
        System.out.println("Задача 2 второй вариант решения");
        var clientOS1 = 1;
        var clientDeviceYear = 2014;
        printOperatingSystemLink1(clientOS1,clientDeviceYear);
    }
    private static void printOperatingSystemLink1(int clientOS1, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();
        if (clientOS1 == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную приложения для iOS по ссылке");
            }
        } else if (clientOS1 == 1){
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную приложения для Android по ссылке");
            }
        } else {
            System.out.println("Данное ПО пока не существует");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 99;
        printDeliveryDay(deliveryDistance);
    }

    public static void printDeliveryDay(int deliveryDistance) {
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Для поставки потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Для поставки потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Для поставки потребуется 3 дня");
        } else if (deliveryDistance > 100 || deliveryDistance < 0) {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void task31 () {
        System.out.println("Задача 3 второй вариант решения");
        int deliveryDistance = 59;
        printDeliveryDay1(deliveryDistance);
    }
    private static void printDeliveryDay1(int deliveryDistance){
        int deliveryDays1 = calculateDeliveryDay1(deliveryDistance);
        if (deliveryDays1<0) {
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println("Доставка займет дней " + deliveryDays1);
        }
    }

    private static int calculateDeliveryDay1(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 101) {
            return 3;
        } else {
            return -1;
        }
    }
}

