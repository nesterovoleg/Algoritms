import org.example.BSTNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestBST {
    Map<Integer,String> testTree;

    @BeforeEach
    void treeInit() {
        testTree = new HashMap<>();

        testTree.put(15, "Alex");
        testTree.put(19, "Oliver");
        testTree.put(11, "Emma");
        testTree.put(26, "Sophie");
        testTree.put(13, "Ava");
        testTree.put(12, "Mia");
        testTree.put(24, "Ethan");
        testTree.put(27, "William");
        testTree.put(16, "Noah");
        testTree.put(20, "Liam");
        testTree.put(10, "Jacob");
        testTree.put(21, "Mason");
        testTree.put(18, "Elijah");
        testTree.put(17, "Daniel");
        testTree.put(8, "Benjamin");
        testTree.put(9, "David");
        testTree.put(25, "Lucas");
        testTree.put(23, "Nathan");
        testTree.put(22, "Isabella");
        testTree.put(14, "Emily");
        testTree.put(30, "Grace");
        testTree.put(31, "Henry");
        testTree.put(28, "Sophia");
        testTree.put(29, "Olivia");
        testTree.put(32, "Lucy");
    }

    private BSTNode mapTransferBstnode() {
        BSTNode bstTree = new BSTNode();
        for (Map.Entry<Integer,String> item: testTree.entrySet()) {
            bstTree.put(item.getKey(), item.getValue());}
        return bstTree;
    }

    @Test
    void TestCase1() {
        BSTNode bstTree = mapTransferBstnode();
        Assertions.assertEquals(25, testTree.size());
    }

    @Test
    void TestCase2() {
        BSTNode bstTree = mapTransferBstnode();

        bstTree.depthOrderTraversal();
        System.out.println();
        Assertions.assertEquals(25, testTree.size());
    }

    @Test
    void TestCase3() {
        BSTNode bstTree = mapTransferBstnode();

        Assertions.assertEquals("Isabella",bstTree.get(22));

        Assertions.assertNull(bstTree.get(123));

        Assertions.assertEquals("Daniel",bstTree.get(17));

        Assertions.assertNull(bstTree.get(46));
    }

    @Test
    void TestCase4() {
        BSTNode bstTree = new BSTNode();

        for (Map.Entry<Integer,String> item: testTree.entrySet()) {
            if(item.getKey()!=16) {
                bstTree.put(item.getKey(), item.getValue());
            }
        }


        bstTree.put(16,"Noah");

        System.out.println(bstTree.get(16));
        Assertions.assertEquals("Noah",bstTree.get(16));
        bstTree.put(16,"Anton");

        bstTree.depthOrderTraversal();
        System.out.println();
        Assertions.assertEquals(25,bstTree.size());

        System.out.println(bstTree.get(16));
        Assertions.assertEquals("Anton",bstTree.get(16));
    }
    @Test
    void TestCase5() {
        BSTNode bstTree = mapTransferBstnode();

        bstTree.delete(16);

        bstTree.depthOrderTraversal();
        System.out.println();
        Assertions.assertEquals(24,bstTree.size());

    }
}
