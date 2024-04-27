
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.anoDeLancamento = 1970;
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.avaliacao = 9.6;

        meuFilme.exibeFichaTecnica();
    }
}