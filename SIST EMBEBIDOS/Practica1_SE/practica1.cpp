#include <iostream> 	//libreria pera usar el flujo de información
#include <string>  		//libreria para usar tipos de datos string
#include <stdint.h> 	//libreria para usar tipos de dartos especiales (uint8_t)


using std::cout;  	//extraer elemento de la libreria "cout"
using std::cin;  	//extraer elemento de la libreria "cin"
using std::string;	//extraer elemento de la libreria "string"
using std::endl;	//extraer elemento de la libreria "endl"

#include "IEEE_802_15_4.h"
int option=0;
IEEE_802_15_4 frame;
int main(){
	do{
		cout << "[1] Mostrar la direccion MAC" <<endl;
		cout << "[2] Mostrar la longitud del mensaje" <<endl;
		cout << "[3] Mostrar el tipo de mensaje" <<endl;
		cout << "[4] Mostrar la calidad de la señal del mensaje" <<endl;
		cout << "[5] Mostrar el mensaje oculto" <<endl;
		cout << "[7] Mostrar la trama del mensaje" <<endl;
		cout << "[0] salir" <<endl;
		cin >> option;
		switch(option){
			case 1:
				frame.struct_frame.MAC = frame.GET_MAC(); //clase.estructura.con miembro
				printf("la direccion mac de origen es: 0X%x\n", frame.struct_frame.MAC );
			break;
			case 2:
				frame.struct_frame.MAC = frame.GET_LENGTH();
				printf("la longitud de la trama es: %d bytes \n", frame.struct_frame.MAC );
			break;
			case 3:
				frame.struct_frame.TYPE = frame.GET_TYPE();
				printf("el tipo de trama es: 0x%x \n", frame.struct_frame.TYPE);
					if(frame.struct_frame.TYPE == RX_16BITS)
				printf("una trama de recepcion de 16 bits \n");
					else
				printf("una trama desconocida \n");
			break;
			case 4:
					frame.struct_frame.RSSI = frame.GET_TYPE();
				printf("la calidad de recepcion del mensaje es -%d dbm \n", frame.GET_RSSI());
			break;
			case 5:
				frame.struct_frame.PAYLOAD = frame.GET_PAYLOAD();
				cout << "el mensaje oculto es: \n" << frame.struct_frame.PAYLOAD << endl;
			break;
			case 6:
				frame.struct_frame.CHECKSUM = frame.GET_CHECKSUM();
				if(frame.struct_frame.CHECKSUM)
			printf("la trama no esta corrupta \n");
				else
				printf("la trama esta corrupta \n");
			break;
			case 0:
				cout<<"saliendo del programa..."<<endl;
			break;
			default:
				printf("opcion no valida \n");
			break;
		}
	}while(option != 0);
		return 0;
}
