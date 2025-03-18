
public class Principal {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        piloto1.nome = "Ayrthon Senna";
        piloto1.peso = 90;
        piloto1.equipe = "Ferrari";
        piloto1.vitorias = 2;

        Piloto piloto2 = new Piloto();
        piloto2.nome = "Louis Hamilton";
        piloto2.peso = 72.1;
        piloto2.equipe = "Fusca";
        piloto2.vitorias = 12;


        System.out.println(String.format("%s da equipe %s", piloto1.nome, piloto1.equipe));

    }
}
