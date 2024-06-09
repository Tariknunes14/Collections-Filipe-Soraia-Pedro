package collectionframework.collectionclass;

import collectionframework.List;

public class ListCollection<T> implements List<T> {

    private int lenght = 0;
    private Node<T> head = new Node<>(null);



    @Override
    public int size() {
        return lenght;
    }

    @Override
    public boolean add(T data) {

        Node<T> node = new Node<>(data);
        Node<T> interater = head;

        while (interater.getNext() != null) {
            interater = interater.getNext();

        }
        interater.setNext(node);
        lenght++;
        return true;
    }

    @Override
    public boolean remove() {
        Node<T> interater = head;
        int counter = 0;
        //if counter == lengths it means there's nothing on the list
        if (isEmpty()){
            return false;
        }
        //to get the spot before the last
        while(counter < lenght-1){
            interater = interater.getNext();
        counter ++;
        }
        //removing the connection to the data removed
        interater.setNext(null);
        lenght --;
        return true;
    }

    @Override // corrigir object para T
    public boolean contains(T contain) {
        Node<T> interater = head;
        //Check if we don't need counter for this we can use interater.getNext() != null I think
       int counter = 0;
       //we need to check if the list is empty before checking
        if (isEmpty()){
            return false;
        }
        //now we do a loop to check if the object is save on the list
       while (counter < lenght){
           interater = interater.getNext();
          if (interater.getData().equals(contain)){
              return true;
          }
//          interater = interater.getNext();
           counter ++;
       }
       return false;
    }

    @Override
    public boolean isEmpty() {

        Node<T> interater = head;
        //Is empty?if is empty it returns a true
        if (interater.getNext() != null){
            return false;
        }
        else
            return true;
    }

    @Override
    public void clear() {
        Node<T> interater = head;
        // to get an empty list we just need to say the head isn´t pointing to anything
        interater.setNext(null);
        lenght = 0;
    }

    @Override
    public T get(int position) {
        Node<T> interater = head;
        int counter = 0;
        //if the list is empty returns empty
        if(isEmpty()){
            return null;
        }
        //it will get the correct postion
        while (counter <= position){
            //IF theres nothing on that position returns null
            if(interater.getNext() == null){
                return null;
            }
            interater = interater.getNext();
            counter ++;
        }

        return interater.getData();
    }

    @Override
    public int indexOf(T data) {
        Node<T> interater = head;
      int counter = 0;
      //if List is empty return -1
      if (isEmpty()){
          return -1;
      }

        while (counter < lenght){
            //We know that the head is always empty we need to start with the next node that has information
            interater = interater.getNext();
            if (interater.getData().equals(data)){
                return counter;
            }

            //interater = interater.getNext();
            counter ++;
        }
        //if we didn't get a match return -1
        return -1;
    }

    @Override
    public ListCollection sublist(int fromIndex, int toIndex) {
        Node<T> interater = head;
        //check if the list is empty, if its is It can't return anything for the sublist
        if (isEmpty()){
           return new ListCollection<T>();
        }
        //since we know its not empty we can start to get iterator to the correct position before creating the sublist
        //Loop to get to the index position
        int i = -1;
        while(i <fromIndex){
            interater = interater.getNext();
            i ++;
        }

       ListCollection <T> list = new ListCollection();//the list that we are going to return
        while (i <= toIndex && interater != null){//a loop to add the data fromIndex toIndex. IF we said we want from 0 to 1 but 1 is empty the loop will stop, and it will add only position 0

            list.add(interater.getData());
            interater= interater.getNext();
            i ++;
        }
        return list; //return list

    }
}
