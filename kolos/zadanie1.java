import java.util.Scanner;
public class zad1 {
    public static void main(String[] args) {

        System.out.println("rownanie ma postac: a*x^2 - 3*x + 2*c = 0 ");
        Scanner in = new Scanner(System.in);
        System.out.println("podaj parametr a: ");
        Integer a = in.nextInt();
        System.out.println("podaj parametr c: ");
        Integer c = in.nextInt();
        kwad(a,c);
    }


    static void kwad(int x,int y){

        double delta = (-3)*(-3)-4*x*2*y;

        if(x != 0) {
            if (delta < 0) {
                System.out.println("Brak rozwiązań (delta < 0)");
            } else if (delta == 0) {
                double x0 = 3 / (2 * x);
                System.out.println("rownanie ma jedno rozwiazanie: " + x0);
            } else {
                double x1 = (3 + Math.sqrt(delta)) / (2 * x);
                double x2 = (3 - Math.sqrt(delta)) / (2 * x);
                System.out.println("Rownanie ma 2 rozwizania: " + x1 + " i " + x2);
            }

        }
        else{
            System.out.println("Parametr a == 0");
        }

    }

}
