package problem03;

public class MyStack {
	
	private String[] buffer;
	public static int i=0;
	public static int check=0;

	public MyStack( int size ) {
		check=size;
		buffer= new String[size];
		i=0;
	}
	
	public void push(String item) {
		if(i>=check) {
			size();
		}
		buffer[i]=item;
		i++;
	}

	public String pop() {
		String value="";
		if(i<check) {
		value=buffer[i];
		i--;}
		return value;
	}

	public boolean isEmpty() {
		if(i<0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		String[] resize=new String[check+1];
		
		for(int k=0; k<buffer.length; k++) {
			resize[k]=buffer[k];
		}
		buffer=new String[check+1];
		buffer=resize;
		
		return check=check+1;
	}
}