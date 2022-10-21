import java.util.Date;

public class Persona extends Usuario{
    public Persona(String usuario, String contrasenia) {
        super(usuario, contrasenia);
    }

    String nombre;
    String primerApellido;
    String segundoApellido;
    String ci;
    Date fechaNacimiento;
    String direccion;
    int celular;
    int telefono;
    String email;
}
