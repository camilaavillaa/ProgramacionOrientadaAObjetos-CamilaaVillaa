package edu.camilaavillaa.gato.ui.Idioma;
/**
 * La interfaz `Lenguaje` define el contrato para las clases que proporcionan mensajes internacionalizados.
 */
public interface Lenguaje {
    /**
     * Obtiene un mensaje internacionalizado para la clave dada.
     *
     * @param llave La clave del mensaje.
     * @return El mensaje internacionalizado.
     */
        String getMensaje(String llave);

    }

