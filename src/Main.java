import java.util.*;

/**
 * @author PampSPP
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma lista de nomes separados por vírgulas (ex.: Pamela, Bira): ");
        String nomes = input.nextLine();
        String[] nomesArray = nomes.split(", ");

        List<String> nomesList = new ArrayList<>();
        Collections.addAll(nomesList, nomesArray);

        Collections.sort(nomesList);

        System.out.println("Lista de nomes em ordem alfabética: ");
        System.out.println(nomesList);

        System.out.println("Digite uma lista de pessoas no formato 'nome - sexo' separadas por vírgulas (ex.: Pamela - F, Bira - M): ");
        String pessoas = input.nextLine();
        String[] pessoasArray = pessoas.split(", ");

        List<Pessoas> pessoasList = new ArrayList<Pessoas>();
        List<Pessoas> masculinoList = new ArrayList<Pessoas>();
        List<Pessoas> femininoList = new ArrayList<Pessoas>();

        for (String pessoa : pessoasArray) {
            String[] partes = pessoa.split(" - ");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();
                Pessoas p = new Pessoas(nome, sexo);
                pessoasList.add(p);

                if (sexo.equalsIgnoreCase("M")) {
                    masculinoList.add(p);
                } else if (sexo.equalsIgnoreCase("F")) {
                    femininoList.add(p);
                }
            }
        }

        System.out.println("Lista de pessoas: ");
        System.out.println(pessoasList);

        System.out.println("Lista de pessoas do sexo masculino: ");
        System.out.println(masculinoList);

        System.out.println("Lista de pessoas do sexo feminino: ");
        System.out.println(femininoList);

    }
}