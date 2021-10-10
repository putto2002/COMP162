#include <stdio.h>
#include <stdlib.h>

#define ARRAY_SIZE 100
int main(void){
int i;
int counter = 0;
char chars[ARRAY_SIZE];
for(i=0;i<ARRAY_SIZE;i++){
 chars[i] =  'A' + (random() % 26);
}

for(i=0;i<ARRAY_SIZE;i++){
 if(chars[i] == 'A'|| chars[i] == 'E'|| chars[i] == 'I'|| chars[i] == 'O'|| chars[i] == 'U'){
 printf("%c\n", chars[i]);
 counter++;
 
 }
 }
 printf("There are %d vowels.", counter);

 
}
