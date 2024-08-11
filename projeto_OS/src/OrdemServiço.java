public class OrdemServiço {

    public String cliente;
    public String tecnico;
    public double horas_servico;
    public String observacao;
    public String laudo;

    public static int numeroOrdem = 0;
    public String status = "Em aberto";
    public static double valorHora = 180;

    public OrdemServiço(){
    }

    public OrdemServiço(String Cliente, String Tecnico, double tempoServico, String observacao, String laudo){
        this.cliente = Cliente;
        this.tecnico = Tecnico;
        this.horas_servico = tempoServico;
        this.observacao = observacao;
        this.laudo = laudo;
    }

    public void imprimirOrdem(){
        System.out.println("Número da OS: " + numeroOrdem +
                           "\nCliente: " + this.cliente +
                           "\nTécnico: " + this.tecnico +
                           "\nHoras de serviço (em minutos): " + this.horas_servico +
                           "\nLaudo Técnico: " + this.laudo +
                           "\nObservações: " + this.observacao +
                           "\nSituação: " + this.status);

    }

    public void contadorOrdem(){numeroOrdem++;
    }

    public void addObservacao(String observacao){
       this.observacao = observacao;
    }

    public void mudarStatus(String novoStatus){
        this.status = novoStatus;
    }

    public double valorPagar(){
        return (horas_servico / 60) * valorHora;
    }

    public void atualizarCliente(String cliente){
        this.cliente = cliente;
    }
    public void atualizarTecnico(String tecnico){
        this.tecnico = tecnico;
    }
    public void atualizarTempoServico(int horas_servico){
        this.horas_servico = horas_servico;
    }
    public void atualizarLaudo(String Laudo){
        this.laudo = laudo;
    }

    public static String inicio(){
        return "1 - Criar Ordem de Serviço: " +
                "\n2 - Imprimir Ordem de Serviço: " +
                "\n3 - Mudar Status da Ordem de Serviço: " +
                "\n4 - Adicionar uma Observação: " +
                "\n5 - Atualizar as informações: " +
                "\n6 - Checar valor a pagar: " +
                "\n7 - Sair";
    }

    public static String alteracao(){
        return "1 - Alterar Cliente" +
                "\n2 - Alterar Técnico" +
                "\n3 - Alterar tempo de Serviço" +
                "\n4 - Alterar Laudo Técnico" +
                "\n0 - Voltar";
    }

}
