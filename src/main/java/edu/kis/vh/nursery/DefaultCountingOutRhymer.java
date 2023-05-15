package edu.kis.vh.nursery;

/**
 * Used to create an instance of a counting out rhymer
 * Class fields are an array of integers called numbers and an integer variable called total
 * Capacity of the array is set as 12
 * Default value of the variable total is set as -1
 * 
 */
public class DefaultCountingOutRhymer {

    public static final int INT = -1;
    public static final int INT1 = 12;
    private final int[] NUMBERS = new int[INT1];

    private int total = INT;

    /**
     * Shows many numbers are stored in the array
     * 
     * @return total	the amount of numbers stored currently in the array
     */
    public int getTotal() {
		return total;
	}

	/**
	 * Checks whether the array is full
	 * If not the method increments the variable total
	 * then adds number passed as an argument to the array 
	 * 
	 * @param in	number to be added to the array
	 */
	public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Checks whether the array is empty
     * 
     * @return		true if variable total equals -1, false otherwise 
     */
    public boolean callCheck() {
        return total == INT;
    }

    /**
     * Checks whether the current size of an array equals its capacity
     * 
     * @return		true if variable total equals 11, false otherwise
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Returns the value at current index in the array
     * If the array is empty it returns value -1
     * 
     * @return		-1 if array is empty, value at index equal variable total otherwise 
     */
    protected int peekaboo() {
        if (callCheck())
            return INT;
        return NUMBERS[total];
    }

    /**
     * Returns the value at current index in the array
     * Then decrements variable total
     * If the array is empty it returns value -1
     * 
     * @return		-1 if array is empty, value at index equal variable total otherwise
     */
    public int countOut() {
        if (callCheck())
            return INT;
        return NUMBERS[total--];
    }

}
