package dio.exercio.oo.funcionarios;

public class rodarAplicacao {
    public static void main(String[] args){

        Funcionario funcionario = new Funcionario();

        //Upcasts:
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

       //Downscast:
        //dio.exercio.funcionarios.Vendedor vendedor = (dio.exercio.funcionarios.Vendedor) new (dio.exercio.funcionarios.Funcionario); - deve ser evitado porque dá erro

    }
}
