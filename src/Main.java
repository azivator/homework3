//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.

                int M = 67760;
                int D = 83690;
                int K = 76230;
                float MAfterIncrease = M*1.1f;
                float DAfterIncrease = D*1.1f;
                float KAfterIncrease = K*1.1f;
               // путь один
                int MYearSalary =M*12;
                int DYearSalary =D*12;
                int KYearSalary =K*12;
                float MIncreasedYearSalary =MAfterIncrease*12;
                float DIncreasedYearSalary =DAfterIncrease*12;
                float KIncreasedYearSalary =KAfterIncrease*12;
                float MYearSalaryDiff =MIncreasedYearSalary-MYearSalary;
                float DYearSalaryDiff =DIncreasedYearSalary-DYearSalary;
                float KYearSalaryDiff =KIncreasedYearSalary-KYearSalary;
                //путь два
                float a =(MAfterIncrease-M)*12;
                float b =(DAfterIncrease-D)*12;
                float c =(KAfterIncrease-K)*12;

                System.out.println("Маша получала " + M + " руб., после повышения зарплаты "+MAfterIncrease+" руб.");
                System.out.println("Машин годовой доход вырос на " + MYearSalaryDiff + " руб.");
                System.out.println("Денис получал " + D + " руб., после повышения зарплаты "+DAfterIncrease+" руб.");
                System.out.println("Дениса годовой доход вырос на " + DYearSalaryDiff + " руб.");
                System.out.println("Кристина получала " + K + " руб., после повышения зарплаты "+KAfterIncrease+" руб.");
                System.out.println("Кристинин годовой доход вырос на " + KYearSalaryDiff + " руб.");
                System.out.println("");
                System.out.println("по второму пути решения полученые ответы:");
                System.out.println("");
                System.out.println("Маша получала " + M + " руб., после повышения зарплаты "+MAfterIncrease+" руб.");
                System.out.println("Машин годовой доход вырос на " + a + " руб.");
                System.out.println("Денис получал " + D + " руб., после повышения зарплаты "+DAfterIncrease+" руб.");
                System.out.println("Дениса годовой доход вырос на " + b + " руб.");
                System.out.println("Кристина получала " + K + " руб., после повышения зарплаты "+KAfterIncrease+" руб.");
                System.out.println("Кристинин годовой доход вырос на " + c + " руб.");
        }
}