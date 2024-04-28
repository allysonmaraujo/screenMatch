
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.anoDeLancamento = 1970;
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9.7);
        meuFilme.avalia(6.9);
        meuFilme.avalia(7.9);


        System.out.println("A Media de notas do filme '" + meuFilme.nome + "' é " + meuFilme.pegaMedia());
        System.out.println("A soma das avaliações é: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("O numero total de avaliações é : " + meuFilme.getTotalDeAvaliacoes());


    }
}