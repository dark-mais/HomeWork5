public class Main {
    public static void main(String[] args) {
        //задача1вар1
        System.out.println("задача №1. Вариант №1.");
        int clientOS = 0;
        boolean oS = clientOS != 1;
        if (oS)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //задача1вар2
        System.out.println("задача №1. Вариант №2.");
        int clientOS1 = 0;
        boolean oS1 = clientOS1 == 1;
        if (oS1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //задача2
        System.out.println("задача №2.");
        int clientOS2 = 0;
        int clientDeviceYear = 2014;

        if (clientOS2 == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else if (clientOS2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
        //задача3
        System.out.println("Задача №3.");
        int year = 1224;
        if (year > 1584) {
            int year1 = year % 4;
            if (year1 == 0) System.out.println(year + " год является високосным");
            else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }

        //задача4

        System.out.println("Задача №4.");
        int deliveryDistance = 101;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day += 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day += 2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("доставки нет");
        }

        //задача5
        System.out.println("Задача №5.");
        int month = 4;
        switch (month) {
            case 1, 2, 12:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("лето");
                break;
            case 9, 10, 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("номер месяца введен неверно");
        }

    }


}