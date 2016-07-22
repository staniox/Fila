import java.util.Scanner;

public class ArrayQueue implements Fila {
	
		Integer[] pikachu =new Integer[50];
		int f=0;
		int r=0;
		
	public void enqueue(int n) {
		pikachu[r]=n;
		r+=1;
		
	}

	@Override
	public int dequeue() {
		f+=1;
		return front();
		
	}

	@Override
	public int front () {
		return pikachu[f];
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
		ArrayQueue pokemon = new ArrayQueue();
		Scanner in =new Scanner(System.in);
		int input=0;
		
		do {
			input=in.nextInt();
			pokemon.enqueue(input);
		} while (input!=-1);
		
		int size = pokemon.size()/2;
		
		for (int i = 0; i <size; i++) {
			pokemon.dequeue();
		}
		
		
	}

	

	

}
