package histogrambranch;

import java.util.HashMap;

public class HistogramBranch {

    public static void main(String[] args) {

         
         //Integer [] vector = {1, 3, 5, 7, 9, 1, 5, 4, 3, 9,100,-4};
         String[] vector = {"Ana", "Juan", "Elena", "Elena", "Juan", "Ana", "Pedro"};
        
         Histogram <String> histogram = CalculaHistogram.computeHistogram(vector);
        
        for (String key : histogram.keySet()) {
            System.out.println(key + " --> " + histogram.get(key));
        }
    
    
    }
    
}
