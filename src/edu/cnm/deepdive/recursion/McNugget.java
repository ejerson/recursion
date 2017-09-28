package edu.cnm.deepdive.recursion;

public class McNugget {
  
  // making this a constant makes it so I can't change the PACK_SIZES in the heap
  private static final int[] PACK_SIZES = {20, 9, 6};
  
  public static boolean test(int n) {
    if (n < 0) {
      return false;
    } 
    
    if (n == 0) { 
      return true;
    }
    
    return test(n, PACK_SIZES, 0); 
    
  }
  
  
  private static boolean test(int n, int[] packSizes, int offset) {  
    // n = value of n, packSize = PACK_SIZES, offset???
    if (n < 0) {
      return false;
    }
    
    if (n == 0) {
      return true;
    }
    
    boolean trial = false;
    for (int i = offset; i < packSizes.length; i++) {
        // this invokes the method
        trial = test(n - packSizes[i], packSizes, i);
        // if trial is true, break out of this for loop
        if(trial) {
          break;
        }
    }
    return trial;
  }
  
  public static void main(String[] args) {
    int[] packSizes = {5, 7, 13, 15};
    int[] packSizes;
//    packSizes = new {5, 7, 13, 15};
    
    
    System.out.println(test(95, new int[] {15, 13, 7, 5}, 0));
    
  }
}


