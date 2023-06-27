import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PythagoreanTriplet {

    private final int i;
    private final int i1;
    private final int i2;

    public PythagoreanTriplet(int i, int i1, int i2) {
        this.i = i;
        this.i1 = i1;
        this.i2 = i2;
    }

    public static PythagoreanTripletBuilder  makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof PythagoreanTriplet) {
            return o.hashCode() == this.hashCode();
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i,i1,i2);
    }

    public static class PythagoreanTripletBuilder {
        List<PythagoreanTriplet> triplets;
        private int limit;
        private int sum;

        PythagoreanTripletBuilder() {
            this.limit = 0;
            this.sum=0;
            this.triplets = new ArrayList<>();
        }
        PythagoreanTripletBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int limit) {
            this.limit = limit;
            return this;
        }

        List<PythagoreanTriplet> build() {

            if(limit==0)
                limit = sum;

            for (int a = 1; a <= limit; ++a) {
                for (int b = a+1; b <= limit; ++b) {
                    int c = sum - (a+b);
                    if(c <= limit && isPythagorean(a, b, c)) {
                        triplets.add(new PythagoreanTriplet(a,b,c));
                    }
                }
            }
            return triplets;
        }

        private static boolean isPythagorean(int a, int b, int c) {
            return (a * a) + (b * b) == (c * c);
        }
    }
}
