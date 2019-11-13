package zad4;

import java.io.*;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        try (BufferedReader br
                     = new BufferedReader(new FileReader(new File("number.csv")))) {
            String line;
            int counter = 0;
            TreeSet<Integer> numbers = new TreeSet<>();
            while((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
                counter++;
            }

            System.out.println("Najmniejsza " + numbers.first());
            System.out.println("Największa " + numbers.last());
            System.out.println("Liczba unikalnych " + numbers.size());
            System.out.println("Liczba wszystkich " + counter);
            System.out.println(numbers);

        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
