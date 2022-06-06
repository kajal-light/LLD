package polymorphism;

public class Tester {
    public static void main(String[] args) {

        int [] arr={3,1,6,0,2};
      SortingUtility.sort(arr, new Ascending());
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
