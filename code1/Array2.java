import java.util.Arrays;
class Array1 {
  public static void main (String a[]){
    int length = iarray.length;
    int i;
    for (i = 0; i < length; i++){
        System.out.print(iarray[i]);
        System.out.print(" . ");
    }
  }
    int[] ia ; ia = new int[21];
    
      ia[0] = -4;
      ia[1] = -8;
      ia[2] = -4;
      ia[3] = -8;
      ia[4] = -4;
      ia[5] = -8;
      ia[6] = -4;
      ia[7] = -8;
      ia[8] = -4;
      ia[9] = -8;
      
      
      System.out.println("Array unsorted\n");
      for (i = 0; i <=11; i++){
          System.out.print(ia[i]+' ");
        }
      System.out.print("\n Array unsorted\n");
      Arrays.sort(ia);
      for (i = 0; i<=11; i++){
        System.out.print(ia[i]+" ");
      }
      System.out.println();
   }
}
