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

        OrdemServiço os1;
        os1 = new OrdemServiço();

        while(exit) {
            System.out.println("Oque deseja fazer?");
            System.out.println("1 - Criar Ordem de Serviço: " +
                               "\n2 - Imprimir Ordem de Serviço: " +
                               "\n3 - Mudar Status da Ordem de Serviço: " +
                               "\n4 - Adicionar uma Observação: " +
                               "\n5 - Atualizar as informações: " +
                               "\n6 - Checar valor a pagar: " +
                               "\n7 - Sair");

            int opcao = sc.nextInt();
            if(opcao == 1){
                os1.mudarStatus("Em Aberto");
                System.out.println("Entre com as informações da Ordem de Serviço");
                os1.contadorOrdem();
                System.out.println("Ordem de Serviço Número: " + os1.numeroOrdem);
                System.out.println("Cliente: ");
                os1.cliente = sc.next();
                System.out.println("Técnico: ");
                os1.tecnico = sc.next();
                System.out.println("Horas de Serviço (em minutos): ");
                os1.horas_servico = sc.nextDouble();
                System.out.println("Laudo: ");
                os1.laudo = sc.next();
                System.out.println("Observações: ");
                os1.observacao = sc.next();
            }
            else if(opcao == 2){
                os1.imprimirOrdem();
            }
            else if (opcao == 3){
                System.out.println("Qual o novo status da OS?");
                String novoStatus = sc.next();
                os1.mudarStatus(novoStatus);
            }
            else if (opcao == 4) {
                System.out.println("Adicione nova observação");
                String novaObserv = sc.next();
                os1.addObservacao(novaObserv);
            }
            else if (opcao == 5){
                System.out.println("Qual informação deseja alterar?");
                System.out.println("1 - Alterar Cliente" +
                                   "\n2 - Alterar Técnico" +
                                   "\n3 - Alterar tempo de Serviço" +
                                   "\n4 - Alterar Laudo Técnico" +
                                   "\n0 - Voltar");
                int opcao2 = sc.nextInt();
                if (opcao2 == 1){
                    System.out.println("Entre com o novo cliente");
                    String novoCliente = sc.next();
                    os1.atualizarCliente(novoCliente);
                }
                else if (opcao2 == 2){
                    System.out.println("Entre com o novo Técnico");
                    String novoTecnico = sc.next();
                    os1.atualizarTecnico(novoTecnico);
                }
                else if (opcao2 == 3){
                    System.out.println("QUal o tempo de serviço?");
                    int novaHora = sc.nextInt();
                    os1.atualizarTempoServico(novaHora);
                }
                else if (opcao2 == 4){
                    System.out.println("Entre com o novo laudo");
                    String novoLaudo = sc.next();
                    os1.atualizarLaudo(novoLaudo);
                }
                else if (opcao2 == 0){
                    continue;
                }
            }
            else if (opcao == 6){
                System.out.println("O Valor a cobrar da Ordem é: \n" + os1.valorPagar());
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