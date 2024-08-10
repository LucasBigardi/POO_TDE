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
                           "\nHoras de serviço (em minutos): " + horas_servico +
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

}
