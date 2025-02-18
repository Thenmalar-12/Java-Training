import java.util.*;

public class streams_even{
    public static void main(String args[]){
        List <Integer> nums = Arrays.asList(64,67,32,63,24,15,4,7,11);
        nums.stream()
        .filter(n -> n%2==0)
        .forEach(n -> System.out.println(n));

    }

}