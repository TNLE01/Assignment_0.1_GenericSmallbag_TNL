/**
 * @author Truong Le
 *
 */
public class Item<T> {
	
	private T e;
	
	/**
	 * Return e
	 * @return e
	 */
	public T getE() {
		return e;
	}
	
	/**
	 * Set value for e
	 * @param e new e value
	 */
	public void setE(T e) {
		this.e = e;
	}
	
	/**
	 * Return a string representation of Item
	 * @return a string representation of Item
	 */
	public String toString() {
		String result = e.toString();
		return result;
	}
}
