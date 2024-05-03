import java.util.ArrayList;

public class Sequence{
    private ArrayList<Integer> values;
    public Sequence(){
        values = new ArrayList<Integer>();
    }
    public void add(int n){
        values.add(n);
    }
    public String toString(){
        return values.toString();
    }
    /* The following method iterates over sequence a and sequence b, and copies it
     into sequence c in alternating order. It does this by determining the maximum size
     between the two arraylist and iterates over the two arrays, until the maximum index
     reached. It then checks both arrays to determines if we are going to go out of range.*/
    public Sequence merge(Sequence other){
        Sequence seqc = new Sequence();

        int size = Math.max(this.values.size(), other.values.size());

        for (int i = 0; i < size; i++) {
            if (i < this.values.size()) {
                seqc.add(this.values.get(i));
            }
            if (i < other.values.size()) {
                seqc.add(other.values.get(i));
            }
        }
        return seqc;
    }
}
