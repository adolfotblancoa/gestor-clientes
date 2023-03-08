package aplicacion;
import java.util.ArrayList;
import dominio.Agenda;
import dominio.Cliente;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]){
        ArrayList <Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente(12345678, "Omar", "Aboultaif");
        Cliente cliente2 = new Cliente(87654321, "Trafalgar", "D. Law");
        Cliente cliente3 = new Cliente(24682468, "Monkey", "D. Luffy");
        Cliente cliente4 = new Cliente(13579135, "Luka", "Doncic");
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        System.out.println("Introduzca el DNI del cliente a buscar: ");
        Scanner sc = new Scanner(System.in);
        int dni = sc.nextInt();
        Agenda.consultarCliente(dni, clientes);
        sc.close();
        System.out.println("Listado de clientes:");
        Agenda.listarClientes(clientes);


    }
    
}
