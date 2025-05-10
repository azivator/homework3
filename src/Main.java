//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.

                byte bottlePer2min = 16;
                System.out.println("За 2 минуты машина произвела " + bottlePer2min + " штук бутылок");
                int bottlePerMin = bottlePer2min / 2;
                System.out.println("За минуту машина произвела " + bottlePerMin + " штук бутылок");
                int bottlePer20Min = bottlePerMin * 20;
                System.out.println("За 20 минут машина произвела " + bottlePer20Min + " штук бутылок");
                int bottlePerDay = (bottlePerMin * 60) * 24;
                System.out.println("За сутки машина произвела " + bottlePerDay + " штук бутылок");
                int bottlePer3Day = bottlePerDay * 3;
                System.out.println("За 3 дня машина произвела " + bottlePer3Day + " штук бутылок");
                int bottlePerMonth = bottlePerDay * 31;
                System.out.println("За месяц (31 день) машина произвела " + bottlePerMonth + " штук бутылок");
        }
}