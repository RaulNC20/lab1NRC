package lab9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App2 {

    public static void main(String[] args) {

        String text = "Acesta este un program scris in java pentru expresii lambda";


        List<String> cuvinte = Arrays.asList(text.split(" "));

        System.out.println("Lista cuvinte: " + cuvinte);


        List<String> filtrate = cuvinte.stream()
                .filter(c -> c.length() >= 5)
                .collect(Collectors.toList());

        System.out.println("Cuvinte cu lungime >=5: " + filtrate);
        System.out.println("Numar: " + filtrate.size());


        List<String> sortate = filtrate.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Lista sortata: " + sortate);


        Optional<String> cuvantP = cuvinte.stream()
                .filter(c -> c.startsWith("p"))
                .findFirst();

        cuvantP.ifPresent(c -> System.out.println("Cuvant cu 'p': " + c));
    }
}
