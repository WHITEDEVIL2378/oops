class Item{
	private String name;
	private int price;
	private int quantity;
	
	Item()
	{
	}
	public Item(String name,int price,int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}
	public int getQuantity(){
		return quantity;
	}
	
	public void displayItems(){
		System.out.println("Name " + name);
		System.out.println("Price " + price);
		System.out.println("Quantity " + quantity);
	}
}
class ShoppingCart extends Item{
	private Item[] items;
	private int totalCount;
	public ShoppingCart(){
		items = new Item [10];
	}
	public void addItems(Item item){
		if(totalCount == items.length){
			System.out.println("No more items can be added");
		}
		 items[totalCount++] = item;
	}	
	public void removeItems(Item m){
		for(int i=0;i<totalCount;i++){
			if(items[i].equals(m)){
				while(i<totalCount-1){
					items[i] = items[i+1];
					i++;
					}
				}
			}
		items[totalCount-1] = null;
		totalCount--;
		for(int i=0;i<totalCount;i++){
			items[i].displayItems();
		}
	}
}
class SuperMarket{
	public static void main(String args[])
	{
		ShoppingCart Shoppingcart = new ShoppingCart();
		Item r = new Item("Dove",35,3);
		Item u = new Item("CoffeePowder",85,2);
		Shoppingcart.addItems(r);
		Shoppingcart.addItems(u);
		
		r.displayItems();
		u.displayItems();
		
		System.out.println();
		
		//Shoppingcart.removeItems(u);
		
		//Shoppingcart.displayItems();
	}
}
