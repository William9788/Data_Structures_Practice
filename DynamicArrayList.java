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
    public String get(int position){
    if(position<0||position>=count){
        throw new IndexOutOfBoundsException("Invalid position: "+position);
    }
    return data[position];
}
}
