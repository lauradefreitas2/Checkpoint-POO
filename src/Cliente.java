import java.time.LocalDate;

public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;

    private Carrinho carrinho = new Carrinho();
    private String dataNascimento;

    public Cliente(String nome, String cpf, String endereco, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

   public Carrinho acessarCarrinho(){

        return carrinho;
   }


    public void imprimirDadosCadastrais(){
        System.out.printf("Nome: %s, Cpf: %s, Endereço: %s, Data: %s", this.nome, this.cpf, this.endereco, this.dataNascimento);
    }

    @Override
    public String toString() {
        return this.nome + "-" + this.dataNascimento ;
    }
}
