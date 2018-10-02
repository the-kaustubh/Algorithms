import java.util.*;

public class LinearSearch {
  private int size;
  private int arr[];
  LinearSearch(int size, int [] inarr) {
    this.size = size;
    this.arr = new int[size];
    initializeArray(inarr);
  }

  int search(int key) {
    for(int i = 0; i < this.size; i++) {
      if (this.arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  void initializeArray(int [] arr) {
    this.arr = arr;
  }

  int getSize() {
    return this.size;
  }

  public static void main(String a[]) {
    int key, arr[], size;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    size = sc.nextInt();
    arr = new int[size];
    System.out.println("Enter the array.");
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter key to Search");
    key = sc.nextInt();
    LinearSearch ls = new LinearSearch(size, arr);
    int pos = ls.search(key);
    if(pos < 0) {
      System.out.println("Your key (" + key + ") was not found in the array.");
    }
    else {
      System.out.println("Your key (" + key + ") was found at position (" + pos + ") in the array.");
    }
  }
}
