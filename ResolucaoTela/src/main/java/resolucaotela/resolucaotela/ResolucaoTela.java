package resolucaotela.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        // Obtém a instância do Toolkit
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        // Obtém o tamanho da tela
        Dimension tamanhoTela = toolkit.getScreenSize();
        
        int larguraTela = tamanhoTela.width;
        int alturaTela = tamanhoTela.height;
        
        System.out.println("Resulução da tela: " + larguraTela + " X " + alturaTela);
    }
}
