#include "include/Sieve.h"

int main(int argc, char const *argv[]) {
  if(argc != 2) {
    printf("Usage: %s [number]\n", __FILE__);
    exit(0);
    return 0;
  }
  else {
    int range = atoi(argv[1]);
    Sieve(range);
    printf("\n\n");
  }
  return 0;
}
