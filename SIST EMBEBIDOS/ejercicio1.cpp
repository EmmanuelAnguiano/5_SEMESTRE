#define FOSC 1843200 // Clock Speed
#define BAUD 9600
#define MYUBRR FOSC/16/BAUD-1
int main(void)
{

USART_Init(MYUBRR);

}
void USART_Init(unsigned int ubrr)
{
/*Set baud rate */
UBRR0H = (unsigned char)(ubrr>>8);
UBRR0L = (unsigned char)ubrr;
Enable receiver and transmitter */
UCSR0B = (1<<RXEN0)|(1<<TXEN0);
/* Set frame format: 8data, 2stop bit */
UCSR0C = (1<<USBS0)|(3<<UCSZ00);
}

void USART_Transmit(unsigned char data)
{
/* Wait for empty transmit buffer */
while (!(UCSRnA & (1<<UDREn)));
/* Put data into buffer, sends the data */
UDRn = data;
}
/*
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
}*/

