package repositorio;
/* Nombre: Miguel Alexander Castro Escobar Carnet: ce23002
 * */
import modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
    OrdenableRepositorio, PaginableRepositorio {

        private List<Cliente> dataSource;

    public ClienteListRepositorio() {
            this.dataSource = new ArrayList<>();
        }

        @Override
        public List<Cliente> listar() {
            return dataSource;
        }

        @Override
        public Cliente porId(Integer id) {
            for (Cliente cliente : dataSource) {
                if (cliente.getId().equals(id)) {
                    return cliente;
                }
            }
            return null;
        }

        @Override
        public void crear(Cliente cliente) {
            dataSource.add(cliente);
        }

        @Override
        public void editar(Cliente cliente) {
            Cliente clienteExistente = porId(cliente.getId());
            if (clienteExistente != null) {
                clienteExistente.setNombre(cliente.getNombre());
                clienteExistente.setApellido(cliente.getApellido());
            } else {
                System.out.println("Cliente no encontrado");
            }
        }

        @Override
        public void eliminar(Integer id) {
            Cliente cliente = porId(id);
            if (cliente != null) {
                dataSource.remove(cliente);
            } else {
                System.out.println("Cliente no encontrado");
            }
        }

        @Override
        public List<Cliente> listar(String campo, Direccion dir) {
            // implementacion de ordenación
            return null;
        }

        @Override
        public List<Cliente> listar(int desde, int hasta) {
            // implementacion de paginación
            return null;
        }
}
