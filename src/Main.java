//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.

                int banana = 80;
                System.out.println("Один банан весит " + banana + " грамм");
                int milk = 105;
                System.out.println("100 мл молока весит " + milk + " грамм");
                int icecream = 100;
                System.out.println("Один брикет пломбира весит " + icecream + " грамм");
                int egg = 70;
                System.out.println("Одно яйцо весит " + egg + " грамм");
                int portion = 5*banana + 2*milk + 2*icecream + 4*egg;
                System.out.println("Одна порция весит " + portion + " грамм");
                float portionInKg = portion/1000f;
                System.out.println("Одна порция весит " + portionInKg + " Кг");
        }
}