//import jdk.incubator.vector.VectorOperators;

import collectionframework.collectionclass.ListCollection;
import collectionframework.collectionclass.QueueCollection;

public class QueueTest {

    public static void main(String[] args) {

        Test test = new Test();

        Test test1 = new Test();
        Test test2 = new Test();

        System.out.println("   ");
        System.out.println("Queue test");
        QueueCollection<Test> queue = new QueueCollection<>(3);
        System.out.println(queue.size());
        System.out.println(queue.add(test));
        System.out.println(queue.add(test1));
        queue.add(test2);

        //System.out.println(queue.remove());
        //System.out.println("Contain test");
        //System.out.println(queue.contains(test1));

        //System.out.println("after clear if Contain test");
        //queue.clear();
        //System.out.println(queue.contains(test));
        //System.out.println("add 1 object with array over the limit!");
        //System.out.println(queue.offer(test1));
        //System.out.println(queue.contains(test1));
        System.out.println("Poll test, removing test and putting test1 on position 0");
        System.out.println(queue.poll());
        System.out.println(queue.contains(test));
        System.out.println(queue.contains(test1));
    }
}