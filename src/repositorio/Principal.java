package repositorio;
/* Nombre: Miguel Alexander Castro Escobar Carnet: ce23002
* */
import modelo.Cliente;

public class Principal {
    public static void main(String[] args) {
        CrudRepositorio repositorio = new ClienteListRepositorio();

        // clientes de ejemplo
        Cliente cliente1 = new Cliente("Alexander", "Castro");
        Cliente cliente2 = new Cliente("Miguel", "Escobar");

        // agregar clientes al repositorio
        repositorio.crear(cliente1);
        repositorio.crear(cliente2);

        // lista clientes
        System.out.println("Listado de clientes:");
        for (Cliente cliente : repositorio.listar()) {
            System.out.println("ID: " + cliente.getId() + ", Nombre: " + cliente.getNombre() +
                    ", Apellido: " + cliente.getApellido());
        }

        // editar cliente
        cliente1.setNombre("Juan");
        cliente1.setApellido("Castaneda");
        repositorio.editar(cliente1);

        // listar clientes despue de editar
        System.out.println("\nListado de clientes despues de editar:");
        for (Cliente cliente : repositorio.listar()) {
            System.out.println("ID: " + cliente.getId() + ", Nombre: " + cliente.getNombre() +
                    ", Apellido: " + cliente.getApellido());
        }

        // eliminar un cliente
        repositorio.eliminar(cliente2.getId());

        // listar clientes despues de eliminra
        System.out.println("\nListado de clientes despues de eliminar:");
        for (Cliente cliente : repositorio.listar()) {
            System.out.println("ID: " + cliente.getId() + ", Nombre: " + cliente.getNombre() +
                    ", Apellido: " + cliente.getApellido());
        }
    }
}

