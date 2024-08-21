import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private String nome;
    private Integer cpf;
    private LocalDate dtNasc;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    public Cliente(){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = LocalDate.of(0000, 0, 00);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public Integer getCpf(){
        return cpf;
    }

    public void setCpf(){
        this.cpf = cpf;
    }

    public void setdtNasc(int dia, int mes, int ano){
        this.dtNasc = LocalDate.of(dia, mes, ano);
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }
}
