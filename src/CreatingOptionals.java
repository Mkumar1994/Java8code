import java.util.Optional;

public class CreatingOptionals {
    public static void main(String[] args) {
        Optional<User> optionalUser = Optional.empty();
        System.out.println("Empty Optional:"+optionalUser.isPresent());


        Optional<User> optionalUser1 = Optional.of(new User("Lisa"));
        System.out.println("Lisa optional:"+optionalUser1.isPresent());

        User user= null;
        Optional<User> optionalUser2 = Optional.ofNullable(user);
        System.out.println("null optional:"+optionalUser2.isPresent());


        Optional<User> nullOptional = Optional.ofNullable(user);
        System.out.println("null optional:"+nullOptional.isPresent());

        System.out.println(nullOptional.orElse(new User("Maiika")));

        System.out.println(optionalUser1.orElseThrow(()->new NullPointerException("No value")));

        System.out.println(optionalUser1.filter(u->u.getName().startsWith("M")).orElse(new User("Luka")));


        Optional<Integer> integerOptional = Optional.of(30);
        System.out.println("mapped optional:"+integerOptional.map(i->i*2).get());


    }
}
