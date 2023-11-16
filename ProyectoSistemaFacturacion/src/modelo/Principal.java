/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author 59398
 */
public class Principal {

    List<Persona> personas = new ArrayList<>();
    List<Usuario> usuarios = new ArrayList<>();
    List<UsuarioRol> usuariosRol = new ArrayList<>();
    List<RolCompetencia> rolesCompetencia = new ArrayList<>();

    public void cargarDatos() {

        Persona p1 = new Persona(1, "Diego", "Cale", "1104779044", "09856442", "diego@ups.edu.ec", new GregorianCalendar(1989, 0, 29).getTime());
        Persona p2 = new Persona(2, "Luis", "Paz", "213213215", "8798654653", "luis@ups.edu.ec", new GregorianCalendar(1990, 5, 20).getTime());
        Persona p3 = new Persona(3, "JOse", "Criollo", "545645", "32546577", "jose@ups.edu.ec", new GregorianCalendar(1995, 9, 15).getTime());
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        Usuario u1 = new Usuario(1, p1, "admin", "1234kl");
        Usuario u2 = new Usuario(2, p2, "admin", "1234");
        usuarios.add(u1);
        usuarios.add(u2);

        Rol r1 = new Rol(1, "TEC. EN MATENIMIENTO", true);
        Rol r2 = new Rol(2, "ING. DE AUTOMATIZACION", true);
        Rol r3 = new Rol(3, "COOR DE ING. TEC", true);

        UsuarioRol us1 = new UsuarioRol(u1, r1);
        UsuarioRol us2 = new UsuarioRol(u1, r2);
        UsuarioRol us3 = new UsuarioRol(u1, r3);

        usuariosRol.add(us1);
        usuariosRol.add(us2);
        usuariosRol.add(us3);
        u1.setListaUsuarioRol(usuariosRol);

        Competencia cp1 = new Competencia(1, "MANT. PREV", "EJ. MATENIMIENTO PREV");
        Competencia cp2 = new Competencia(2, "EJ. PROYECTO", "EJ. PROYECTO EFICIENCIA ENERGETICA");
        Competencia cp3 = new Competencia(3, "COMPTA ACTIVOS", "COMPRA DE ACTIVOS Y MAQUINARIA");
        Competencia cp4 = new Competencia(4, "CONTROL INDICADORES", "ENCARGADO DE SEGUIMIENTO Y CONTROL DE INDICADORES");

        RolCompetencia rc1 = new RolCompetencia(r1, cp1);
        RolCompetencia rc2 = new RolCompetencia(r1, cp2);
        RolCompetencia rc3 = new RolCompetencia(r1, cp3);
        rolesCompetencia.add(rc1);
        rolesCompetencia.add(rc2);
        rolesCompetencia.add(rc3);
        r1.setListaRolCompetencia(rolesCompetencia);
    }

    public Usuario validarCredenciales(String usuario, String password) {
        Usuario usuario_encontrado = null;
        for (Usuario seleccionado : usuarios) {
            String us_seleccionado = seleccionado.getUsuario();
            String pass_seleccionado = seleccionado.getPassword();
            if (us_seleccionado.equals(usuario) && pass_seleccionado.equals(password)) {
                usuario_encontrado = seleccionado;
            }
        }
        if (usuario_encontrado != null) {
            Persona persona_encontrado = usuario_encontrado.getId_persona();
            System.out.println("Nombre: " + persona_encontrado.getNombre() + " \n");
            System.out.println("Apellido: " + persona_encontrado.getApellido() + " \n");
            System.out.println("DNI: " + persona_encontrado.getDni() + " \n");

        }
        return usuario_encontrado;
    }

    public UsuarioRol obtenerRoles(Usuario u) {
        UsuarioRol usRol = null;
        if (u != null) {
            List<UsuarioRol> listaRole = u.getListaUsuarioRol();
            for (UsuarioRol usuarioRol : listaRole) {
                System.out.println(usuarioRol.getId_rol().getRol());
                usRol = usuarioRol;
            }

        }
        return usRol;
    }

    public void obtenerCOmpetencias(Usuario u) {
        System.out.println("LAS COMPETENCIAS");
        List<UsuarioRol> listUsuarioRol = u.getListaUsuarioRol();
        for (UsuarioRol usuarioRol : listUsuarioRol) {
            List<RolCompetencia> listaRolCompete = usuarioRol.getId_rol().getListaRolCompetencia();
            if (listaRolCompete != null) {
                for (RolCompetencia rolCompetencia : listaRolCompete) {
                    System.out.println("Comptencia: " + rolCompetencia.getId_competencia().getNombre());;
                }
            }

        }
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.cargarDatos();
        // p.obtenerRoles(p.validarCredenciales("admin", "1234kl"));
        p.obtenerCOmpetencias(p.validarCredenciales("admin", "1234kl"));

    }
}
