package collectionframework;

import collectionframework.collectionclass.ListCollection;



public interface Set<T> extends Collection<T>{

    public boolean isDuplicate(T data);

    public boolean offer(T data);
    public T peek();

    public T poll();

}
