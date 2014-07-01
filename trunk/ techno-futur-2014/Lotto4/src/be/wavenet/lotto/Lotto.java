package be.wavenet.lotto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Lotto implements Serializable {
	private static final long serialVersionUID = -1335572423561034170L;
	private static final int MAX = 42;
	private static final int SIZE = 6;
	private ArrayList<Integer> result = new ArrayList<Integer>();
  
	public ArrayList<Integer> getResult() {
		return this.result;
	}

	public void draw() {
		this.draw(Lotto.MAX, Lotto.SIZE);
	}
	
	public void draw(int max, int size) {
		boolean numbers[] = new boolean[max];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			while (true) {
				int number = random.nextInt(max);
				if (!numbers[number]) {
					numbers[number] = true;
					break;
				}
			}
		}
		for (int i = 0; i < max; i++) {
			if (numbers[i])
				this.result.add(i + 1);
			if (this.result.size() == size)
				break;
		}
	}

	public int getWinningCount(ArrayList<Integer> numbers) {
		return this.getWinningNumbers(numbers).size();
	}

	public ArrayList<Integer> getWinningNumbers(ArrayList<Integer> numbers) {
		ArrayList<Integer> r = new ArrayList<Integer>();
		for (int i = 0; i < this.result.size(); i++) {
			Integer number = this.result.get(i);
			if (i == numbers.size())
				break;
			if (number.equals(numbers.get(i)))
				r.add(number);
		}
		return r;
	}
}
