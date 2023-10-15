package OOPs.Basics.AbstractClasses;

public abstract class Parent {

    public Parent(int age){
        this.age = age;
    }

    int age;
    abstract void carrer(String str);
    abstract String partnar(String str);
    abstract void getAge();

}
