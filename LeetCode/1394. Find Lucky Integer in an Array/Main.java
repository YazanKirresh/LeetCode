import java.util.Arrays;

public class Main {
    public static int findLucky( int [] arrayOfIntegers  ) {
        int arrayLength =  arrayOfIntegers.length;
        Arrays.sort(arrayOfIntegers);
        int value =0;
        while (arrayLength > 0){
            for (int i = arrayLength-1; i > 0; i--){
                System.out.println("i = " +i);
                value = arrayOfIntegers[i];
                System.out.println("value = " + value);
                if (arrayOfIntegers[i] ==  arrayOfIntegers[i-value+1]){
                    return arrayOfIntegers[i];
                }
            }
            arrayLength--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array= {3,2,2,3,3,3,5,5,5,5,5,6,6,2};
        int luckyInteger = findLucky(array);
        if (luckyInteger == -1){
            System.out.println("Couldn't find a lucky integer in the provided array ;(");
        }else {
            System.out.println( "The lucky number is: " + luckyInteger);
        }
    }
}
