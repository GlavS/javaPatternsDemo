public class Start {
    public static void main(String[] args) {
        TestSingleton.getInstance().start();
        System.out.println(TestSingleton.getInstance());
        System.out.println(TestSingleton.getInstance());
        System.out.println(TestSingleton.getInstance());
        System.out.println(TestSingleton.getInstance());
        TestSingleton.getInstance().stop();
    }
}
