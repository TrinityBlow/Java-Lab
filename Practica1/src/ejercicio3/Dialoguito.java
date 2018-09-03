package ejercicio3;

import java.awt.Dialog;
import java.awt.Frame;

@SuppressWarnings("serial")
public class Dialoguito extends Dialog {
	public Dialoguito(Frame parent) {
		super(parent);
		System.out.println("Dialoguito") ;
	}
}

//Cuando la clase a la que se extiende tiene un constructor personalizado el cual recibe parametros, hay que explicitamenter invocarlos
//con los argumentos necesarios para que se constructor se puede ejecutar correctamente y poder crear el objeto al cual esta extendido
//
//3.3) La implementacion de los contructores privados es incorrecta, cuando la clase extiende a una que solo tiene constructores privados
//esta no puede ser extendido dado que la unica clase que puede llamar a ese constructor es solo la clase que lo tiene, haciendo que
//la extension no sea posible
//En la implementacion de los protejido SubClase esta bien implementada, para poder hacer uso de un constructor protected a este hay que
//extenderlo para asi poder hacer uso del constructor.
//La implementacion de OtraClase esta mal implementada, esta clase quiere crear una instacia de SuperClase y cuando ejecuta el new
//esta no puede por que el constructor es protected y no se puede invocar constructores protected desde afuera de la clase o alguna que
//no la extienda