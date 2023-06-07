package Tree;

public class TreeImplement {
	
	
	public static void main(String [] args) {
		
		
		Tree T=new Tree();
		T.insert(9);
		T.insert(19);
		T.insert(29);
		T.insert(23);
		T.insert(45);
		T.insert(76);
		T.insert(56);
		System.out.print("inorder-->");
		T.inorder(T.getRoot());
//		T.inorder();
		
		
	}

}
