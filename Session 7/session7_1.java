class Dish{

	String name;
	int price;
	int quantity;

	static int totalQuantity;
	static int totalPrice;
	static int numOfDishes;
	
	// static variables can be accessed by property of object :)
	
	Dish(){
		numOfDishes++;
	}
	
	Dish(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		totalQuantity += quantity;
		numOfDishes++;
		totalPrice += (price*quantity);
	}
	
	void showDish() {
		System.out.println("Dish: "+name+" "+price+" "+quantity);
	}
	
	void increment() {
		quantity++;
		totalQuantity++;
		totalPrice += price;
	}
	
	void decrement() {
		quantity--;
		totalQuantity--;
		totalPrice -= price;
	}

	static void showDishData() {
		System.out.println("Number of Dishes: "+numOfDishes);
		System.out.println("Total Quantity: "+totalQuantity);
		System.out.println("Total Price: "+totalPrice);

	}
	
}
public class session7_1 {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish("Noodles", 200, 1);
		Dish dish2 = new Dish("Burger", 100, 1);
		
		
		dish1.increment();
		dish1.increment();
		
		dish2.increment();
		dish2.increment();
		dish2.increment();
		
		dish1.decrement();
		
		dish1.showDish();
		dish2.showDish();
		
		
		Dish.showDishData();
		
	}
}