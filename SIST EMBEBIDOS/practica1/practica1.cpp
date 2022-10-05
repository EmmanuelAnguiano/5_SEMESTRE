#include<conio.h>
#include <iostream>
using namespace std;

#include "IEEE_802_15_4.h"

  int main()
   {
    int opcion;
     cout << "1. Mostrar direccion MAC de origen." << endl;
     cout << "2. Mostrar longitud de mensaje." << endl;
     cout << "3. Mostrar tipo de trama o paquete." << endl;
     cout << "4. Mostrar la calidad de la señal." << endl;
     cout << "5. Mostrar mensaje." << endl;
     cout << "6. Mostrar si el paquete esta corrupto." << endl;
     opcion=getch();

      switch(opcion)
       {
         case '1': //mac
        GET_MAC();
         break;
         case '2': //longitud de mensaje
         GET_LENGTH();
         break;
         case '3':
         GET_OPTION(); //tipo de mensaje
         break;
         case '4':
         GET_RSSI(); //calidad de mensaje
         break;
         case '5': //mostrar mensaje
         GET_PAYLOAD();
         break;
         case '6': //mostrar si es coruupto o no
         CHECKSUM();
         break;
        default:
        cout << "Seleccion no valida" << endl;
        break;
       }
    return 0;
   }
