package pertemuan8;

public class QueueMainLat4 {

	public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();
    // Before enqueue 3x
    System.out.println("### Before enqueue 3x ###");
    System.out.println("size: " + queue.size());
    System.out.println("isEmpty: " + queue.isEmpty());
    
    System.out.println();

    // Enqueue 3x
    System.out.println("### Enqueue 3x ###");
    queue.enqueue(3);
    queue.enqueue(7);
    queue.enqueue(6);
    System.out.println("size: " + queue.size());
    System.out.println("isEmpty: " + queue.isEmpty());
    System.out.println("front: " + queue.front());
    System.out.println();

	}
}
