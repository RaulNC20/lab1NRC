package lab9;

import java.util.*;
import java.util.stream.*;

public class Application {
    public static void main(String[] args) {


        List<Integer> lista = new Random()
                .ints(10, 5, 26)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista initiala: " + lista);


        int suma = lista.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Suma: " + suma);


        int max = lista.stream().mapToInt(Integer::intValue).max().orElseThrow();
        int min = lista.stream().mapToInt(Integer::intValue).min().orElseThrow();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        List<Integer> filtrata = lista.stream()
                .filter(x -> x >= 10 && x <= 20)
                .collect(Collectors.toList());

        System.out.println("Lista filtrata [10..20]: " + filtrata);


        List<Double> listaDouble = lista.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());

        System.out.println("Lista Double: " + listaDouble);


        boolean contine12 = lista.stream()
                .anyMatch(x -> x == 12);

        System.out.println("Contine 12? " + contine12);
    }
}