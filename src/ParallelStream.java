import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

       int total = Stream.of(1,2,3,4,5,6,7,8,9,10).
               parallel()
               .reduce(1,(x,y) -> x+y);
        System.out.println(total);


        String[] arrayName= {"Andrew","Einstein","Edward","Mark","SaiRam","Maarie","Marcus"};
        List<String> nameList= new ArrayList<>(Arrays.asList(arrayName));

        nameList.parallelStream().filter(s-> s.startsWith("M")).forEach(s-> System.out.println(s));

        

    }
}
