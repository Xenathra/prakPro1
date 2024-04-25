package pertemuan9;

public class QueueMain {

	public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

     // Before enqueue 4x
        System.out.println("### Before enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("element queue: ");
        queue.displayElements();
        System.out.println();

        // Enqueue 4x
        System.out.println("### Enqueue 4x ###");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.print("element queue: ");
        queue.displayElements();
        System.out.println("front: " + queue.front());
	}
}
