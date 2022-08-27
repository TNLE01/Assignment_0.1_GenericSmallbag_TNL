
public class Application {

	public static void main(String[] args) {
		
		Item<String> name = new Item<String>();
		name.setE("Truong Le");
		Item<Integer> number = new Item<Integer>();
		number.setE(19);
		SmallBag<Item> bag = new SmallBag<Item>();
		bag.setItem(name);
		System.out.println(bag.getItem());
		bag.setItem(number);
		System.out.println(bag.getItem());
		
	}

}
