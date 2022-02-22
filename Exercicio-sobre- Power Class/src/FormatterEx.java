import java.util.Formatter;

public class FormatterEx{

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder(); // Destino para o formatador
        Formatter formatar = new Formatter(sb); // Instância

        // Como primeiro argumento a string a ser formatada.
        // Os demais argumentos iram compor a string resultante
        formatar.format("Alan %s", "Rodrigues");
        System.out.println(sb); // Printando a string destino

        // Simplificando
        String nomeCompleto = String.format("MJV %s", "School");
        System.out.println(nomeCompleto);

        // Se a intenção é somente imprimir algo formatado temos  tambem
        System.out.printf("22 %s","02" ); 



    }



    
}