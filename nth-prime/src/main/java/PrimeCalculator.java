import java.util.ArrayList;
import java.util.Arrays;

class PrimeCalculator {

    private int maxNumbers;
    private boolean[] isPrime;
    private ArrayList<Integer> primeNumbers;

    public PrimeCalculator() {
        this.maxNumbers = (int)1e7;
        this.isPrime = new boolean[maxNumbers];
        this.primeNumbers = new ArrayList<>();
        Arrays.fill(this.isPrime, 2, isPrime.length-1, true);
        sieveOfErasthenos();
    }

    int nth(int nth) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (nth==0)
            throw new IllegalArgumentException();
        return primeNumbers.get(nth-1);
    }

    private void sieveOfErasthenos() {
        for (int number = 0; number < maxNumbers; number++) {
            if(isPrime[number]) {
                for (int multiple = number*2; multiple < maxNumbers; multiple+=number) {
                    isPrime[multiple] = false;
                }
            }
        }

        for (int number = 2; number < maxNumbers; number++) {
            if(isPrime[number]) {
                primeNumbers.add(number);
            }
        }
    }

}
