package integerarraylist;

import java.util.ArrayList;

/**
 * Fancy ArrayList that stores integers and supports additional operations not included in Java's built-in ArrayList methods.
 */
public class CustomIntegerArrayList {

    // instance variables

    /**
     * Internal ArrayList of elements.
     */
    private ArrayList<Integer> arr;


    // constructors

    /**
     * Creates a new empty CustomIntegerArrayList.
     */
    public CustomIntegerArrayList() {
        this.arr = new ArrayList<Integer>();
    }

    /**
     * Creates a new CustomIntegerArrayList with the elements in the given ArrayList.
     *
     * @param arr with elements for the CustomIntegerArrayList
     */
    public CustomIntegerArrayList(ArrayList<Integer> arr) {
        this.arr = new ArrayList<Integer>(arr);
    }

    // methods

    public static void main(String args[]) {

        //create new empty CustomIntegerArrayList
        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();

        //add element
        arr1.add(2);

        //get internal arraylist of elements
        System.out.println(arr1.getArrayList()); // [2]

        //add element
        arr1.add(0, 5);

        //get internal arraylist of elements
        System.out.println(arr1.getArrayList()); // [5, 2]

        //remove element
        arr1.remove(2, 2);

        //get internal arraylist of elements
        System.out.println(arr1.getArrayList()); // [5]

        //add more elements
        arr1.add(6);
        arr1.add(2);
        arr1.add(7); // [3, 6, 2, 7]

        //splice 2 elements at index 0
        arr1.splice(0, 2);

        //get internal arraylist of elements
        System.out.println(arr1.getArrayList()); // [2, 7]

        //splice 1 element at index 0 and add [4, 5]
        arr1.splice(0, 1, new int[]{4, 5});

        //get internal arraylist of elements
        System.out.println(arr1.getArrayList()); // [4, 5, 7]

        //create new CustomIntegerArrayList with the elements in the given ArrayList
        ArrayList<Integer> arr2Elements = new ArrayList<Integer>();
        arr2Elements.add(5);
        arr2Elements.add(15);
        arr2Elements.add(27);

        CustomIntegerArrayList arr2 = new CustomIntegerArrayList(arr2Elements);

        //get internal arraylist of elements
        System.out.println(arr2.getArrayList()); // [5, 15, 27]
    }

    /**
     * Returns the internal ArrayList of elements.
     * <p>
     * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 5, 5, 2
     * - Calling getArrayList() would return the internal ArrayList containing the integers: 5, 5, 2
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 100, 200, 500
     * - Calling getArrayList() would return the internal ArrayList containing the integers: 100, 200, 500
     *
     * @return internal ArrayList arr
     */
    public ArrayList<Integer> getArrayList() {
        // TODO Implement method
        return arr;
    }

    /**
     * Returns the element at the specified index from the internal ArrayList of elements.
     * <p>
     * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 5, 5, 2
     * - Calling get(0) would return 5
     * - Calling get(1) would return 5
     * - Calling get(2) would return 2
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 100, 200, 500
     * - Calling get(0) would return 100
     * - Calling get(1) would return 200
     * - Calling get(2) would return 500
     *
     * @param index of the item to get
     * @return element at specified index
     */
    public int get(int index) {
        // TODO Implement method
        if (index >= arr.size() || index < 0) return -1;
        return arr.get(index);
    }

    /**
     * Appends the given element to the end of the internal ArrayList of elements.
     * <p>
     * Example(s):
     * - For a defined empty CustomIntegerArrayList
     * - Calling add(21) would add the element 21 to the internal ArrayList at index 0
     * - Then, calling get(0) would return 21
     * - Calling add(44) would add the element 44 to the internal ArrayList at index 1
     * - Then, calling get(1) would return 44
     * - Calling add(67) would add the element 67 to the internal ArrayList at index 2
     * - Then, calling get(2) would return 67
     *
     * @param element to append
     */
    public void add(int element) {
        arr.add(element);
    }

    /**
     * Inserts the given element at the specified index.
     * <p>
     * Example(s):
     * - For a new defined empty CustomIntegerArrayList
     * - Calling add(0, 2) would add the element 2 to the internal ArrayList at index 0
     * - Then, calling get(0) would return 2
     * - Calling add(1, 3) would add the element 3 to the internal ArrayList at index 1
     * - Then, calling get(1) would return 3
     * - Calling add(2, 4) would add the element 4 to the internal ArrayList at index 2
     * - Then, calling get(2) would return 4
     * <p>
     * - For a new defined empty CustomIntegerArrayList
     * - Calling add(0, 100) would add the element 100 to the internal ArrayList at index 0
     * - Then, calling get(0) would return 100
     * - Calling add(1, 200) would add the element 200 to the internal ArrayList at index 1
     * - Then, calling get(1) would return 200
     * - Calling add(1, 500) would add the element 500 to the internal ArrayList at index 1
     * - Then, calling get(1) would return 500
     * - And calling get(2) would return 200
     *
     * @param index   at which to insert the given element
     * @param element to insert
     */
    public void add(int index, int element) {
        // TODO Implement method
        if (index > arr.size() || index < 0) return;
        arr.add(index, element);
    }

