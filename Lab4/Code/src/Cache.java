public class Cache {
	private static int MAX_CAPACITY = 0;
	
	static {
		System.out.print("Enter Max Capacity: ");
		MAX_CAPACITY = Console.readInt();
	}

	static int getMaxCapacity() {
		System.out.println("Returning MAX_CAPACITY");
		return MAX_CAPACITY;
	}
}