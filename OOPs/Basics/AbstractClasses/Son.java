package OOPs.Basics.AbstractClasses;

public class Son extends Parent{

  public Son(int age){
      super(age);
   }

  @Override
  void carrer(String str){
      System.out.println("I want to be a " + str);
  }

  @Override
  String partnar(String str){
      return "I love" + str;
  }

  void getAge(){
      System.out.println("My age is" + this.age);
  }


}
