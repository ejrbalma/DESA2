package histogrambranch;

import java.util.HashMap;

public class HistogramBranch {

    public static void main(String[] args) {

         
        int[] vector = {1, 3, 5, 7, 9, 1, 5, 4, 3, 9,100,-4};
        
        Histogram mihisto = new Histogram(vector);
        HashMap<Integer, Integer> histogram = mihisto.getHisto();
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " --> " + histogram.get(key));
        }
    
    
    }
    
}
