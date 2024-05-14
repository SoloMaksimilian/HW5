public class Main {
    public static void main(String[] args) {

        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }

        }

        int year = 1600;
        if (year < 1584) {
            System.out.println("Високосный год не изобретен");
        } else if (year % 4 == 0)
            {
                if ((year % 100 != 0) || (year % 400 == 0))
                {
                    System.out.println(year + " год является високосный");
                }
                else {System.out.println(year + " год не является високосный");}
            } else {
                System.out.println(year + " год не является високосный");}


    }
}