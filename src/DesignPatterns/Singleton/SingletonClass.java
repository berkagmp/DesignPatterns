package DesignPatterns.Singleton;

class SingletonSample {
    private static SingletonSample ourInstance = new SingletonSample();

    public static SingletonSample getInstance() {

        if (ourInstance == null) {
            ourInstance = new SingletonSample();
            System.out.println("New SingletonSample has made\n");
        }else{
            System.out.print("It has been already existed.\n");
        }

        return ourInstance;
    }

    private SingletonSample() {
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        System.out.println("Trying to make a captain for our team\n");
        SingletonSample c1 = SingletonSample.getInstance();

        System.out.println("Trying to make another captain for our team\n");
        SingletonSample c2 = SingletonSample.getInstance();

        if (c1 == c2) {
            System.out.println("c1 and c2 are same instance");
        }
    }
}
