
public class SmallBag<T> {
	T item;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	
	public String toString() {
		String result = item.toString();
		return result;
	}
}
