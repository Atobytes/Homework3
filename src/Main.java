public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1100;
        int bonus;
        if (deposit > 100) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int allBalance = balance + deposit + bonus;
        System.out.println((allBalance) + (" Ваш Баланс"));
        System.out.println((bonus) + (" Бонусные Рубли"));


    }
}
