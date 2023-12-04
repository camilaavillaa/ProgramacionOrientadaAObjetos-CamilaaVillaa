package edu.camilaavillaa.reto12.lenguaje;

public class LanguageFactory {
    private static Lenguaje language;

    public static void setLanguage(int languageOption) {
        switch (languageOption) {
            case 1:
                language = new Español();
                break;
            case 2:
                language = new English();
                break;
            case 3:
                language = new Japanese();
                break;
            case 4:
                language = new Russian();
                break;

            default:
                System.out.println("Idioma no soportado. Seleccionando español por defecto.");
                language = new Español();
        }
    }

    public static String getMessage(String key) {
        if (language != null) {
            return language.getMessage(key);
        }
        return "Idioma no configurado";
    }
}

