package OOPs.Basics;
public class ObjectType {
    public int num;

    ObjectType(int num){
        this.num = num;
    }
    @Override
    public String toString(){
       return  "Object printed";
    }

    public static void main(String[] args) {
        ObjectType obj = new ObjectType(59);
        System.out.println(obj);

    }
}
