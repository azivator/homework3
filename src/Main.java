//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.

                int z = 120;
                System.out.println("всего купленно " + z + " банок краски двух цветов");
                int x = 2;
                System.out.println("на один класс нужно " + x + " банки белой краски");
                int y = 4;
                System.out.println("на один класс нужно " + y + " банки коричневой краски");
                int a = 120/ (x+y);
                System.out.println("в школе всего " + a + " классов");
                int b = x*a;
                System.out.println("на покраску всех классов было купленно " + b + " банок белой краски");
                int c = y*a;
                System.out.println("на покраску всех классов было купленно " + c + " банок коричневой краски");
                System.out.println("В школе, где " +a+ " классов, нужно " +b+ " банок белой краски и " +c+ " банок коричневой краски");

        }
}