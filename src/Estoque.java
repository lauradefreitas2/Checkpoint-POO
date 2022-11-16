import java.util.ArrayList;

public class Estoque {

    private ArrayList<Medicamento> listaMedicamento = new ArrayList<>();

    public Estoque() {}

    public void insereMedicamento(Medicamento medicamento){

        listaMedicamento.add(medicamento);
    }

    public void removerMedicamento(Medicamento medicamento){

        listaMedicamento.remove(listaMedicamento.indexOf(medicamento));
    }

    public Boolean temMedicamento(String nome){

        for(int i = 0; i < listaMedicamento.size(); i++ ){

            if(listaMedicamento.get(i).getNome() == nome) return true;
        }
        return false;
    }

    public int quantidadeTarjaVermelha(){

            return contalemento("vermelha");
    }

    public int quantidadeTarjaPreta(){

        return contalemento("preta");
    }

    public int contalemento(String nome){

        int quantidade = 0;

        for(int i = 0; i < listaMedicamento.size(); i++ ){

            if(listaMedicamento.get(i).getTipo() == nome) quantidade++;
        }

        return quantidade;

    }
}
