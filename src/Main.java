

public class Main {
    public static void main(String[] args) {

        //        Instancia farmácia

        Farmacia peguePaguePopular =
                new Farmacia("peguePaguePopular", "873483748", "Rua dos enfermos" );


        //        Criar instancia medicamentos

        Medicamento prednisolona = new Medicamento("Prednisolona", 9.95, "vermelha");
        Medicamento nasonex = new Medicamento("Nasonex", 43.58, "vermelha");

        Medicamento diazepam = new Medicamento("Diazepam", 15.35, "preta");
        Medicamento rivotril = new Medicamento("Rivotril", 25.58, "preta");

        //        Farmacia já tem uma instancia de estoque

        peguePaguePopular.cadastrarMedicamento(prednisolona);
        peguePaguePopular.cadastrarMedicamento(diazepam);
        peguePaguePopular.cadastrarMedicamento(nasonex);
        peguePaguePopular.cadastrarMedicamento(rivotril);


        //        Instancia clientes

        Cliente laura =
                new Cliente("Laura", "34545345", "Rua auto-brasileiro", "07/01/2002");

        Cliente ricardo =
                new Cliente("Ricardo", "34534346", "Rua ado além", "01/01/1900");

        //    A farmácia faz o cadastro dos clientes

        peguePaguePopular.cadastrarCliente(laura);
        peguePaguePopular.cadastrarCliente(ricardo);

        // funcoes cliente na compra online é poder acessar ao carrinho e inserir medicamentos

        laura.acessarCarrinho().incluirMedicamento(prednisolona);

        ricardo.acessarCarrinho().incluirMedicamento(rivotril);
        ricardo.acessarCarrinho().incluirMedicamento(diazepam);
        ricardo.acessarCarrinho().incluirMedicamento(prednisolona);

        System.out.println("lista medicamentos carrinho laura \n");

        laura.acessarCarrinho().listaMedicamentos();

        System.out.println("lista medicamentos carrinho ricardo \n");

        ricardo.acessarCarrinho().listaMedicamentos();
        double totalPreco = ricardo.acessarCarrinho().getTotalPreco();

        System.out.printf("%.2f", totalPreco);

        System.out.println("lista medicamentos carrinho ricardo \n");

        ricardo.acessarCarrinho().removerMedicamento(diazepam);

        ricardo.acessarCarrinho().listaMedicamentos();
















    }
}