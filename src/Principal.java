import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9.7);
        meuFilme.avalia(6.9);
        meuFilme.avalia(7.9);


        System.out.println("A Media de notas do filme '" + meuFilme.getNome() + "' é " + meuFilme.pegaMedia());
        System.out.println("A soma das avaliações é: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("O numero total de avaliações é : " + meuFilme.getTotalDeAvaliacoes());


    }
}