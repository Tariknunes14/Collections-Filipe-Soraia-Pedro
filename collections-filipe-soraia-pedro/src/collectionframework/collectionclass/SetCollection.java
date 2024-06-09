package collectionframework.collectionclass;
import collectionframework.Set;
/*Set extends the collection interface that allows creating an unordered collection or list, where dup values are not allowed. FIFO*/
public class SetCollection<T> implements Set<T> {

    //array for the data structure
    private Object[] array;

    //Constructor to get a size for the array
    public SetCollection(int number) {
        this.array = new Object[number] ;
    }

    @Override
    public int size() {
        //it will count until we have a null, if we have 1 spot with data and the other null it means theres 1 data in the array
        int count = 0;
        while (array[count] != null){
            count ++;
        }
        return count;
    }

    @Override
    public boolean isDuplicate(T data) {
        for(int i = 0; i < array.length; i++) {
            //check if the i position is == data if it is return true and obj cant be added
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(T data) {

        for(int i = 0; i < array.length; i++){
            //check if the i position is null if it's null add the data there and return true
            if (isDuplicate((T) array[i]))
                    return false;
            if (!isDuplicate((T) array[i]) && array[i] == null){
                array[i] = data;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove() {
        int count = 0;

        if(isEmpty()){
            return false;
        }

        //Check when the array is null, get the previous position to remove it
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                count = i-1;
                break;
            }
            count = i;
        }
        //if theres no null it will get the last position and removes that one
        //It removes the object in the array
        array[count] = null;
        return true;
    }

    @Override
    public boolean contains(T contain) {
        if(isEmpty()){
            return false;
        }
        //it goes through the array and check if the object is save in the array
        for(int i = 0; i < array.length; i++){
            //if theres a null spot it means theres no more data foward, you dont need to check every spot after that
            if(array[i] == null){
                return false;
            }
            if(array[i].equals(contain)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(array[0] == null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void clear() {
        if(isEmpty()){
            return;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                return;
            }
            array[i] = null;
        }
    }

    @Override
    public boolean offer(T data) {
        //ask the difference in stand up session between add and offer
        //add(data);
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                array[i] = data;
                return true;
            }
        }
        return false;
    }

    @Override
    public T peek() {

        //if it's empty there's no object in the queue
        if(isEmpty()){
            return null;
        }
        //return object head of the queue
        return (T) array[0];
    }

    @Override
    public T poll() {
        Object data = null;

        if(isEmpty()){
            return (T) data;
        }

        for(int i = 0; i < array.length-1; i++){
            //since we need to poll the first position we get the data from the first one
            if(i == 0){
                data = array[0];
            }
            //copy the i+1 to the current position[i] and removes from i+1
            if(array[i+1] != null){
                array[i] = array[i+1];
                array[i+1] = null;
            }
            //when array[i] is null it means there's no more data to copy foward
            if(array[i] == null){
                break;
            }
        }
        return (T) data;
    }


}
