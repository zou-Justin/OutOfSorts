public class Sorts{
  public static void bubbleSort(int[] data){
    int counter = 0;
    for (int i = 0; i < data.length-1;i++){
      for (int j = 0; j < data.length-i-1;j++){
        if (data[j] > data[j+1]){
          int a = data[j];
          data[j] = data[j+1];
          data[j+1] = a;
          counter++;
        }
      }
      if (counter == 0){
        i = data.length-1;
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
