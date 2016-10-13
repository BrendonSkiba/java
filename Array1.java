//Created by Brendon S
import java.util.Arrays;
class Array1 {//Creates the Class file Array1
  public static void main (String a[]){
    int i;  //integer i is the number
    int[] ia ; ia = new int[20]; //Lists the items in the Array
     //Create the array
      ia[0] = 7;
      ia[1] = -7;
      ia[2] = 4;
      ia[3] = -4;
      ia[4] = -2;
      ia[5] = -1;
      ia[6] = 2;
      ia[7] = -6;
      ia[8] = -3;
      ia[9] = 1;
      ia[10] = -5;
      ia[11] = -9;
      ia[12] = -9;
      ia[13] = -10;
      ia[14] = 5;
      ia[15] = 3;
      ia[16] = 6;
      ia[17] = 8;
      ia[18] = 0;
      ia[19] = 9;

      System.out.println("Array unsorted\n");//Array numbers are unsorted
        for (i = 0; i <=19; i++){
          System.out.print(ia[i]+" ");//print the unsorted numbers
        }
      System.out.print("\n Array sorted\n");//Array numbers are sorted
      Arrays.sort(ia);//This sorts the numbers in the Array
      for (i = 0; i<=19; i++){
        System.out.print(ia[i]+" ");//print the sorted numbers
      }
      System.out.println();
   }
}

