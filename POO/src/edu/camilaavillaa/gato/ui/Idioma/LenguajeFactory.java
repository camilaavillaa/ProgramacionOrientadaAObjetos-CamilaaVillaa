package edu.camilaavillaa.gato.ui.Idioma;
/**
 * La clase `LenguajeFactory` proporciona métodos para configurar y obtener mensajes internacionalizados
 * en el idioma seleccionado.
 */
public class LenguajeFactory {
    private static Lenguaje language;
    /**
     * Establece el idioma seleccionado en función de la opción proporcionada.
     *
     * @param languageOption La opción de idioma seleccionada (1 para español, 2 para inglés).
     */
    public static void setLanguage(int languageOption) {
        switch (languageOption) {
            case 1:
                language = new Español();
                break;
            case 2:
                language = new Ingles();
                break;
            default:
                System.out.println("Idioma no soportado. Seleccionando español por defecto.");
                language = new Español();
        }
    }

    public static String getMensaje(String key) {
        if (language != null) {
            return language.getMensaje(key);
        }
        return "Idioma no configurado";
    }
}
