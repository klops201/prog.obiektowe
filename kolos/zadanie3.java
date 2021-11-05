import java.util.*;
import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {


        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int x = 0;
        while (x <= 4) {
            System.out.println("podaj liczbe do tablicy A: ");
            Integer y = in.nextInt();
            A.add(y);
            x += 1;
        }
        x = 0;
        while (x <= 4) {
            System.out.println("podaj liczbe do tablicy B: ");
            Integer z = in.nextInt();
            if (z != 0) {
                B.add(z);
                x += 1; }
            else {
            System.out.println("podaj liczbe inna od zera: ");
            }


        }
        podziel(A, B);
}

     static void podziel(List<Integer> list1, List<Integer> list2){

        ArrayList<Double> C = new ArrayList<>();
        for(int i=0;i<=4;i++){
            double m = list1.get(i);
            int j = 0;
            double n = list2.get(j);
            double f = m/n;
            System.out.println(f);
            j += 1;
            }

        }
}

