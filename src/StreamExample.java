import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        /*String[] names={"Adnane","Mary","Laila","Dennis","Nitin","sairam","Maaike"};
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
        System.out.println(total);*/

        /*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> cubeNumber = numbers.stream().map(a->a*a*a).collect(Collectors.toList());

        System.out.println("cube of the Numbers:" +cubeNumber);*/

        List<Integer> naturalNumbers =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> nNumber = naturalNumbers.stream().filter(x ->x%2 ==0).collect(Collectors.toList());
        System.out.println(nNumber);

        List<Integer> numberss = Arrays.asList(10,1,9,7,5,12,4);
        List<Integer>num =numberss.stream().sorted().collect(Collectors.toList());
        System.out.println(num);

        List<String> countries = Arrays.asList("Bharath","Malaysia","Nepal","Bhutan","sri lanka","Afghanistan","Balochistan","Bharath","Bhutan");

        List<String> distinctCountries = countries.stream().distinct().sorted().collect(Collectors.toList());

        System.out.println(distinctCountries);


        List<String> listOfCountries = Arrays.asList("India", "Indonesia", "Nepal", "Afghanistan");

        List<String> output =  listOfCountries.stream().filter(x-> x.toString().startsWith("I")).collect(Collectors.toList());
        System.out.println(output);


        List<String> countriess = Arrays.asList("Bharat","Canada","Indonesia","Sri lanka","Malaysia","Nepal","Moraaco");
        long countNumber = countriess.stream().filter(i -> i.startsWith("M")).count();
        System.out.println(countNumber);

        List<String> listCountries = Arrays.asList("Bharat","Canada","Indonesia","Sri lanka","Malaysia","Nepal","Moraaco");
        boolean anyMatchCountries = listCountries.stream().noneMatch(x->x.startsWith("I"));
        System.out.println(anyMatchCountries);




    }
}
