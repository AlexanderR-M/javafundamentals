package datastructure;

public class FlexibleArrayTest {
    static void main(String[] args) {
        FlexibleArray<Integer> flexibleArray =
                new FlexibleArray<>();
        System.out.println("the current size = " + flexibleArray.size());
        flexibleArray.add(3);
        flexibleArray.remove(4);

    }
}
