/**
 * @author Truong Le
 *
 */
public class SmallBag<T> {
	
	T item;
	
	/**
	 * Return item
	 * @return item
	 */
	public T getItem() {
		return item;
	}
	
	/**
	 * Set value for item
	 * @param item new item value
	 */
	public void setItem(T item) {
		this.item = item;
	}
	
	/**
	 * Return a string representation of item in the SmallBag
	 * @return a string representation of item in the SmallBag
	 */
	public String toString() {
		String result = item.toString();
		return result;
	}
}
