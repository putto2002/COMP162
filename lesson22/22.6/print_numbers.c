#include <stdio.h>
#include <stdlib.h>
void print_numbers() {
   int i = 0;
   while (i < 5) {
      printf("%d\n", i);
      i++;
   }
}
int main(void) {
   printf("Welcome to the C program.\n");
   printf("Let's print out some numbers:\n");
   print_numbers();
   printf("Finished.\n");
   return EXIT_SUCCESS;
}
