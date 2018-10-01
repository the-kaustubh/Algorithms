#include "../include/Sieve.h"

int * Sieve(int n) {
  // Create an array to hold the sieve
  int * sieve = malloc(n*sizeof(int));

  // Initialize the array with all natural numbers
  for (size_t i = 0; i < n; i++) {
    sieve[i] = 1;
  }

  for(int i = 2; i < sqrt(n); i++) {
    if(sieve[i] == 1) {
      for (size_t j = i*i; j < n; j+=i) {
        sieve[j] = 0;
      }
    }
  }
  printPrimes(sieve, n);
  return sieve;
}

void printPrimes(int * sieve, int size) {
  printf("\nPrimes in range %d are:\n\t", size);
  for (int i = 2; i < size; i++) {
    if(sieve[i] == 1) {
      printf(" %d", i);
    }
  }
}
