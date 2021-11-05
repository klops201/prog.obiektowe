import java.util.*;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("podaj dlugosc boku a: ");
        Integer x = in.nextInt();
        System.out.println("podaj dlugosc boku b: ");
        Integer y = in.nextInt();
        System.out.println("podaj dlugosc boku c: ");
        Integer z = in.nextInt();
        int j = czyTroj(x,y,z);
        if(j == 1){System.out.println("podane dlugosci tworza trojkat ");}
        else {System.out.println("podane dlugosci nie tworza trojkata ");}

    }


    static int czyTroj(int a, int b, int c){

        if (a + b > c) {
        }
        else
            return 0;
        if (a + c > b) {
        }
        else
            return 0;
        if (b + c > a) {
        }
        else return 0;

        return 1;
    }

}

