public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int clientOs = 0;
        switch (clientOs) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }

        System.out.println("Task2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015) {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        }

        System.out.println("Task3");
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }

        System.out.println("Task4");
        int deliveryDistance = 21;
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = days + 1;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = days + 2;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка невозможна");
        }


    }
}