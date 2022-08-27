
public class Item<T> {
	
	private T e;
	
	public T getE() {
		return e;
	}
	public void setE(T e) {
		this.e = e;
	}
	
	public String toString() {
		String result = e.toString();
		return result;
	}
}
