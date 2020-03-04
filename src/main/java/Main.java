import java.util.Arrays;
import java.util.stream.*;


public class Main {
    public static void main(String[]args){
        int[] arr ={0,1,2,3,4,5,6,7,8,9};
        IntStream.range(0, arr.length-1).parallel().
                reduce((a,b)->arr[a]>arr[b]? b: a).
                ifPresent((ix -> System.out.println("Index: " + ix + ", value: " + arr[ix])));
        IntStream.range(0, arr.length-1).filter(x -> x==0).forEach(System.out::println);
        IntStream.range(0, arr.length-1).filter(x -> x>0).forEach(System.out::println);
        IntStream.range(0, arr.length-1).map(x -> x * 5).forEach(System.out::println);



    }
}
