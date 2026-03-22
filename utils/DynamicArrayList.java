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
        for(int i =0;i<count;i++){
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
        public void add(String object){
        ensureCapacity();
        data[count] = object;
        count++;
        }
    public void add(String object, int position){
        if(position<0||position>count){
            throw new IndexOutOfBoundsException("Invaild position:"+position);
        }
        ensureCapacity();
        for(int i =count;i>position;i--){
            data[i] = data[i-1];
        }
        data[position] = object;
        count++;
    }
    public String set(String object,int position){
        if(position<0||position>=count){
            throw new IndexOutOfBoundsException("Invalid position:"+position);
        }
        if(object ==null){
            throw new IllegalArgumentException("Object cant be null");
        }
        String oldValue = data[position];
        data[position] = object;
        return oldValue;
    }
    public String remove(int position){
        if(position<0||position>=count){
            throw new IndexOutOfBoundsException("Invalid position1:"+position);
        }
        String object = data[position];
        for(int i =position;i<count-1;i++){
            data[i] = data[i+1];
        }
        data[count-1]= null;
        count--;
        return object;
    }
    public boolean contains(String object){
        if(object==null){
            throw new IllegalArgumentException("object cannot be null");
        }
        for(int i=0;i<count;i++){
            if(data[i].equalsIgnoreCase(object)){
                return true;
            }
        }
        return false;
    }
    public void clear(){
    data = new String[data.length];
    count=0;
    }
    public boolean isEmpty(){
        if(count==0){
            return true;
        }
        return false;
    }
}

