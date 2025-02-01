class BinarySearchTree{
    private Node root ; 

    private class Node{
        private int data ; 
        private Node Lchild ; 
        private Node Rchild ; 

        public Node(int data){
            this.data = data ;
            this.Lchild = null ; 
            this.Rchild = null ; 
        }
    }

    public void InsertNode(int value){
        root = InsertNode(root,value);
    }

    public Node InsertNode(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }else{
            if(value<root.data){
                root.Lchild = InsertNode(root.Lchild, value);
            }else{
                root.Rchild = InsertNode(root.Rchild, value);
            }return root;
        }
    }

    
    // Inorder Traversal 
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node root){
        if(root==null){
            return ; 
        }else{
            inOrder(root.Lchild);
            System.out.print(root.data+" ");
            inOrder(root.Rchild);
        }
    }

    // Preorder Traversal 
    public void PreOrder(){
        PreOrder(root);
    }
    public void PreOrder(Node root){
        if(root==null){
            return ; 
        }else{
            System.out.print(root.data+" ");
            PreOrder(root.Lchild);
            PreOrder(root.Rchild);
        }
    }

    //PostOrder Traversal
    public void PostOrder(){
        PostOrder(root);
    }
    public void PostOrder(Node root){
        if(root==null){
            return;
        }else{
            PostOrder(root.Lchild);
            PostOrder(root.Rchild);
            System.out.print(root.data+" ");
        }
    }

    public Node Search(int key){
        return Search(root,key);
    }

    public Node Search(Node root,int key){
        if(root==null || root.data == key){
            return root;
        }else{
            if(key<root.data){
                return Search(root.Lchild, key);
            }else{
                return Search(root.Rchild, key);
            }
        }
    }

    public boolean isValid(Node root,long min,long max){
        if(root==null){
            return true;
        }else{
            if(root.data<=min || root.data>=max){
                return false ; 
            }
            boolean left = isValid(root.Lchild, min, root.data);
            if(left){
                boolean right = isValid(root.Rchild, root.data,max);
                return right;
            }return false;
        }
    }
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree(); 
        b.InsertNode(88);
        b.InsertNode(48);
        b.InsertNode(68);
        b.InsertNode(188);
        b.InsertNode(868);

        // System.out.print("Preorder : ");
        // b.PreOrder();

        // System.out.println("");
        // System.out.print("Inorder  : ");
        // b.inOrder();

        // System.out.println("");
        // System.out.print("Postorder: ");
        // b.PostOrder();
        Node result = b.Search(188);
        if(result!=null){
            System.out.println("Found : "+result.data);
        }else{
            System.out.println("Not Found..");
        }
        

    }
}