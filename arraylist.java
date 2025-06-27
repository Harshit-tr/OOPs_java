
import java.util.Arrays;

public class arraylist{
    public static class Arraylist{
        int[] arr = new int[2];
        int size;
        public void add(int ele){
            if(size==arr.length){
                int[] brr = Arrays.copyOf(arr , arr.length*2);
                arr = new int[brr.length];
                arr = Arrays.copyOf(brr, brr.length);
            }
            arr[size] = ele;
            size++;
        }
    }
    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(1);

        System.out.println(arr.size);
        arr.add(4);
          System.out.println(arr.size);
    }
}