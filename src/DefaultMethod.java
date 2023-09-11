public class DefaultMethod  implements   Sayable{

    @Override
    public void say() {

    }

    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethod dm = new DefaultMethod();
        dm.say();
        dm.sayMore("work is workship");

    }
}
