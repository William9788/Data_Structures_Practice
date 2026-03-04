package utils;
public class ShoppingList {
/**
 * This arraylist is for store string stuff
 * @param command line not used
*/
    public static void main(String[] args){
        DynamicArrayList list = new DynamicArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Chocolate");
        list.add("Dog");
        list.add("Eggs");
        list.add("Gun");
        list.add("Hat");
        list.add("Jacket");
        list.add("Keyboard");
        list.add("Lime");
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        int position = list.indexOf("Chocolate");
        System.out.println("Chocolate position:"+ position);
    }
}
