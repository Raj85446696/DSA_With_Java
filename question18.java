import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

class BinaryTree{
    private Node root ; 

    class Node{
        private int data ; 
        private Node lChild ; 
        private Node rChild ; 

        public Node(int data){
            this.data = data ; 
        }
    }

    public void createBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(11);

        root = first ; 
        first.lChild = second; 
        first.rChild = third ; 
        second.lChild = fourth ; 
        second.rChild = sixth ; 
        third.lChild = fifth ; 
        third.rChild = seventh;
    }

    /*  There are three option to traversal of a binary Tree is :-- 
    1. Inorder() ->   left--root--right
    2. Preorder() ->  root--left--right
    3. Postorder()->  left--right--root
    */
    
    // Preorder Traversal
    public void Preorder(Node root){
        if(root==null){
            return;
        }else{
            System.out.print(root.data+" ");
            Preorder(root.lChild);
            Preorder(root.rChild);
        }
    }

    // Inorder Traversal
    public void Inorder(Node root){
        if(root==null){
            return;
        }else{
            Preorder(root.lChild);
            System.out.print(root.data+" ");
            Preorder(root.rChild);
        }
    }

    // Postorder Traversal
    public void Postorder(Node root){
        if(root==null){
            return;
        }else{
            Preorder(root.lChild);
            Preorder(root.rChild);
            System.out.print(root.data+" ");
        }
    }

    // Traversal using stack 
    public void stInorder(Node root){
        if(root==null){
            return ; 
        }else{
            Stack <Node> stack = new Stack();
            Node temp = root ; 
            while(!stack.isEmpty()||temp!=null){
                if(temp!=null){
                    stack.push(temp);
                    temp = temp.lChild;
                }else{
                    temp = stack.pop(); 
                    System.out.print(temp.data+" ");
                    temp = temp.rChild;
                }
            }
        }
       }

       // Level Order Traversal
       public void LevelOrderTraversal(Node root){
        if(root==null){
            return ;
        }else{
            Queue <Node> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                Node temp = queue.poll();
                System.out.print(temp.data+" ");
                if(temp.lChild!=null){
                    queue.offer(temp.lChild);
                }
                if(temp.rChild!=null){
                    queue.offer(temp.rChild);
                }
            }
        }
       }

       public int FindMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }else{
            int result = root.data ; 
            int left = FindMax(root.lChild);
            int right = FindMax(root.rChild);
            if(left>result){
                result = left ; 
            }
            if(right>result){
                result = right ; 
            }
            return result;
        }
       }
    
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree(); 
        b.createBinaryTree();
        // System.out.print("Preorder : ");
        // b.Preorder(b.root);
        // System.out.println("");
        // System.out.print("Inorder : ");
        // b.Inorder(b.root);
        // System.out.println("");
        // System.out.print("Postorder : ");
        // b.Postorder(b.root);
        // b.stInorder(b.root);
        // System.out.println(" ");
        // b.LevelOrderTraversal(b.root);
        b.FindMax();////////
    }
}