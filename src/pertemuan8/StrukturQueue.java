package pertemuan8;

public class StrukturQueue {

	 private Node FRONT;
	    private Node REAR;

	    public StrukturQueue() {
	        this.FRONT = null;
	        this.REAR = null;
	    }

	    public boolean isEmpty() {
	        return FRONT == null;
	    }

	    public int size() {
	        int count = 0;
	        Node current = FRONT;
	        while (current != null) {
	            count++;
	            current = current.next;
	        }
	        return count;
	    }

	    public int front() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return FRONT.data;
	    }

	    public void enqueue(int data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            FRONT = REAR = newNode;
	        } else {
	            REAR.next = newNode;
	            REAR = newNode;
	        }
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        int data = FRONT.data;
	        if (FRONT == REAR) {
	            FRONT = REAR = null;
	        } else {
	            FRONT = FRONT.next;
	        }
	        return data;
	    }

	    public void displayElements() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        Node current = FRONT;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

}
