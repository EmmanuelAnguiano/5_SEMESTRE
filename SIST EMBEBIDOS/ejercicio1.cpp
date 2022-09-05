#include <iostream>
#include <string>
#include <cmath>
using namespace std;
using std::cout;
using std::endl;

void maxx(){
	cout<< "unsigned: " <<endl;
	cout<< pow(2,8)-1 <<endl;
	cout<< pow(2,16)-1 <<endl;
	cout<< pow(2,32)-1 <<endl;
	cout<< pow(2,64)-1 <<endl;
}

int main(void)
{
   maxx();
   //return pow(8,2);
   return 0;
}
