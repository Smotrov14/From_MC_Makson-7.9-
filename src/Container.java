import java.util.ArrayList;

public class Container {
    private Integer count;
    public ArrayList<Character> abc = new ArrayList<Character>();
    public ArrayList<Integer> searchAbc = new ArrayList<>();

    public void addCount(int value) {
        if(count == null){
            count = 0;
        }
      count = count + value;
    }

    public int getCount() {
        return count;
    }

}
