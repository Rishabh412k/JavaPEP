public class session7_2 {
public static void main(String[] args) {
		
		Dish dish1 = new Dish("Noodles", 200, 1);
		Dish dish2 = new Dish("Burger", 100, 1);
		
		Dish dish3 = new Dish("xyz", 300, 1);
		Dish dish4 = new Dish("Fries", 180, 2);
		Dish dish5 = new Dish("Fries", 280, 2);
		
		dish1.increment();
		dish1.increment();
		dish2.increment();
		dish2.increment();
		dish2.increment();
		dish1.decrement();
		dish1.showDish();
		dish2.showDish();		
		Dish.showDishData();

		Dish[] array = {dish1, dish2, dish3, dish4, dish5};
		
		
		
		System.out.println("array is: "+array);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Dishes before sorted:");
		for(int i=0;i<array.length;i++) {
			array[i].showDish();
		}
		
		for(int i = 1 ; i < 5 ; i++)
		{
			Dish x=array[i];
			int j = i-1;
			while(j >= 0 && (array[j].price > x.price))
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=x;
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Dishes after sorted:");
		for(int i=0;i<array.length;i++) {
			array[i].showDish();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}