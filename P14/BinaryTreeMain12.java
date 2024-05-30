package P14;

public class BinaryTreeMain12 {
    public static void main(String[] args) {
        BinaryTree12 bt = new BinaryTree12();
        bt.root = bt.addRekursif(bt.root, 6);
        bt.root = bt.addRekursif(bt.root, 4);
        bt.root = bt.addRekursif(bt.root, 8);
        bt.root = bt.addRekursif(bt.root, 3);
        bt.root = bt.addRekursif(bt.root, 5);
        bt.root = bt.addRekursif(bt.root, 7);
        bt.root = bt.addRekursif(bt.root, 9);
        bt.root = bt.addRekursif(bt.root, 10);
        bt.root = bt.addRekursif(bt.root, 15);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}
