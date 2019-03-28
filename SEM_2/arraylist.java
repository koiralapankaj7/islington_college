import java.util.ArrayList;

class ArrayListPractice {

        // The ArrayList class is a resizable array, which can be found in the java.util
        // package.
        // The difference between a built-in array and an ArrayList in Java, is that the
        // size of an array cannot be modified (if you want to add or remove elements
        // to/from an array, you have to create a new one). While elements can be added
        // and removed from an ArrayList whenever you want. The syntax is also slightly
        // different:

        public static void main(String[] args) {
                new ArrayListPractice().practice();
        }

        void practice() {
                // ArrayList arr = new ArrayList<Integer>();
                // // Add
                // arr.add(1);
                // arr.add(2);
                // arr.add(3);
                // arr.add(4);
                // arr.add(5);
                // arr.add(6);
                // // Access

                // arr.get(2); // =>3

                // for (int i = 0; i < arr.size(); i++) {
                // System.out.println(arr.get(i));
                // }

                ArrayList arr = new ArrayList<Developer>();
                Developer dev1 = new Developer("A", 20, true);
                Developer dev2 = new Developer("B", 21, false);
                Developer dev3 = new Developer("C", 22, true);
                Developer dev4 = new Developer("D", 23, false);
                arr.add(dev1);
                arr.add(dev2);
                arr.add(dev3);
                arr.add(dev4);

                for (int i = 0; i < arr.size(); i++) {
                        //
                        Developer obj = (Developer) arr.get(i);

                        System.out.println(obj.name + " " + obj.age + " " + obj.isStudent);

                }

        }

        void runApp() {

                // Example
                // Create an ArrayList object called cars that will store strings:

                ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
                cars.add("Volvo");
                cars.add("BMW");
                cars.add("Ford");
                cars.add("Mazda");
                System.out.println(cars);

                // To access an element in the ArrayList, use the get() method and refer to the
                // index number:
                cars.get(0);
                // To modify an element, use the set() method and refer to the index number:
                cars.set(0, "Opel");
                // To remove an element, use the remove() method and refer to the index number:
                cars.remove(0);
                // To remove all the elements in the ArrayList, use the clear() method:
                cars.clear();
                // To find out how many elements an ArrayList have, use the size method:
                cars.size();

                // Loop through the elements of an ArrayList with a for loop, and use the size()
                // method to specify how many times the loop should run:
                for (int i = 0; i < cars.size(); i++) {
                        System.out.println(cars.get(i));
                }

                // You can also loop through an ArrayList with the for-each loop:
                for (String i : cars) {
                        System.out.println(i);
                }

                // You can also loop through an ArrayList with the Iterator
                // Iterator itr = cars.iterator();
                // while (itr.hasNext()) {
                // System.out.println(itr.next());
                // }

                // Another useful class in the java.util package is the Collections
                // class, which include the sort() method for sorting lists alphabetically or
                // numerically:
                // Collections.sort(cars); // Sort cars
                // for (String i : cars) {
                // System.out.println(i);
                // }

                // ArrayList arrayList = new ArrayList<Integer>();
                // rangeCheckForAdd error at runtime
                // arrayList.add(10, 20);
                // Object cannot be converted to int
                // String val = arrayList.get(0);
                // System.out.println(arrayList.size());
        }

        void constructorOfArrayList() {
                // Constructors of Java ArrayList
                // Constructor : Description
                // ArrayList() : It is used to build an empty array list.
                // ArrayList(Collection<? extends E> c) : It is used to build an array list that
                // is initialized with the elements of the collection c.
                // ArrayList(int capacity) : It is used to build an array list that has the
                // specified initial capacity.
        }

        void methodsOfArrayList() {
                // Method : Description
                // void add(int index, E element) : It is used to insert the specified element
                // at the specified position in a list.
                // boolean add(E e) : It is used to append the specified element at the end of a
                // list.
                // boolean addAll(Collection<? extends E> c) : It is used to append all of the
                // elements in the specified collection to the end of this list, in the order
                // that they are returned by the specified collection's iterator.
                // boolean addAll(int index, Collection<? extends E> c) : It is used to append
                // all the elements in the specified collection, starting at the specified
                // position of the list.
                // void clear() : It is used to remove all of the elements from this list.
                // void ensureCapacity(int requiredCapacity) : It is used to enhance the
                // capacity of an ArrayList instance.
                // E get(int index) : It is used to fetch the element from the particular
                // position of the list.
                // boolean isEmpty() : It returns true if the list is empty, otherwise false.
                // int lastIndexOf(Object o) : It is used to return the index in this list of
                // the last occurrence of the specified element, or -1 if the list does not
                // contain this element.
                // Object[] toArray() : It is used to return an array containing all of the
                // elements in this list in the correct order.
                // <T> T[] toArray(T[] a) : It is used to return an array containing all of the
                // elements in this list in the correct order.
                // Object clone() : It is used to return a shallow copy of an ArrayList.
                // boolean contains(Object o) : It returns true if the list contains the
                // specified element
                // int indexOf(Object o) : It is used to return the index in this list of the
                // first occurrence of the specified element, or -1 if the List does not contain
                // this element.
                // E remove(int index) : It is used to remove the element present at the
                // specified position in the list.
                // boolean remove(Object o) : It is used to remove the first occurrence of the
                // specified element.
                // boolean removeAll(Collection<?> c) : It is used to remove all the elements
                // from the list.
                // boolean removeIf(Predicate<? super E> filter) : It is used to remove all the
                // elements from the list that satisfies the given predicate.
                // protected void removeRange(int fromIndex, int toIndex) : It is used to remove
                // all the elements lies within the given range.
                // void replaceAll(UnaryOperator<E> operator) : It is used to replace all the
                // elements from the list with the specified element.
                // void retainAll(Collection<?> c) : It is used to retain all the elements in
                // the list that are present in the specified collection.
                // E set(int index, E element) : It is used to replace the specified element in
                // the list, present at the specified position.
                // void sort(Comparator<? super E> c) : It is used to sort the elements of the
                // list on the basis of specified comparator.
                // Spliterator<E> spliterator() : It is used to create spliterator over the
                // elements in a list.
                // List<E> subList(int fromIndex, int toIndex) : It is used to fetch all the
                // elements lies within the given range.
                // int size() : It is used to return the number of elements present in the list.
                // void trimToSize() : It is used to trim the capacity of this ArrayList
                // instance to be the list's current size.
        }
}

class Developer {
        String name;
        int age;
        boolean isStudent;

        Developer(String name, int age, boolean isStudent) {
                this.name = name;
                this.age = age;
                this.isStudent = isStudent;
        }

        // getter
        // setter
}
