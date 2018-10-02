#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int linearSearch(int * arr, int key, int size) {
  for(int i = 0; i < size; i++) {
    if (arr[i] == key) {
      return i;
    }
  }
  return -1;
}

int main(int argc, char const *argv[]) {
  if(argc > 1) {
    printf("Invaid Arguments\n" );
    return 0;
  }
  int size, *arr, key = 0, pos;
  printf("Enter size of the array: " );
  scanf("%d", &size);
  arr = (int*)malloc(sizeof(int) * size);
  printf("Enter the array:\n" );
  for(int i = 0; i < size; i++) {
    scanf("%d", arr+i);
  }
  printf("\n-----------\n");
  printf("Enter the key to search in the array: " );
  scanf("%d", &key);
  pos = linearSearch(arr, key, size);
  if(pos < 0) {
    printf("Your key was not found in the array.\n" );
  }
  else {
    printf("Your key (%d) was found at position (%d) in the array.\n", key, pos);
  }
  return 0;
}
