package dominio;
import java.util.ArrayList;
public class Agenda {
        

    public static void consultarCliente(int dni, ArrayList<Cliente> clientes){
        clientes.stream()
        .filter(x->x.getDni()==dni)
        .forEach(x->System.out.println("El cliente es: " + x.getNombre() + " " + x.getApellido()));
    }

     
}
