#include <stdio.h>

void func0(){
	printf("Printing from C code.\n");
}

void func1(int param1, char* param2){
	printf("Param1 = %d, Param2 = %s\n", param1, param2);
}

void func2(unsigned char param1, int param2[]){
	printf("Param1 = %d, Param2[0] = %d\n", param1, param2[0]);
}