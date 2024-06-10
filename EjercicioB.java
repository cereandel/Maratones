import java.util.LinkedList;

public class EjercicioB {
    static int puntajeMinimo(int n, int m, String palabraBase, LinkedList<String> palabrasPrueba) {
        int puntaje = 0;
        for (String string : palabrasPrueba) {
            for (int i = 0; i < string.length() - m + 1; i++) {
                String subCadena = string.substring(i, i + (m));
                if (palabraBase.contains(subCadena)) {
                    System.out.println(subCadena);
                    puntaje++;
                }
            }
        }
        return puntaje;
    }

    public static void main(String[] args) {
        LinkedList<String> palabrasPrueba = new LinkedList<String>();
        /*
         * palabrasPrueba.add("acm");
         * palabrasPrueba.add("icpc");
         * palabrasPrueba.add("maratona");
         */

        /*
         * palabrasPrueba.add("oncom");
         * palabrasPrueba.add("petition");
         * palabrasPrueba.add("ztxvu");
         * palabrasPrueba.add("fmwper");
         */

        palabrasPrueba.add("zyvu");
        palabrasPrueba.add("okp");
        palabrasPrueba.add("wsgh");
        palabrasPrueba.add("kqpdb");

        // int puntaje = puntajeMinimo(07, 3, , palabrasPrueba)
        // int puntaje = puntajeMinimo(11, 4, "competition ", palabrasPrueba);
        int puntaje = puntajeMinimo(12, 4, "latinoamerica ", palabrasPrueba);
        System.out.println(puntaje);
    }
}