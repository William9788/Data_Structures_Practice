public class DynamicArrayList {
    private int count;
    private String [] data;
    public DynamicArrayList(){
        data = new String[10];
        count=0;
    }
    public DynamicArrayList(int initialSize){
        data = new String[initialSize];
        count=0;
    }
    public int size(){
        return count;
    }
}
