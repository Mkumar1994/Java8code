import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        String[] arrayList = {"Adnane","Mary","Laila","Dennis","Nitin","sairam","Maaike"};

        List<String> nameList =  new ArrayList<>(Arrays.asList(arrayList));

        //filter
        nameList.stream().filter(s -> s.startsWith("M")).forEach(s-> System.out.println(s));

        //map
        nameList.stream().map(s->s +" student").forEach(s-> System.out.println(s));


        /*String[][] names2d = { arrayList, arrayList };

       String[]  name1d = Stream.of(names2d).flatMap(arr-> Stream.of(arr)).toArray(size -> new String[size]);


          for(String name:name1d){
              System.out.println("1d arr:"+name);
          }*/


        String[][] names2d = { arrayList, arrayList };

        String[]  name1d = Stream.of(names2d).
                flatMap(arr-> Stream.of(arr)).
                peek(s -> System.out.println("peek:"+s)).
                toArray(size -> new String[size]);


        Arrays.stream(name1d).skip(1).forEach(s-> System.out.println("skip:"+ s));

        Arrays.stream(name1d).limit(1).forEach(s-> System.out.println("limit word:"+ s));

        Arrays.stream(name1d).skip(3).limit(5).forEach(s-> System.out.println("limit and skip word:"+ s));


        long distinctValues = Arrays.stream(name1d).distinct().count();
        System.out.println("distinct values "+distinctValues);


        Arrays.stream(name1d).sorted().forEach(s-> System.out.println("sorted list:"+ s));

    }
    }

