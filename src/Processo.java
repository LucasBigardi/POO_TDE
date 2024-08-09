import java.util.Scanner;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Processo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OrdemServiço os = new OrdemServiço();
        boolean exit = true;

        OrdemServiço os1, os2, os3;
        os1 = new OrdemServiço();
        os2 = new OrdemServiço();
        os3 = new OrdemServiço();

        while(exit) {
            System.out.println("Oque deseja fazer?");
            System.out.println("1 - Criar Ordem de Serviço: " +
                               "\n2 - Imprimir Ordem de Serviço: " +
                               "\n3 - Mudar Status da Ordem de Serviço: " +
                               "\n4 - Adicionar uma informação: " +
                               "\n5 - Atualizar as informações: " +
                               "\n6 - Checar valor a pagar: ");

            int opcao = sc.nextInt();
            if(opcao == 1){
                System.out.println("Selecione o cliente: " +

                                    );
            }

        }
    }
}