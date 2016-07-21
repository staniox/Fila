import java.util.Scanner;

public class ArrayQueue implements Fila {
	Scanner input =new Scanner(System.in);
		Integer[] pikachu =new Integer[50];
		int f=0;
		int r=0;
		
	public void enqueue() {
		pikachu[r]=input.nextInt();
		r+=1;
		
	}

	@Override
	public void dequeue() {
		f=front();
		
	}

	@Override
	public int front () {
		return ++f;
	}

	@Override
	public int size() {
		
		return r-f;
	}

	@Override
	public boolean isEmpty() {
		if (r==f) {
			return true;
		}
		else
		return false;
	}
	public static void main(String[] args) {
		
		
	}

}
