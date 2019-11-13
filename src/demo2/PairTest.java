package demo2;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair1 = new Pair<>(5, 10);
        Pair<Double, Double> pair2 = new Pair<>(2.5, 5.5);
        Pair<Integer, Double> pair3 = new Pair<>(2, 5.8);

//        Integer pair1First = (Integer) pair1.getFirst();
//        Double pair2First = (Double) pair2.getFirst();
//
//        double sum = pair1First + pair2First;
//        System.out.println(sum);

        double sum = pair1.getFirst() + pair2.getFirst();
        System.out.println(sum);
    }
}
