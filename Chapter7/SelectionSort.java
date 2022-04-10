import java.util.Arrays;
public class SelectionSort {
    /**The method for sorting the numbers */
    public static void SelectionSort(double[] list) {
        double currentMin;
        int currentMinIndex;
        for(int i=0;i<list.length-1;i++){
            currentMin = list[i];
            currentMinIndex = i;
            for(int j=i;j<list.length;j++){
                if(list[j] < currentMin){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;        
            }
        }
    }    

    public static void main(String[] args) {
        double[] list = {1,9,4.5,6.6,5.7,-4.5};
        SelectionSort(list);
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
        System.out.println(Arrays.toString(list));
    }
}
