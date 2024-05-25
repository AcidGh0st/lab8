package domain;

import domain.list.CircularDoublyLinkedList;
import domain.list.ListException;
import domain.list.SinglyLinkedList;
import domain.queue.LinkedQueue;
import domain.queue.QueueException;
import domain.stack.LinkedStack;
import domain.stack.StackException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
class BTreeTest {

    //    @Test
    void test() {
        BTree bTree = new BTree();
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int value = util.Utility.getRandom(50);
            bTree.add(value);
            a[i] = value;
        }

        try {
            System.out.println(bTree.toString());
            System.out.println("Size: " + bTree.size());
            int value = util.Utility.getRandom(50);
            if (bTree.contains(value)) {
//                bTree.remove(value);
                System.out.println("Value: " + value + " was deleted");
            } else System.out.println("Value: " + value + " does not exist");

            for (int i = 0; i < a.length; i++) {
                System.out.println("height(a[: " + a[i] + "]) = " + bTree.height(a[i]));
            }

            System.out.println("Tree Height : " + bTree.height());
            System.out.println(bTree.toString());

        } catch (TreeException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void BTreeTest2(){
        try {
            BTree btree = new BTree();

            // Insertar objetos en el árbol
            SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
            CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
            LinkedStack linkedStack = new LinkedStack();
            LinkedQueue linkedQueue = new LinkedQueue();
            BTree subBTree = new BTree();

            for (int i = 0; i < 20; i++) {
                singlyLinkedList.add(util.Utility.getRandom(50) + 1);
            }

            circularDoublyLinkedList.add("Valentina");
            circularDoublyLinkedList.add("Jimena");
            circularDoublyLinkedList.add("Alex");
            circularDoublyLinkedList.add("Felipe");
            circularDoublyLinkedList.add("Cristina");
            circularDoublyLinkedList.add("Joel");
            circularDoublyLinkedList.add("Michael");
            circularDoublyLinkedList.add("Alejandro");
            circularDoublyLinkedList.add("María");
            circularDoublyLinkedList.add("Julian");
            circularDoublyLinkedList.add("Katherin");
            circularDoublyLinkedList.add("Leonardo");
            circularDoublyLinkedList.add("Mercedes");
            circularDoublyLinkedList.add("Nicol");
            circularDoublyLinkedList.add("Oscar");
            circularDoublyLinkedList.add("Paula");
            circularDoublyLinkedList.add("Maryam");
            circularDoublyLinkedList.add("Rosa");
            circularDoublyLinkedList.add("Samantha");
            circularDoublyLinkedList.add("Jorge");



            linkedStack.push("Costa Rica");
            linkedStack.push("Colombia");
            linkedStack.push("Argentina");
            linkedStack.push("Mexico");
            linkedStack.push("Brasil");
            linkedStack.push("Italia");
            linkedStack.push("España");
            linkedStack.push("Alemania");
            linkedStack.push("Francia");
            linkedStack.push("Panamá");


            for (int i = 0; i < 100; i++) {
                linkedQueue.enQueue(util.Utility.getRandom(4000) + 1000);
            }

            for (char ch = 'A'; ch <= 'Z'; ch++) {
                subBTree.add(ch);
            }

            btree.add(singlyLinkedList);
            btree.add(circularDoublyLinkedList);
            btree.add(linkedStack);
            btree.add(linkedQueue);
            btree.add(subBTree);

//        System.out.println(btree.toString());


//        System.out.println("Size: " + btree.size());
//        System.out.println("Height: " + btree.height());
//        System.out.println("Height of SinglyLinkedList: " + btree.height(singlyLinkedList));
//        System.out.println("Contains CircularDoublyLinkedList: " + btree.contains(circularDoublyLinkedList));


//        System.out.println();
//        System.out.println();
//
//        System.out.println("Remove:");

            btree.remove(linkedQueue);

            for (int i = 0; i < 5; i++) {
                singlyLinkedList.remove(i);
            }

            for (int i = 0; i < 5; i++) {
                circularDoublyLinkedList.remove(i);
            }

            for (int i = 0; i < 5; i++) {
                linkedStack.pop();
            }

            ///**********************
            // revisar el punto e (iv)
            ///************************
            for (int i = 0; i < 5; i++) {
                char ch = (char) (util.Utility.getRandom(26) + 'A');
                subBTree.remove(ch);
            }

//        System.out.println(btree.toString());


//        System.out.println("Height of SinglyLinkedList: " + btree.height(singlyLinkedList));
//        System.out.println("Height of CircularDoublyLinkedList: " + btree.height(circularDoublyLinkedList));
//        System.out.println("Height of LinkedStack: " + btree.height(linkedStack));
//        System.out.println("Height of BTree: " + btree.height(subBTree));
        } catch (QueueException | StackException | TreeException | ListException e) {
            throw new RuntimeException(e);
        }
    }
//}

//    @Test
//    public void BTreeTest2() throws QueueException, TreeException, ListException, StackException {
//
//        Random rand = new Random();
//
//
//        BTree btree = new BTree();
//
//        // Insertar objetos en el árbol
//        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
//        LinkedStack linkedStack = new LinkedStack();
//        LinkedQueue linkedQueue = new LinkedQueue();
//        BTree subBTree = new BTree();
//
//        for (int i = 0; i < 20; i++) {
//            singlyLinkedList.add(rand.nextInt(50) + 1);
//        }
//
//        List<String> personNames = Arrays.asList(
//                "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivy", "Jack",
//                "Kate", "Leo", "Mona", "Nina", "Oscar", "Paul", "Quincy", "Rose", "Sam", "Tina"
//        );
//
//        for (String name : personNames) {
//            circularDoublyLinkedList.add(name);
//        }
//
//        for (int i = 0; i < 100; i++) {
//            linkedQueue.enQueue(rand.nextInt(4001) + 1000);
//        }
//
//        for (char ch = 'A'; ch <= 'Z'; ch++) {
//            subBTree.add(ch);
//        }
//
//        List<String> countryNames = Arrays.asList(
//                "USA", "Canada", "Mexico", "Brazil", "Argentina", "UK", "Germany", "France", "Italy", "Spain"
//        );
//
//
//        for (String country : countryNames) {
//            linkedStack.push(country);
//        }
//
//        btree.add(singlyLinkedList);
//        btree.add(circularDoublyLinkedList);
//        btree.add(linkedStack);
//        btree.add(linkedQueue);
//        btree.add(subBTree);
//
//        System.out.println(btree.toString());
//
//
//        System.out.println("Size of tree: " + btree.size());
//        System.out.println("Height of tree: " + btree.height());
//        System.out.println("Height of SinglyLinkedList: " + btree.height(singlyLinkedList));
//        System.out.println("Contains CircularDoublyLinkedList: " + btree.contains(circularDoublyLinkedList));
//
//
//        System.out.println(" ");
//        System.out.println(" ");
//
//        System.out.println("REMOVER ELEMENTOS:");
//
//        btree.remove(linkedQueue);
//
//        for (int i = 0; i < 5; i++) {
//            singlyLinkedList.remove(i);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            circularDoublyLinkedList.remove("Person" + i);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            linkedStack.pop();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            char ch = (char) (rand.nextInt(26) + 'A');
//            subBTree.remove(ch);
//        }
//
//        System.out.println(btree.toString());
//
//
//        System.out.println("Height of SinglyLinkedList: " + btree.height(singlyLinkedList));
//        System.out.println("Height of CircularDoublyLinkedList: " + btree.height(circularDoublyLinkedList));
//        System.out.println("Height of LinkedStack: " + btree.height(linkedStack));
//        System.out.println("Height of BTree: " + btree.height(subBTree));
//    }
}