import java.util.*;

public class Test
{
    public static void main(String[] args) {
        Tuple<Integer, String> intString = new Tuple<>(1, "Dave");
        
        Tuple<String, String> stringString = new Tuple<>("2", "Juan");

        Tuple<Scanner,Scanner> scannerScanner = new Tuple<>(new Scanner(System.in), new Scanner(System.in));

        Tuple[] arr = new Tuple[3];

        arr[0] = intString;
        arr[1] = stringString;
        arr[2] = scannerScanner;
        System.out.println(intString);
        for(int i=0; i< 3; i++)
            System.out.println(arr[i].getValue());

        Dog one = new Dog(18);
        Dog two = new Dog(8);
        
        System.out.println(one.compare2(two));        
    }
}