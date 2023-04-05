public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(null, false);
        Coordenador coordenador = new Coordenador(gerente, false);
        Analista analista = new Analista(coordenador, true);

        analista.handle();

        System.out.println();
        gerente = new Gerente(null, false);
        coordenador = new Coordenador(gerente, true);
        analista = new Analista(coordenador, false);

        analista.handle();

        System.out.println();
        gerente = new Gerente(null, true);
        coordenador = new Coordenador(gerente, false);
        analista = new Analista(coordenador, false);

        analista.handle();

        System.out.println();
        gerente = new Gerente(null, false);
        coordenador = new Coordenador(gerente, false);
        analista = new Analista(coordenador, false);

        analista.handle();
    }
}