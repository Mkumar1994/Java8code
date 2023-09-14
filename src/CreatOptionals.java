import java.util.Optional;

public class CreatOptionals {
    public static void main(String[] args) {
     Optional<Person>  optionalPerson = Optional.empty();
     System.out.println(optionalPerson);

     Person person = new Person("Rahul",15);
        Optional<Person>  optionalPerson2   = Optional.of(person);
        System.out.println(optionalPerson2);

        Optional<Person> optionalPerson3 = Optional.ofNullable(null);
        Optional<Person> optionalPerson4 = Optional.ofNullable(person);

        System.out.println(optionalPerson3);
        System.out.println(optionalPerson4);



    }
}
