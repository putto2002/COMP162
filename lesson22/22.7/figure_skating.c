#include <stdio.h>
#include <stdlib.h>
int main(void){
   double s1, s2, s3;
   int return_code;
   printf("Please enter the three scores: ");
   fflush(stdout);
   return_code = scanf("%lg%lg%lg", &s1, &s2, &s3);
   if(return_code != 3){
      printf("scanf return code %d\n", return_code);
      return EXIT_FAILURE;
   }
   
   if(s1 < s2 && s1 < s3){
    printf("%f", (s2 + s3)/2);
   } else if(s2 < s1 && s2 < s3){
    printf("%f", (s1 + s3)/2);
   } else {
    printf("%f", (s1 + s2)/2);
   }
}

