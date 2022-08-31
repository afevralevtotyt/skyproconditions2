public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        hardTask6();
        hardTask7();
    }


    private static void task1() {
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Операционная система не поддерживается");
        }
    }

    private static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Операционная система не поддерживается");
        }

    }

    private static void task3() {
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }

    }

    private static void task4() {
        int deliveryDistance = 20;
        int deliveryTerm;
        if (deliveryDistance <= 20) {
            deliveryTerm = 1;
            System.out.println("Потребуется дней " + deliveryTerm);
        } else if (deliveryDistance > 20) {
            deliveryTerm = (int) Math.ceil((deliveryDistance - 20) * 1.0 / 40) + 1;
            System.out.println("Потребуется дней " + deliveryTerm);

        }
    }

    private static void task5() {
        int montNumber = 123;
        switch (montNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }

    }

    private static void hardTask6() {
        int age = 19;
        int salary = 58_000;
        float limitCoef = 1f;
        if (age < 23) {
            limitCoef *= 2;
        } else {
            limitCoef *= 3;
        }
        if (salary >= 50000 && salary < 80000) {
            limitCoef *= 1.2;

        } else if (salary >= 80000) {
            limitCoef *= 1.5;
        }
        System.out.println("Кредитный лимит " + limitCoef * salary + " рублей");
    }

    private static void hardTask7() {
        int age =25;
        int salary = 60_000;
        int wanted_Sum = 330_000;
        float baseStake = 10 / 100f;
        int creditPeriod = 12;
        float maxPayment = 50 / 100f;
        if (age < 23) {
            baseStake += 0.01;

        } else if (age>=23&& age<30) {
            baseStake += 0.005;
        }
        if (salary > 80000){
            baseStake -= 0.007;

        }
        float minCreditPaymemt  = wanted_Sum*(1+baseStake)*(12/creditPeriod)/12;
        if (salary*maxPayment > minCreditPaymemt) {
            System.out.println("Максимальный платеж при зарплате "+ salary +" равен "+ salary*maxPayment+" рублей\nПлатеж по кредиту равен " + minCreditPaymemt+ " рублей. Заявка одобрена" );
        }
        else {
            System.out.println("Максимальный платеж при зарплате "+ salary +" равен "+ salary*maxPayment+" рублей\nПлатеж по кредиту равен " + minCreditPaymemt+ " рублей. Заявка отклонена" );
        }

    }

}