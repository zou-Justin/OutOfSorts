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
    for (int i = 0; i < data.length; i++){
      minimum = data[i];
      for (int j = i; j < data.length;j++){
        if (data[j] < minimum){
          int temp = data[j];
          data[j] = minimum;
          minimum = temp;
        }
      }
      data[i] = minimum;
    }
  }
  public static void insertionSort(int[] data){
    int index = 0;
    for (int i = 0;i < data.length;i++){
      int temp = data[i];
       index = i - 1;
       while (index >= 0 && data[index] > temp ){
        data[index+1] = data[index];
        index--;
      }
        data[index+1] = temp;
    }
  }
}
