import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] testNumbers = new int[]{4, 8, 3, 4, 5, 8};
        //System.out.println(getDifference(testNumbers));
        //getTwoSmall(testNumbers);
        System.out.println(mathExpr(2, 5));
    }

    public static int getDifference(int[] numbers){
        int bigN = numbers[0];
        int smallN = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > bigN){
                bigN = numbers[i];
            }
            if (numbers[i] < smallN){
                smallN = numbers[i];
            }
        }
        return bigN - smallN;
    }
    public static void getTwoSmall(int[] numbers){
        Arrays.sort(numbers);
        int smallestN = numbers[0];
        int secondSmallestN = numbers[1];
        System.out.println(smallestN);
        System.out.println(secondSmallestN);
    }
    public static double mathExpr(int x, int y){
        double sumN = ((4 * y) / 5) - x;
        return (x*x) + Math.pow(sumN, 2);
    }
}