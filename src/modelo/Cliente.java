package modelo;
/* Nombre: Miguel Alexander Castro Escobar Carnet: ce23002
 * */
public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    public Cliente(String nombre, String apellido) {
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
