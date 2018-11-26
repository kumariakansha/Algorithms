
public class bstSearch {
	class Node{
		int key;
		Node left,right;
		public Node(int item){
			key=item;
			left=right=null;
		}
	}
	//Root of BST
	Node root;
	bstSearch()
	{
		root=null;
	}
	void insert(int key){
		root=insertRec(root,key);
	}
	Node insertRec(Node root,int key){
		if(root==null){
			root=new Node(key);
			return root;
		}
		if(key<root.key)
			root.left=insertRec(root.left,key);
		if(key>root.key)
			root.right=insertRec(root.right,key);
		return root;
		
	}
	void inorder()
	{
	 inorderRec(root);
	}
	void inorderRec(Node root){
		if(root!=null){
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	void searchIn(int key)
	{
		root=search(root,key);
		if(root!=null)
			System.out.println("the element " + key + " is present\n");
		else
			System.out.println("the element " + key + " is not present");
	}
	public Node search(Node root,int key){
		if (root==null|| root.key==key){
			return root;
		}
		if (root.key>key)
			return search(root.left,key);
		else
			return search(root.right,key);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bstSearch tree= new bstSearch() ;
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

        tree.inorder();
        tree.searchIn(10);

	}

}
