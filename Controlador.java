
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.ArrayList;
public class Controlador {
    FileReader fr = null;
    BufferedReader br = null;
    String linea = null;
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
            while ((linea = br.readLine()) != null) {
            //Utilizamos el separador para los datos
            dat.add(linea.toString());
            }
                for (String xd:dat){
                    //aqui va el llamado a la calculadora
                }

        } catch (Exception e) {
            throw new RuntimeException("Archivo No Encontrado");
    }


}
}

