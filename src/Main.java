//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.

                byte LPStudents = 23;
                byte ASStudents = 27;
                byte EAStudents = 30;
                short papers = 480;
                System.out.println("У Людмилы Павловны " + LPStudents + " ученика");
                System.out.println("У Анны Сергеевны " + ASStudents + " ученика");
                System.out.println("У Екатерины Андреевны " + EAStudents + " ученика");
                System.out.println("Всего куплено листов бумаги - " + papers + " шт.");
                int paperPerStudent = papers / (LPStudents + ASStudents + EAStudents);
                System.out.println("листов на ученика - " + paperPerStudent + " шт.");

                //  float a = 27.12f;
               // long b = 987678965549L;
              //  float c = 2.786f;
              //  short d = 569;
              //  short e = -159;
             //   int f = 27897;
              //  byte g = 67;
        }
}