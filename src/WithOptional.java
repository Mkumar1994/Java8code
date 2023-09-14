import java.util.Optional;

public class WithOptional {
    public static void main(String[] args) {
       Integer[] nums = new  Integer[10];
        Optional<Integer> maybeInt = Optional.ofNullable(nums[4]);

        if(maybeInt.isPresent()){
            int num = nums[4].intValue();
            System.out.println(num);
        }
        else
        {
            System.out.println("int value not present");
        }

    }

}
