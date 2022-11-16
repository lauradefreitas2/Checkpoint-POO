import java.util.ArrayList;

public class Farmacia {

        private String nome;
        private String cnpj;
        private String endereco;

        private ArrayList<Cliente> cliente = new ArrayList<>();

        private Estoque estoque = new Estoque();


    public Farmacia(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarMedicamento(Medicamento medicamento){

        estoque.insereMedicamento(medicamento);
    }

    public void cadastrarCliente(Cliente cliente){

        this.cliente.add(cliente);
    }



}
