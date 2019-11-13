package zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        List<Double> list = createList();

        printList(list);
        System.out.println(sumEven(list));
        System.out.println(multiplyOdd(list));
        System.out.println(findMax(list));
    }

    private static double findMax(List<Double> list) {
        double max = list.get(0);
        for (Double num : list) {
            if(max < num){
                max = num;
            }
        }
        return max;
    }

    private static double multiplyOdd(List<Double> list) {
        double multi = 1;
        for (int i = 1; i < list.size() ; i += 2) {
            multi *= list.get(i);
        }
        return multi;
    }

    private static double sumEven(List<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i += 2) {
            sum += list.get(i);
        }
        return sum;
    }

    private static void printList(List<Double> list) {
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }

    private static List<Double> createList() {
        Scanner input = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(input.nextDouble());
            input.nextLine();
        }
        return list;
    }
}
