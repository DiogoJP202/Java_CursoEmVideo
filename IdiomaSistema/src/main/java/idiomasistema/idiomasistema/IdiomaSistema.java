package idiomasistema.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        // Obtém a localização padrão do sistema
        Locale localeSistema = Locale.getDefault();

        // Obtém o idioma e o país do sistema
        String linguagemSistema = localeSistema.getLanguage();
        String paisSistema = localeSistema.getCountry();

        System.out.println("A linguagem do sistema é: " + linguagemSistema);
        System.out.println("O país do sistema é: " + paisSistema);
    }

}
