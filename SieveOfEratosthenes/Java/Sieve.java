import java.util.*;

public class Sieve {
  private int size, sieve[], primeCount;
  Sieve(int n) {
    this.size = n;
    sieve = new int[n];
    initializeWithZeros();
    sievify();
  }

  void initializeWithZeros() {
    for(int i = 2; i < this.size; i++) {
      this.sieve[i] = 1;
    }
  }

  void sievify() {
    this.primeCount = this.size - 2; // Neglect 0 and 1

    for(int i = 0; i < Math.sqrt(this.size); i++) {
      if(this.sieve[i] == 1) { 
        for(int j = i*i; j < this.size; j += i) {
          if(this.sieve[j] == 1) {
            this.primeCount--;
          }
          this.sieve[j] = 0;
        }
      }
    }

  }

  int getPrimeCount() {
    return this.primeCount;
  }

  void printPrimes() {
    int counter = 1;
    System.out.println("-------------------");
    for(int i = 0; i < this.size; i++) {
      if(this.sieve[i] == 1) {

        System.out.print(i + " ");

        counter++;

        if(counter % 5 == 0) {
          System.out.println();
        }
      }
    }
    System.out.println("\n-------------------");
  }

  public static void main(String a[])  {
    int size;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the sieve: ");
    size = sc.nextInt();
    sc.close();
    
    Sieve soe = new Sieve(size);
    soe.printPrimes();
    System.out.println("There are " + soe.getPrimeCount() + " prime numbers in the sieve.");
  }
}
