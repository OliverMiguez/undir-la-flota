
/**
 * Programa que imita al juego de los barcos de tocado y hundido
 * para trabajar con array bidimensional
 * Práctica de cod
 * @author Oliver Miguez Alonso
 */
public class barcos {
    public static void main(String[] args) {

        int[][] tablero;

        //coordenadas de los barcos, donde hay un uno hay un trozo de barco
        tablero = new int[][]{
                {4,4,4,4,0},
                {0,0,0,0,0},
                {0,0,0,0,2},
                {0,0,0,0,2},
                {0,0,1,0,0}
        };

        recorrerTablero(tablero);

        /*
        Muestra las coordenadas del tablero
        //coordenadas de la cuadrícula donde están los barcos
    int i = 0;
    int j = 0;

    //te enseña todas las coordenadas por pantalla
    do{
        do{
            System.out.println(tablero[i][j]);
            j++;
        }while(j<5);
        i++;
        j=0;
    }while(i<5);

*/

    }//end main

    /**
     * Función que recorre el tablero
     * @param aux_tablero tabla con los mismos valores que el tablero inicial
     */
    static void recorrerTablero(int[][] aux_tablero) {
        /*System.out.println("...");
        aux_tablero[2][2] = 5;
*/
        //recorremos el tablero
        for(int i = 0; i < 5 ; i++){
            for(int j = 0; j < 5; j++){

                int coordenada_actual = aux_tablero[i][j];

                if(esNave(coordenada_actual)){

                    tipoNave(coordenada_actual,i,j);

                }//end if

            }//end for
        }//end for

    }//end recorrerTablero


    /**
     * Funcion que determina si es nave o no
     * @param valor_coordeanda coordenadas en la que nos encontramos
     * @return true o false dependiendo si es o no nave
     */
    static boolean esNave(int valor_coordeanda){
        if(valor_coordeanda > 0){
            return true;
        }//end if
        else{
            return false;
        }//end else

    }//end esNave

    /**
     * Comprueba que tipo de nave es
     * @param valor_coordenada coordenadas de la tabla
     * @param i para trabajar con las coordenadas de la tabla
     * @param j para trabajar con las coordenadas de la tabla
     */
    static void tipoNave(int valor_coordenada,int i, int j){
        //Que tipo de nave es
        switch (valor_coordenada){
            case 1:
                System.out.println("submarino "+ i +":" + j);
                break;
            case 2:
                System.out.println("fragata "+ i +":" + j);
                break;
            case 4:
                System.out.println("Portaaviones "+ i +":" + j);
                break;
            default:
                System.out.println("No se lo que es");
                break;

        }//end switch
    }//end tipoNave

}//end class

