import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();

    private Double totalPreco;

    private String formaPagamento;

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Carrinho() {}

    public void incluirMedicamento(Medicamento medicamento){

            listaMedicamentos.add(medicamento);
    }

    public void removerMedicamento(Medicamento medicamento){

        listaMedicamentos.remove(listaMedicamentos.indexOf(medicamento));
    }


    public Double getTotalPreco() {

        double total = 0;

        for (int i = 0; i < listaMedicamentos.size(); i++) {

             total += listaMedicamentos.get(i).getValor();

        }
        
        return total;
    }

    public void listaMedicamentos(){

        System.out.println(listaMedicamentos);

    }
}
