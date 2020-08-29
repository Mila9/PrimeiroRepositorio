import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String estadoCivil;

    public Pessoa(String _nome,String _cpf,Date _dataNascimento, String _estadoCivil)
    {
        this.nome=_nome;
        this.cpf=_cpf;
        this.dataNascimento=_dataNascimento;
        this.estadoCivil=_estadoCivil;
    }
public void DizerOla(Pessoa p)
{
System.out.println("O(A)" + this.nome +"disse oi para o(a) " +
        p.nome);
}

public void Acenar(Pessoa p){

    System.out.println("O(A)" + this.nome +"acenou para o(a) " +
            p.nome);

}

public void ComparaIdade(Pessoa p)
{
    if(this.dataNascimento.compareTo(p.dataNascimento) > 0){
        System.out.println("O(A)"+ this.nome + "é mais novo que o(a) "+ p.nome);

    }
    else if(this.dataNascimento.compareTo(p.dataNascimento) == 0){
        System.out.println("O(A)"+ this.nome + "é tão velho quanto o(a) "+ p.nome);
    }
    else
    {
        System.out.println("O(A)"+ this.nome + "é mais velho que o(a) "+ p.nome);
    }

}

}
