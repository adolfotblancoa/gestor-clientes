package dominio;
import java.util.ArrayList;
import dominio.Cliente;
public class Agenda {
        

    public static void consultarCliente(int dni, ArrayList<Cliente> clientes){
        clientes.stream()
        .filter(x->x.getDni()==dni)
        .forEach(x->System.out.println("El cliente es: " + x.getNombre() + " " + x.getApellido()));
    }


    
}


/*  
   for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].getDni() == dni) {
                System.out.println("El cliente es: " + clientes[i].getNombre() + " " + clientes[i].getApellido());
            }
        }
 */