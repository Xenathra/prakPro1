package pertemuan9;

public class TestStrukturStack {

	 public static void main(String[] args) {
	        StrukturStack stack = new StrukturStack(3);

	        // Sebelum push
	        System.out.println("#sebelum push");
	        System.out.println("size : " + stack.size());
	        System.out.println("empty : " + stack.isEmpty());
	        System.out.println("full : " + stack.isFull());
	        System.out.println("top: " + stack.top());
	        System.out.println("elemen from TOP:");

	        // Melakukan push sebanyak 3x
	        System.out.println("#melakukan push 3x:");
	        stack.push(2);	        
	        stack.push(4);
	        stack.push(1);

	        // Setelah push
	        System.out.println("\nsize: " + stack.size());
	        System.out.println("empty: " + stack.isEmpty());
	        System.out.println("full: " + stack.isFull());
	        System.out.println("top: " + stack.top());
	        System.out.print("elemen from TOP : 1 4 2" );
	        
	 }
	 
	
}
