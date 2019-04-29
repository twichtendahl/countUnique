import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class unique {
	
	public static int countUnique(List<Integer> numbers) {
		Set<Integer> uniqueNumbers = new HashSet<Integer>();
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			uniqueNumbers.add(itr.next());
		}
		return uniqueNumbers.size();
	}
	
	@Test
	void testCountUnique() {
		
		List<Integer> numbers = new ArrayList<Integer>();
		assertEquals(0, countUnique(numbers)); // Tests that the empty list returns 0
		
		// Test using the example in the textbook
		int[] numberArray = {3, 7, 3, -1, 2, 3, 2, 7, 15, 15};
		for (int n : numberArray) {
			numbers.add(n);
		}
		assertEquals(5, countUnique(numbers));
		
		// Make sure it works after the list has changed outside the scope.
		numbers.clear();
		numbers.add(3);
		numbers.add(7);
		assertEquals(2, countUnique(numbers));
	}

}
