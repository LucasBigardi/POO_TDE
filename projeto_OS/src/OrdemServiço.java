public class OrdemServiço {

    public String cliente;
    public String tecnico;
    public double horas_servico;
    public String observacao;
    public String laudo;

    public int numeroOrdem = 0;
    public String status = "Em aberto";
    public double valorHora = 180;

    public void imprimirOrdem(){
        System.out.println("Número da OS: " + numeroOrdem +
                           "\nCliente: " + cliente +
                           "\nTécnico: " + tecnico +
                           "\nHoras de serviço (Em minutos): " + horas_servico +
                           "\nLaudo Técnico: " + laudo +
                           "\nObservações: " + observacao +
                           "\nSituação: " + status);

    }

    public void contadorOrdem(){
        this.numeroOrdem++;
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

    public void atualizarTudo(String cliente, String tecnico, String laudo, String observacao, double horas_servico){
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.horas_servico = horas_servico;
        this.observacao = observacao;
        this.laudo = laudo;
    }


}
