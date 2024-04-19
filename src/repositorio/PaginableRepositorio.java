package repositorio;
/* Nombre: Miguel Alexander Castro Escobar Carnet: ce23002
 * */
import modelo.Cliente;

import java.util.List;
public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
