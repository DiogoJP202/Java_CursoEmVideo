package horadosistema.horadosistema;

import java.util.Date; // Importa uma biblioteca que trabalha com datas.

public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date(); // Define a variavel como data e atribui ela ao objeto "Date()".
        
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    }
}
