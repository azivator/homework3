//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.

                int weightToLossKg = 7;
                int weightToLoss = weightToLossKg*1000;
                System.out.println("Нужно сбросить " + weightToLossKg + " килограмм, это "+weightToLoss+" грамм");
                int loss250gPerDay = 250;
                int daysIfLoss250PerDay = weightToLoss/loss250gPerDay;
                System.out.println("Если терять по " + loss250gPerDay + " грамм в день, то понадобиться " + daysIfLoss250PerDay + " дней");
                int loss500gPerDay = 500;
                int daysIfLoss500PerDay = weightToLoss/loss500gPerDay;
                System.out.println("Если терять по " + loss500gPerDay + " грамм в день, то понадобиться " + daysIfLoss500PerDay + " дней");
                int AverageLossDays = (daysIfLoss250PerDay + daysIfLoss500PerDay)/2 ;
                System.out.println("В среднем понадобиться " + AverageLossDays + " дней (Если считать среднее количество дней)");
                float daysIfLossAverageWeigthPerDay = weightToLoss/((loss250gPerDay+loss500gPerDay)/2f)  ;
                System.out.println("В среднем понадобиться " + daysIfLossAverageWeigthPerDay + " дней (Если считать через среднюю массу похудения в день по 375 грамм)");
        }
}