
package gestorarchivos;
import java.io.File;

public class GestorArchivos {

    
    public static void main(String[] args) {
        File file = new File("miarchivo.txt");
        if(!file.exists()){
            try{
                file.createNewFile();   
                System.out.println(file.getName()+" Ha sido creado");
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
    
}
