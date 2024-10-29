package oops.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

        Daughter daughter = new Daughter(12);
        daughter.career();

        Parent.hello();

        Parent daughter2 = new Daughter(28);

    }
}
