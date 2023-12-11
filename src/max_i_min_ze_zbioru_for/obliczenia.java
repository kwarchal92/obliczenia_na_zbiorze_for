package max_i_min_ze_zbioru_for;

import java.util.Random;

public class obliczenia {

    public static void main(String[] args)
    {
        int ilosc_liczb = 5, i;
        double liczba, suma = 0, min, max;

        System.out.println("System losuje" + ilosc_liczb + "liczb całkowitych od 0 do 99.");
        System.out.println("a nastepnie znajduje najwieksza i najmniejsza z nich.");
        System.out.println("oraz oblicza srednia ze wszystkich wylosowanych liczb.\n");

        Random r = new Random();
        min = Math.round(100 * (r.nextDouble()));

        System.out.print("wylosowano liczby: " + min + ",");
        max = min;
        suma += max;

        for (i = 1; i <= ilosc_liczb - 1; i++)
        {
            liczba = Math.round(100 * (r.nextDouble()));
            System.out.print(liczba + ",");

            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;

            suma += liczba;
        }

        System.out.println("\nnajwieksza liczba to: " + max);
        System.out.println("najmniejsza liczba to: " + min);
        System.out.println("srednia = " + suma/ilosc_liczb + ".");

    }
}
