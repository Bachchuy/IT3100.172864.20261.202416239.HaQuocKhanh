public class Cart{
	public static final int MAX_NUMBER_ORDERED =20;
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered=0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered>= MAX_NUMBER_ORDERED) {
			System.out.println("The cart is almost full. Cannot add more discs.");
			return;
		}
		itemsOrdered[qtyOrdered]=disc;
		qtyOrdered++;
		System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int foundIndex=-1;
		for(int i=0; i<qtyOrdered;i++) {
			if(itemsOrdered[i]==disc || itemsOrdered[i].getTitle().equals(disc.getTitle())) {
				foundIndex=i;
				break;
			}
		}
		if(foundIndex==-1) {
			return;
		}
		for(int i=foundIndex;i<qtyOrdered-1;i++) {
			itemsOrdered[i]=itemsOrdered[i+1];
		}
		itemsOrdered[qtyOrdered-1]=null;
		qtyOrdered--;
		System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
	}
	public float totalCost() {
		float total=0.0f;
		for (int i=0;i<qtyOrdered;i++) {
			total+=itemsOrdered[i].getCost();
		}
		return total;
	}
	public void printCart() {
		for(int i=0;i<qtyOrdered;i++) {
			System.out.printf("%d. %s - %.2f\n",i+1, itemsOrdered[i].getTitle(),itemsOrdered[i].getCost());
		}
		System.out.printf("Total Cost is: \n%.2f\n", totalCost());
	}
}
