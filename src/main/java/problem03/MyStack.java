package problem03;

public class MyStack {
	
	private String[] buffer;
	public static int i=0;

	public MyStack( int size ) {
		buffer= new String[size];
		i=0;
	}
	
	public void push(String item) {
		buffer[i]=item;
		i++;
	}

	public String pop() {
		String value=buffer[i];
		i--;
		return value;
	}

	public boolean isEmpty() {
		if(i<0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return 0;
	}
}