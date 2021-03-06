
import java.util.LinkedList;
import java.util.Queue;

public class Node {
    int key;
    Node left,right;
    public Node(int item){
        this.key=item;
        left=right=null;

    }
}class  BinaryTree {
      static Node root;



    static Node buildTreeFromArray(int[] arr,int s,int e){
       if(s>e)//or(s==e)
       {
           return null;
       }
       int mid=(s+e)/2;
       Node root = new Node(arr[mid]);
       root.left=buildTreeFromArray(arr,s,mid-1);
       root.right=buildTreeFromArray(arr,mid+1,e);

       return root;
    }
    static void printPreorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.key+" ");
        
        printPreorder(node.left);
       
        printPreorder(node.right);
        
    }





    public static void main(String[] args) {
       /* BinaryTree tree = new BinaryTree();

        tree.root=new Node(1);

        tree.root.left=new Node(2);

        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);

        tree.root.left.right = new Node(5);
        tree.root.left.left.left=new Node(8);
        if (tree.isBalanced(tree.root)) {
            System.out.println("Balanced tree");


        }
        else

        {
            System.out.println("Not");

        }*/
       int arr[]={1,2,3,4,2,1,4,2};
       int n = 8;
       Node root = buildTreeFromArray(arr,0,n-1);
       printPreorder(root);






    }
}
