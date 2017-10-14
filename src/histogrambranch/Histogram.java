package histogrambranch;

import java.util.HashMap;

public class Histogram {

    private final int[] miVector;

    public int[] getMivector() {
        return miVector;
    }

    public Histogram(int[] mivector) {
        this.miVector = mivector;
    }

    public HashMap<Integer, Integer> getHisto() {

        HashMap<Integer, Integer> histo = new HashMap<>();

        for (Integer value : miVector) {
            if (!histo.containsKey(value)) {
                histo.put(value, 0);
            }
            histo.put(value, histo.get(value) + 1);
        }
        return histo;
    }

}
