package genericexample;

public class Store<T>
{
    private T store;
    
    public void put(T object) {
        store = object;
    }
    
    public T get() {
        return store;
    }
}
