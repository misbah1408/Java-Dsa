import java.util.ArrayList;

public  class Basics{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Operations
        //Add O(1)
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(1,20); // O(n)
        System.out.println("ArrayList: " + list);
        // Get O(1)
        int element = list.get(1);
        System.out.println("Element at index 1: " + element);
        // Set O(n)
        list.set(1, 40);
        System.out.println("ArrayList after set: " + list);
        // Remove O(n)
        list.remove(1);
        System.out.println("ArrayList after remove: " + list);
        // Contains O(n)
        System.out.println(list.contains(40));
        System.out.println(list.contains(50));


        // Size(length)
        System.out.println("Size of ArrayList: " + list.size());

        // 2D
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        mainList.add(list1);
        mainList.add(list2);
        System.out.println(mainList);
    }
}