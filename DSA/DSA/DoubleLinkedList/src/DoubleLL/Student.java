package DoubleLL;

public class Student {

	private int roll;
	private String name;
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	
	public int getRoll() {
		return this.roll;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Student (int i) {
//		roll=2;
//		name="Ajay";
//	}
	public Student(int x, String r) {
		roll=x;
		name=r;
	}
	public String toString() {
		return "Roll - "+roll+"\nName -"+name;
	}
	
}
                                                                  