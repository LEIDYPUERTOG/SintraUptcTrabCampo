package Test;

import Logica.Persona;
import Logica.TipoDocumento;
import Logica.TipoUsuario;
import Persistencia.ConexionDB;
import Persistencia.PersonaDao;

import java.util.ArrayList;

/**
 * Created by LEIDY on 26/09/2015.
 */
public class Main {
    public static void main(String[] args) {
        ConexionDB db = new ConexionDB();
        System.out.println("la conexion esta "+db.isHayConexion());
        PersonaDao personaDao = new PersonaDao();
        //Persona p = new Persona(1049636125,"Leidy Carolina Puerto", TipoDocumento.Cedula, TipoUsuario.Afiliado);
        // System.out.println(personaDao.crearPersona(p));
        //Persona p = personaDao.consultarPersona(1049636125);
        //System.out.println(p.getNombre()+" "+p.getTipoUsuario());
        ArrayList<Persona> listaAux = personaDao.consultarPersonas();
        System.err.println(listaAux.size());

    }

}
