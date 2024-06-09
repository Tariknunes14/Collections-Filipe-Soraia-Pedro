//import jdk.incubator.vector.VectorOperators;

import collectionframework.collectionclass.ListCollection;
import collectionframework.collectionclass.QueueCollection;
import collectionframework.collectionclass.SetCollection;

public class SetTest {

    public static void main(String[] args) {

        Test test = new Test();

        Test test1 = new Test();
        Test test2 = new Test();

        System.out.println("   ");
        System.out.println("set test");
        SetCollection<Test> set = new SetCollection<>(3);
        System.out.println(set.size());
        System.out.println(set.add(test));
        System.out.println(set.add(test1));
        set.add(test2);

        System.out.println("dupe?");
        System.out.println(set.add(test2));

        //System.out.println(set.remove());
        //System.out.println("Contain test");
        //System.out.println(set.contains(test1));

        //System.out.println("after clear if Contain test");
        //queue.clear();
        //System.out.println(set.contains(test));
        //System.out.println("add 1 object with array over the limit!");
        //System.out.println(set.offer(test1));
        //System.out.println(set.contains(test1));
        System.out.println("Poll test, removing test and putting test1 on position 0");
        System.out.println(set.poll());
        System.out.println(set.contains(test));
        System.out.println(set.contains(test1));
    }
}