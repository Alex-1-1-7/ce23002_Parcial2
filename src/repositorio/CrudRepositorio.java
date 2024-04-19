package repositorio;
import modelo.Cliente;
/* Nombre: Miguel Alexander Castro Escobar Carnet: ce23002
 * */
import java.util.List;
public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
