package Tree;

public class Tree {

	private Node root;

	public Tree() {

		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public boolean insert(int i) {
		// TODO Auto-generated method stub
		Node nn = new Node(i);
		if (nn == null) {
			return false;
		}
		if (root == null) {
			root = nn;
			
		}
		Node r1;
		Node n1 = root;
		while(n1!=null)
		{
			 r1=n1;
			 if(i>n1.getData())                   				 
			 {
				 n1=n1.getrchild();
			 }
			 else
				 n1=n1.getlchild();
		
		 if(n1==null)
		{
			if(i>r1.getData())
			{
				r1.setlchild(nn);
				
			}
			else
				r1.setlchild(nn);
		}
	}
		return true;
	}

	public void inorder(Node T) {

		if (T == null) {
			return;
		}
		inorder(T.getlchild());
		System.out.println(" "+T.getData());
		inorder(T.getrchild());
	}
	
//	public void inorder(Node T) {
//		if (T == null)
//			return;
//		inorder(T.getlchild());
//		System.out.print("  " + T.getData());
//		inorder(T.getrchild());
//	}

}
