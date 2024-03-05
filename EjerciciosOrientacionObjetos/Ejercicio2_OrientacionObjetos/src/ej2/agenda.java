package ej2;

import java.util.HashMap;
import java.util.Map;

public class agenda {
    private Map<String, contacto> contactos = new HashMap<>();

    public boolean insertarContacto(String nombre, String telefono) {
        if (!contactos.containsKey(nombre)) {
        	contacto nuevoContacto = new contacto(nombre, telefono);
            contactos.put(nombre, nuevoContacto);
            return true;
        }
        return false;
    }

    public boolean insertarContacto(String nombre, String telefono, String direccion) {
        if (!contactos.containsKey(nombre)) {
        	contacto nuevoContacto = new contacto(nombre, telefono, direccion);
            contactos.put(nombre, nuevoContacto);
            return true;
        }
        return false;
    }

    public contacto obtenerContacto(String nombre) {
        return contactos.get(nombre);
    }

    public void mostrarContactos() {
        for (contacto contacto : contactos.values()) {
            System.out.println(contacto);
        }
    }
}