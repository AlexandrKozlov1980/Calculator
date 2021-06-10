package Alex;

public class Calculate { // вычисление значения выражения

    int answerOut;

    int findResult(int a, int b, char opeR) {
        if (opeR == '+') {
            //System.out.println(a + b);
            answerOut = a + b;
            return answerOut;
        } else if (opeR == '-') {
            //System.out.println(a - b);
            answerOut = a - b;
            return answerOut;
        } else if (opeR == '*') {
            //System.out.println(a * b);
            answerOut = a * b;
            return answerOut;
        } else if (opeR == '/') {
            //System.out.println(a / b);
            answerOut = a / b;
            return answerOut;
        } else {
            System.out.println("false");
            return 0;
        }
    }
}
