import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task_1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "programming","madam");
        int count = genericCount(strings, s -> s.length() > 4);
        int count1 = genericCount(strings, s -> s.contentEquals(new StringBuilder(s).reverse()));

        System.out.println(count);
        System.out.println(count1);
    }


    /*Write a generic method to count the number of elements in a collection that have a specific property */

    public static <T>int  genericCount(Iterable<T> iterable ,Predicate<T> predicate){
        int count =0;

        for(T element :iterable){

            if (predicate.test(element)){
                count++;
            }
        }

        return count;
    }


}