package corejava_labpractice;

public class Test2 {
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("gc called");
	    }

	    public static void main(String[] args) {
	        Test2 t = new Test2();
	        t = null;              // Make object eligible for GC
	        System.out.println(t);
	        System.gc();           // Request garbage collection
	    }
	}
