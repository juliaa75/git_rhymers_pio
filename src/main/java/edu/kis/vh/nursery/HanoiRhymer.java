package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

<<<<<<< HEAD
	int totalRejected = 0;
=======
    int totalRejected = 0;
>>>>>>> origin/format

	public int reportRejected() {
		return totalRejected;
	}

<<<<<<< HEAD
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
=======
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
>>>>>>> origin/format
}
