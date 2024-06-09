package collectionframework;

public interface Queue<T> extends Collection<T>{

    public boolean offer(T data);

    public T peek();

    public T poll();



}
