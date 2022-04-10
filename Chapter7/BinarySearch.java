public class BinarySearch {
    /**Use binary search to find the key in the list */
    public static int BinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length;
        int mid;
        while(high>=low){
            mid = (low + high) / 2;
            if(key == list[mid]){
                return mid;
            } else if(key > list[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -low-1;
    }

    public static void main(String[] args) {
        int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        System.out.println(BinarySearch(list, 2));
        System.out.println(BinarySearch(list, 11));
        System.out.println(BinarySearch(list, 12));
        System.out.println(BinarySearch(list, 1));
        System.out.println(BinarySearch(list, 3));
    }
}
