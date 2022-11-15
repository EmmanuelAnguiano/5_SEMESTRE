#define HEADER 0x03 //header inicial de una trama 802_15_4
#define RX_16BITS 0x81	//tipo de trama de recepcion

class IEEE_802_15_4{
	public:
		uint8_t frame_rx [ 200 ] = {0x7E, 0x00, 0x39, 0x81,0x33,0x33,0x39,0x01,0x45,0x73,0x74,0x65,0x20,0x65,0x73,0x20,0x65,0x6C,0x20,0x65,0x71,0x75,0x69,0x70,0x6F,0x20,0x33,0x20,0x64,0x65,0x20,0x35,0x43,0x20,0x79,0x20,0x73,0x61,0x62,0x65,0x6D,0x6F,0x73,0x20,0x70,0x72,0x6F,0x67,0x72,0x61,0x6D,0x61,0x72,0x20,0x65,0x6E,0x20,0x43,0x2B,0x2B, 0xA3};	
	struct{ //variables dentro de la clase
		uint16_t MAC = 0x00;		//direccion de origin de la trama
		uint16_t LENGHT = 0x00;		//longitud del mensaje sin el header
		uint8_t TYPE = 0X00;		//tipo de mensaje
		uint8_t RSSI = 0x00;		//RSSI (Received Signal Strenght Indicator) indica la intensidad del mensaje con la que llega
		string PAYLOAD = "";		//mensaje util
		bool CHECKSUM = false;	//verificador de integridad de la trama
	} struct_frame;
	public: //metodos dentro de la clase
		uint16_t GET_MAC(void);		//este metodo retorna la mac (0x2222)
		uint16_t GET_LENGTH(void);	//este metodo retorna la longitud sin el header
		uint8_t GET_TYPE(void);		//este metodo obtiene el tipo de trama
		uint8_t GET_RSSI(void);		//este metodo retorna la intensidad con que llega el mensaje
		string GET_PAYLOAD(void);	//este metodo retorna el mensaje util
		bool GET_CHECKSUM(void);	//este metodo retorna si la trama es corrupta o no

}; 

uint16_t IEEE_802_15_4 :: GET_MAC (void){
	return frame_rx[4]*256 + frame_rx[5];
}

uint16_t IEEE_802_15_4 :: GET_LENGTH (void){
	return frame_rx[1]*256 + frame_rx[2];
}

uint8_t IEEE_802_15_4 :: GET_TYPE (void){
	return frame_rx[3];
}

uint8_t IEEE_802_15_4 :: GET_RSSI (void){
	return frame_rx[6];
}

string IEEE_802_15_4 :: GET_PAYLOAD (void){
	string temp_string = "";
	for(uint8_t i= 8; i<GET_LENGTH() + HEADER; i++)
		temp_string += frame_rx[i];
	return temp_string;
}

bool IEEE_802_15_4 :: GET_CHECKSUM (void){
	uint8_t suma = 0;
	for(uint8_t i= HEADER; i<GET_LENGTH() + HEADER; i++)
		suma += frame_rx[i];
		if((0xFF - suma) == frame_rx[ GET_LENGTH() + HEADER ])
			return true;
		else
			return false;
}
