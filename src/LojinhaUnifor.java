import java.util.Scanner;

public class LojinhaUnifor {
    public static void LojinhaUnifor(String[] args) {

        int codigo, quantidade;

        Produto produto;
        Venda venda;

        Scanner input = new Scanner((System.in));
        codigo = input.nextInt();

        // TODO Modifique a lógica para garantir que o código seja válido;
        boolean repete = false;
        do{
            venda = new Venda();
            produto = Produto.buscar(codigo);
        }
    }
}