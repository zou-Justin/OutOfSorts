public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i = 0; i < data.length;i++){
      for (int j = 0; j < data.length-1;j++){
        if (data[j] > data[j+1]){
          int a = data[j+1];
          data[j+1] = data[j];
          data[j] = a;
        }
      }
    }
  }
  public static void selectionSort(int[] data){
    int minimum = 0;
    for (int i = 0;i < data.length; i++){
      for (int j = i;j < data.length;j++){
        minimum = data[i];
        if (minimum > data[j]){
          minimum = data[j]
        }
      }
      data[i] = minimum;
    }

}


}
