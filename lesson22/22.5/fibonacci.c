#include <math.h>
#include <stdio.h>
#include <stdlib.h>
int main(void){
   int f = 0;
   int g = 1;
   int temp_g;
   int i;
   for(i = 0; i < 40; i++){
      printf("%d ", g);
      temp_g = g;
      g += f;
      f = temp_g;
      if(i%5==0 && i != 0){
         printf("\n");
      }
   }
   return EXIT_SUCCESS;
}
