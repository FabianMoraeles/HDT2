
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Objects;
public class Controlador {
    FileReader fr = null;
    BufferedReader br = null;
    String linea = null;
    Operations operador = new Operations();
    Stack<Double> pila = new Stack<>();

    double resultado, numero;
    /**
    * Metodo que permite realizar un archivo de texto en la pantalla.
    * 
    * @param arch - El archivo que haya recibido
    */
    public void archivos(String arch){
        try {
            //Cargamos el archivo de la ruta relativa
            File archivo = new File(arch);
            //Cargamos el objeto FileReader
            fr = new FileReader(archivo);
            //Creamos un buffer de lectura
            br = new BufferedReader(fr);
            System.out.println("Se ha abierto con exito");
                    ArrayList<String> dat=new ArrayList<>();
            // Devuelve el separador para el separador.
            while ((linea = br.readLine()) != null) {

            //Utilizamos el separador para los datos

            dat.add(linea.toString());
            }
                //Obtener el String del archivo.
                for (String xd:dat){

                    //Recorrer el String, caracter por caracter.
                    // Funcion para para el stackes un operando o número.
                    for(int i=0; i<xd.length(); i++ ){
                        String letra = Character.toString(xd.charAt(i));
                        
                        //Identifica si el siguiente en el stack es un operando o un número. En caso de ser número, lo añade al STACK.
                        // En caso de ser un operando, llama a la función correspondiente para calcular.
                        
                            // Metodo para la lista de la lista de la lista de la lista de datos.
                            switch (letra) {
                                case "+":
                                    resultado = operador.sumar(pila.pop(), pila.pop());
                                    pila.push(resultado);
                                    break;
                                case "-":
                                    resultado =operador.restar(pila.pop(), pila.pop());
                                    pila.push(resultado);
                                    break;
                                case "*":
                                    resultado =operador.multiplicar(pila.pop(), pila.pop());
                                    pila.push(resultado);
                                    break;
                                case "/":
                                    resultado =operador.dividir(pila.pop(), pila.pop());
                                    pila.push(resultado);
                                    break;

                                default:
                                    double numero = Double.parseDouble(letra);
                                
                                    pila.push(numero);
                            }

                    }

                  
                  System.out.println("El resultado es: " + resultado);

                } 
            //System.out.println("El resultado es: " + resultado);

        } catch (Exception e) {
            throw new RuntimeException("Archivo No Encontrado");
    }


}
}

