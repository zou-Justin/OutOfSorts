import java.util.Random;
import java.util.Arrays;
public class Tester{
  public static void main(String[]args){

    //here no seed is provided, so it uses the clock as a seed
    //this can be used to produce a random seed for a different Random object!
    Random rng = new Random();
    // for(int i =  0; i < 5; i++ ){
    //   System.out.println(rng.nextInt() % 1000);
    // }
    // System.out.println();
    int[] data = new int[10];
    //specified seed can be used to reproduce sequences
//seed of 100 is stored.
    for(int i =  0; i < data.length; i++ ){
      data[i] = rng.nextInt() % 1000;
    }
    Sorts.bubbleSort(data);
    System.out.println(Arrays.toString(data));
  }
}
