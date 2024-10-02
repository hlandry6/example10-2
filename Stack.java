import java.util.ArrayList;

public class Stack<T>{
    private ArrayList<T> bob;
    
    public Stack(){
        bob = new ArrayList<T>();
    }

    public void push(T item){
        bob.add(item);
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }
        return (bob.remove(bob.size() - 1));

    }

    public T peek(){
        if(isEmpty()){
            return null;
        }
        return bob.get(bob.size() - 1);
    }

    public boolean isEmpty(){
        return bob.isEmpty();
    }

    public int size(){
        return bob.size();
    }
}