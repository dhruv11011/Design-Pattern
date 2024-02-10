package singleton_pattern;

public class test {
    public static void main(String[] args) {
        lazy lazy=singleton_pattern.lazy.getobj();
        lazy lazy1=singleton_pattern.lazy.getobj();
        lazy lazy2=singleton_pattern.lazy.getobj();
        System.out.println(lazy);
        System.out.println(lazy1);
        System.out.println(lazy2);
    }
}