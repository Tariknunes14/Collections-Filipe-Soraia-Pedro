package collectionframework;
import collectionframework.collectionclass.ListCollection;
public interface List<T> extends Collection<T> {


    public T get(int position);

    public int indexOf(T data);

    public ListCollection sublist(int fromIndex, int toIndex);






}