    /**
     * Removes the element at the specified index.
     * <p>
     * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 4, 3, 2
     * - Calling remove(0) would remove the element 4 at index 0 from the internal ArrayList
     * - The CustomIntegerArrayList will then contain the integers: 3, 2
     * - Calling remove(1) would remove the element 2 at index 1 from the internal ArrayList
     * - The CustomIntegerArrayList will then contain the integers: 3
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 100, 500, 200
     * - Calling remove(0) would remove the element 100 at index 0 from the internal ArrayList
     * - The CustomIntegerArrayList will then contain the integers: 500, 200
     * - Calling remove(0) would remove the element 500 at index 0 from the internal ArrayList
     * - The CustomIntegerArrayList will then contain the integers: 200
     * - Calling remove(0) would remove the element 200 at index 0 from the internal ArrayList
     * - The CustomIntegerArrayList will then be empty
     *
     * @param index at which to remove the element
     * @return the removed element
     */
    public int remove(int index) {
        // TODO Implement method
        if ( !(index==0 && arr.isEmpty()) && (index >= arr.size() || index < 0) ) return -1;
        arr.remove(index);
        return 0;
    }

    /**
     * Removes the specified number (num) of the given element from the internal ArrayList of elements.
     * If num <= 0, don't remove anything.
     * If num is too large, remove all instances of the given element from the internal ArrayList of elements.
     * <p>
     * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 1, 2, 1
     * - Calling remove(2, 1) would remove the first 2 instances of 1
     * - The CustomIntegerArrayList will then contain the integers: 2, 2, 1
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 100, 100, 100
     * - Calling remove(4, 100) would remove all instances of 100
     * - The CustomIntegerArrayList will then be empty
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 5, 5, 5, 5, 5
     * - Calling remove(0, 5) would remove nothing
     *
     * @param num     number of instances of element to remove
     * @param element to remove
     */
    public void remove(int num, int element) {
        if (num <= 0) return;

        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer current : arr) {
            if (current != element || num <= 0) {
                newList.add(current);
            } else {
                num--;
            }
        }
        arr = newList;
    }



    /**
     * Removes the specified number (num) of elements from the internal ArrayList of elements, starting at the given index.
     * If index < 0, don't remove anything and return an empty ArrayList.
     * If index is too large (>= to the size of this CustomIntegerArrayList), don't remove anything and return an empty ArrayList.
     * if num == 0, don't remove anything and return an empty ArrayList.
     * <p>
     * If the number of elements after the given index is less than the given num,
     * just remove the rest of the elements in the internal ArrayList.
     * <p>
     * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 3, 4, 5
     * - Calling splice(1, 2) would remove 2 and 3 (the 2nd and 3rd items)
     * - The CustomIntegerArrayList will then contain the integers: 1, 4, 5
     * and this method would return a new ArrayList containing the removed elements: 2 and 3
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 3, 4, 5
     * - In a call to splice(3, 4), the number of elements after the given index 3 is less than the given num 4
     * - This would remove 4 and 5 (the 4th and 5th items)
     * - The CustomIntegerArrayList will then contain the integers: 1, 2, 3
     * and this method would return a new ArrayList containing the removed elements: 4 and 5
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 100, 200, 500
     * - Calling splice(1, 0) would remove nothing
     * and this method would return a new empty ArrayList
     *
     * @param index to start on
     * @param num   of items to remove
     * @return ArrayList of removed elements
     */
    public ArrayList<Integer> splice(int index, int num) {
        // TODO Implement method
        ArrayList<Integer> removedElements = new ArrayList<>();
        if (index < 0 || index >= arr.size() || num <= 0) {
            return removedElements;
        }


        num = Math.min(num, arr.size() - index);


        for (int i = 0; i < num; i++) {
            removedElements.add(arr.remove(index));
        }

        return removedElements;
    }

    /**
     * Removes the specified number (num) of elements from the internal ArrayList of elements,
     * starting at the given index, and inserts the elements in the given otherArray at the given index.
     * <p>
     * Uses the splice(int index, int num) method.
     * <p>
     * If index < 0, don't remove anything or insert anything, and return an empty ArrayList.
     * If index is too large (>= to the size of this CustomIntegerArrayList), don't remove anything or insert anything,
     * and return an empty ArrayList.
     * if num == 0, don't remove anything or insert anything, and return an empty ArrayList.
     * <p>
     * If the number of elements after the given index is less than the given num,
     * just remove the rest of the elements in the internal ArrayList.
     * <p>
     * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 3, 4, 5
     * - Calling splice(1, 2, [6, 7]) would remove 2 and 3 (the 2nd and 3rd items),
     * and insert 6 and 7 at index 1.
     * - The CustomIntegerArrayList will then contain the integers: 1, 6, 7, 4, 5
     * and this method would return a new ArrayList containing the removed elements: 2 and 3
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 3, 4, 5
     * - In a call to splice(3, 4, [1000, 1001]), the number of elements after the given index 3 is less than the given num 4
     * - This would remove 4 and 5 (the 4th and 5th items) and insert 1000 and 1001 at index 3.
     * - The CustomIntegerArrayList will then contain the integers: 1, 2, 3, 1000, 1001
     * and this method would return a new ArrayList containing the removed elements: 4 and 5
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 100, 200, 500
     * - Calling splice(1, 0, [700]) would remove nothing and insert nothing
     * and this method would return a new empty ArrayList
     * <p>
     * - For a defined CustomIntegerArrayList containing the integers: 5, 2, 7, 3, 7, 8
     * - Calling splice(6, 3, [9]) would remove nothing and insert nothing
     * and this method would return a new empty ArrayList
     *
     * @param index      at which to remove and add the elements
     * @param num        of elements to remove
     * @param otherArray of elements to add
     * @return ArrayList of removed elements
     */
    public ArrayList<Integer> splice(int index, int num, int[] otherArray) {
        // TODO Implement method
        ArrayList<Integer> removedElements = splice(index, num);

        if (!removedElements.isEmpty()) {

            for (int i = 0; i < otherArray.length; i++) {
                arr.add(index + i, otherArray[i]);
            }
        }

        return removedElements;
    }
}