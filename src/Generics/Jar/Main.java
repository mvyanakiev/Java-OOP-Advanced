package Generics.Jar;

public class Main {
    public static void main(String[] args) {

        Jar<String> jar = new Jar<>();

        jar.add("asd");
        jar.add("dsf");
        jar.remove();

        System.out.println(jar);

        Jar<Integer> intJar = new Jar<>();

        intJar.add(12);
        intJar.add(34);
        intJar.add(2345);

        System.out.println(intJar);



    }
}
