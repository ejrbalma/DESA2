package histogrambranch;

public class CalculaHistogram {
      
    public static <T> Histogram <T> computeHistogram (T[] vector){
        
        Histogram <T> histo = new Histogram<> ();
        for (T key : vector) {
            histo.increment(key);
        }
        return histo;
    }    
}
