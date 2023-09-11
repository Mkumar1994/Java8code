import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] names={"Adnane","Mary","Laila","Dennis","Nitin","sairam","Maaike"};
        List<String> nameList =  new ArrayList<>(Arrays.asList(names));

        //create stream based on array.
        Arrays.stream(names).forEach(name -> System.out.println(name));
        Optional<String> resultMin = Arrays.stream(names).min((a,b)->a.compareTo(b));
        System.out.println(resultMin);

        //create stream based on collection.
        Stream<String> listStream = nameList.stream();
        boolean  resultListStream =nameList.stream().allMatch(name -> !name.isEmpty());
        System.out.println("all non empty:"+ resultListStream);

        boolean  allMatchStream = nameList.stream().allMatch(name -> name.startsWith("M"));
        System.out.println("all start with m:" +allMatchStream);


        List<String> listNamesLongerThan5 = nameList.stream().filter(name -> name.length() > 5).collect(Collectors.toList());
        System.out.println(listNamesLongerThan5);

        nameList.stream().filter(s -> s.startsWith("M")).forEach(s -> System.out.println(s));



        //create stream based on generate stream.
        Stream<Integer> generateStream = Stream.generate(() -> 5 );



        Stream<Integer> iterateStream = Stream.iterate(1,x->x+3);

        int[] ints ={1,2,3,4,5};
        int total =Arrays.stream(ints).reduce(0,(x,y) ->x+y);
        System.out.println(total);

    }
}
