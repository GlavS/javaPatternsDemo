public class TestSingleton {
    private static TestSingleton instance;

    public static TestSingleton getInstance(){
        if(instance == null){ // ленивая инициализация!
            instance = new TestSingleton();
        }
        return instance;
    }
    private TestSingleton(){
    }

    @Override
    public String toString() {
        return "I am TestSingleton, hash: " + this.hashCode();
    }
    public void start(){
        System.out.println("Singleton started");
    }
    public void stop(){
        System.out.println("Singleton stopped");
    }
}
