

import java.util.Random;
import javax.swing.JOptionPane;


public class Boletin11_2 {
    /**
     * variables establecidas
     */
    int numero;
    int i=0;
    double adivinar;

    /**
     * crear objeto llamado SegundoJugador
     */
    public void SegundoJugador(){
        /**
         * Establecemos una variable llamada cifra que sea aleatoria
         * y luego hacemos que la variable numero anteriormente declarada sea igual a cifra
         * que tendrá un valor entre 1 y 50
         */
           Random cifra = new Random();
           numero = cifra.nextInt(1, 50);
        /**
         *  Bucle para adivinar el numero,mientras la variable adivinar sea diferente a la variable
         *  número,esta te obligará a volver a intentarlo, indicando una pista a cerca de si estas
         *  muy alejado o no del número en cuestion, sii aciertas el programa mostrará un mensaje
         *  y el número de intentos utilizados
         */
                do{
                   int diferencia =(int) Math.abs(adivinar-numero);
                    adivinar = Double.parseDouble(JOptionPane.showInputDialog("Intente adivinar el número escrito por el Primer Jugador"));
                   if (diferencia>20){
                   JOptionPane.showMessageDialog( null,  "Moi lonxe");
                   }
                   if(diferencia<=20 && diferencia>=10){
                   JOptionPane.showMessageDialog( null,  "Lonxe");
                   }
                   if(diferencia<10 && diferencia>5){
                       JOptionPane.showMessageDialog( null,  "preto");
                   }
                   if(diferencia<=5 && diferencia>0){
                   JOptionPane.showMessageDialog( null,  "Moi preto");
                   }
                    i++;
                }while(adivinar == numero);
                 JOptionPane.showMessageDialog( null,  "Correcto!!!! lo adivinaste en "+i +" intentos");
    }
}
    

