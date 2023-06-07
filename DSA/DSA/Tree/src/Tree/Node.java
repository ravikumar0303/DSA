package Tree;

public class Node {

	private int data;
	private Node lchild, rchild;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getlchild() {
		return lchild;
	}

	public void setlchild(Node lchild) {
		this.lchild = lchild;
	}

	public Node getrchild() {
		return rchild;
	}

	public void setrchild(Node rchild) {
		this.rchild = rchild;
	}

	public Node(int data) {

		this.data = data;
		lchild = rchild = null;
	}

}
