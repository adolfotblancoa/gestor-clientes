package aplicacion;
import java.util.ArrayList;
import dominio.Agenda;
import dominio.Cliente;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]){
        ArrayList <Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente(12345678, "Omar", "Aboultaif");
        Cliente cliente2 = new Cliente(87654321, "Trafalgar", "Law");
        clientes.add(cliente1);
        clientes.add(cliente2);
        System.out.println("Introduzca el DNI del cliente a buscar: ");
        Scanner sc = new Scanner(System.in);
        int dni = sc.nextInt();
        Agenda.consultarCliente(dni, clientes);
        sc.close();

    }
    
}
