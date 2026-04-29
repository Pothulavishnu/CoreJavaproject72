package corejava_labpractice;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started");
		Class.forName("corejava_labpractice.Student");
		System.out.println("Student class Loaded Successfully");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("main method ended");
	}

}
