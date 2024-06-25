public class A {

    static Boolean isPalindrome(String numero) {
        String numeroInvertido = new StringBuilder(numero).reverse().toString();
        if (numero.equals(numeroInvertido)) {
            return true;
        } else {
            return false;
        }
    }

    static int palindrome(String input) {
        int rangoSuperiorInt, rangoInferiorInt;
        rangoSuperiorInt = rangoInferiorInt = 0;

        String[] parts = input.split(" ");
        String rangoInferior = parts[0];
        String rangoSuperior = parts[1];
        rangoInferiorInt = Integer.parseInt(rangoInferior);
        rangoSuperiorInt = Integer.parseInt(rangoSuperior);

        int contador = 0;
        for (int i = rangoInferiorInt; i < rangoSuperiorInt + 1; i++) {
            if (i < 0) {
                i = i * -1;
                if (isPalindrome(String.valueOf(i))) {
                    contador++;
                }
                i = i * -1;
            } else {
                if (isPalindrome(String.valueOf(i))) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String input = "";
        while (input != "-1 -1") {
            input = System.console().readLine();
            if (input.equals("-1 -1")) {
                break;
            }
            int result = palindrome(input);
            System.out.println(result);
        }
    }
}