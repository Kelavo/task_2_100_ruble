public class Main {
    public static void main(String[] args) {

        int balance = 500;
        int depositAmount = 1001;
        int allBalance = balance + depositAmount;
        int bonus = 100;
        int bonusRuble = depositAmount / bonus;

        if (depositAmount >= 1001) {
            System.out.println("Баланс с бонусом:" + (bonusRuble + allBalance));
        } else {
            System.out.println("Баланс без бонуса:" + allBalance);
        }
    }
}
