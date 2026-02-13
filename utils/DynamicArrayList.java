package utils;
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
    public boolean containing(String target){
        int index = indexOf(target);
        if(index!=-1){
            return true;
        }
        return false;
}

    public int indexOf(String target){
        for(int i =0;i<=count;i++){
            if(data[i].equalsIgnoreCase(target)){
                return i;
        }
    }
        return -1;
        }
        public void ensureCapacity(){
        if(count>data.length){
        String[]newData = new String[data.length*2];
        System.arraycopy(data, 0, newData, 0, count);
        data = newData;
    } 
        }
        
}

