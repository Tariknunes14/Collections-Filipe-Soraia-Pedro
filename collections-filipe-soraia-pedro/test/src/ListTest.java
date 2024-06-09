//import jdk.incubator.vector.VectorOperators;

import collectionframework.collectionclass.ListCollection;
import collectionframework.collectionclass.QueueCollection;

public class ListTest {

    public static void main(String[] args) {

        Test test = new Test();

        Test test1 = new Test();
        Test test2 = new Test();

        ListCollection<Test> list = new ListCollection<>();
        list.remove();
        list.add(test);
        list.add(test1);

        //System.out.println("What is in position 0");
        System.out.println(list.get(0));

    //    Node<Test> node = new Node<>(test);
    //    System.out.println(node.getData());
        System.out.println(test);

        //System.out.println("Does it cointain test?");
        System.out.println(list.contains(test));

        //list.remove();
        //System.out.println("Does it cointain test?");
        System.out.println(list.contains(test1));

        //System.out.println("Does it clear if yes it should have test next boolean should return false");
        //list.clear();
        //System.out.println(list.remove());
        //System.out.println(list.contains(test));

        //System.out.println("What is the indexof test if there's nothing return -1");
        System.out.println(list.indexOf(test));
        System.out.println("Creating a sublist with index 0 and 1");
        ListCollection <Test> list1 = list.sublist(0,1);
        System.out.println(list1.get(0));


    }
}