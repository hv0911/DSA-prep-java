package Stack.Basics;

public class DynamicStack<T> extends Stack<T> {
    public DynamicStack(){
        super();
    }

    public DynamicStack(int val){
        super(val);
    }

    public boolean push(T val){
      if(isFull()){
          // double the length
          T[] temp = (T[]) new  Object[data.length*2];

          // clone the previous the array into new one
          for(int i = 0 ; i < data.length; i++ ){
              temp[i] = data[i];
          }

          data = temp;
      }
      return super.push(val);
    }

}
