
public class EjercicioC {
    public static void creandoMultiplos(String numero, int base) {
        base++;
        numero = numero.replace(" ", "");
        double digitos = numero.length();
        double numeroInt = Integer.parseInt(numero);
        if (numeroInt % base == 0) {
            System.out.println("0,0");
            return;
        } else {
            for (int i = 0; i < digitos; i++) {
                double numeroIntAux = numeroInt;
                double digitosAux = digitos - i;
                Character digito = numero.charAt(i);
                int digitoInt = Character.getNumericValue(digito);

                for (int j = 0; j < digitoInt; j++) {
                    numeroIntAux = numeroIntAux - (Math.pow(10, digitosAux - 1));
                    if (numeroIntAux % base == 0) {
                        numero = String.valueOf(numeroIntAux);
                        digito = numero.charAt(i);
                        digitoInt = Character.getNumericValue(digito);
                        if (digitos == numero.length()) {
                            digito = '0';
                        }
                        System.out.println((i + 1) + "," + digito);
                        return;
                    }
                }
            }
        }
        System.out.println("-1 -1");
    }

    public static void main(String[] args) {
        String n = "1 0 1 1 1";
        int numeroBase = 2;
        creandoMultiplos(n, numeroBase);
    }
}