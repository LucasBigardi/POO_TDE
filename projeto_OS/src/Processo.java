import java.util.Scanner;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Processo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        OrdemServiço os = new OrdemServiço();

        while(exit) {
            System.out.println("Oque deseja fazer?");
            System.out.println(OrdemServiço.inicio());

            int opcao = sc.nextInt();
            if(opcao == 1){
                System.out.println("Entre com as informações da Ordem de Serviço");
                os.contadorOrdem();
                os.mudarStatus("Em Aberto");
                System.out.println("Ordem de Serviço Número: " + OrdemServiço.numeroOrdem);
                System.out.println("Cliente: ");
                os.cliente = sc.next();
                System.out.println("Técnico: ");
                os.tecnico = sc.next();
                System.out.println("Horas de Serviço (em minutos): ");
                os.horas_servico = sc.nextDouble();
                System.out.println("Laudo: ");
                os.laudo = sc.next();
                System.out.println("Observações: ");
                os.observacao = sc.next();

            }
            else if(opcao == 2){
                os.imprimirOrdem();
            }
            else if (opcao == 3){
                System.out.println("Qual o novo status da OS?");
                String novoStatus = sc.next();
                os.mudarStatus(novoStatus);
            }
            else if (opcao == 4) {
                System.out.println("Adicione nova observação");
                String novaObserv = sc.next();
                os.addObservacao(novaObserv);
            }
            else if (opcao == 5){
                System.out.println("Qual informação deseja alterar?");
                System.out.println(OrdemServiço.alteracao());
                int opcao2 = sc.nextInt();
                if (opcao2 == 1){
                    System.out.println("Entre com o novo cliente");
                    String novoCliente = sc.next();
                    os.atualizarCliente(novoCliente);
                }
                else if (opcao2 == 2){
                    System.out.println("Entre com o novo Técnico");
                    String novoTecnico = sc.next();
                    os.atualizarTecnico(novoTecnico);
                }
                else if (opcao2 == 3){
                    System.out.println("QUal o tempo de serviço?");
                    int novaHora = sc.nextInt();
                    os.atualizarTempoServico(novaHora);
                }
                else if (opcao2 == 4){
                    System.out.println("Entre com o novo laudo");
                    String novoLaudo = sc.next();
                    os.atualizarLaudo(novoLaudo);
                }
                else if (opcao2 == 0){
                    continue;
                }
            }
            else if (opcao == 6){
                System.out.println("O Valor a cobrar da Ordem é: \n" + os.valorPagar());
            }
            else if (opcao == 7){
                System.out.println("Até mais!");
                exit = false;
            }
            else {
                System.out.println("Insira uma opção valida.");
            }
        }
    }
}