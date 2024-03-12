//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int amout = 100;
        int replenish = 1500;
        int balance = amout + replenish;


        int bonus = (replenish - 1000) / 100;
        if (bonus < 0) {
            bonus = 0;
        }


        System.out.println("Баланс = " + balance);
        System.out.println("Итоговый бонус = " + bonus);
    }
}
