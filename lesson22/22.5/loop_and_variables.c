#include <math.h>
#include <stdio.h>
#include <stdlib.h>
int main(void) {
/* variable declarations */
   int i = 0;
   double j = 1.0;
/* a familiar "for loop" */
   for (i = 0; i < 10; i++) {
      printf("%d %6.2f %8.3f\n", i, j, sqrt(j)); /* sqrt defined in math.h */
      j *= 2;
   }
   printf("%d",EXIT_SUCCESS);
   return EXIT_SUCCESS; /* defined in stdlib.h */
}
