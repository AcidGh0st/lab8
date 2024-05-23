package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BTreeTest {

    @Test
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
            System.out.println("Size: "+bTree.size());
            int value = util.Utility.getRandom(50);
            if (bTree.contains(value)) {
//                bTree.remove(value);
                System.out.println("Value: " + value + " was deleted");
            }else System.out.println("Value: " + value + " does not exist");

            for (int i = 0; i < a.length; i++) {
                System.out.println("height(a[: " + a[i]+"]) = " + bTree.height(a[i]));
            }

            System.out.println("Tree Height : " + bTree.height());
            System.out.println(bTree.toString());

        } catch (TreeException e) {
            throw new RuntimeException(e);
        }
    }
}