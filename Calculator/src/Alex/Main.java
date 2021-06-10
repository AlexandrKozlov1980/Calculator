package Alex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            //}
            String inputString;
            String resultInArab; // результат перевода римских в арабские
            char numA;
            char numB;
            char opeR;
            int a;
            int b;
            int answerOut; // ответ
            int output;
            String outputRome;

            int isRoman; //числа аравские


            Scanner in = new Scanner(System.in);
            inputString = in.nextLine(); // получаем входящую строку из консоли


            if ((inputString.charAt(0) == 'I') || (inputString.charAt(0) == 'V') || (inputString.charAt(0) == 'X')) {
                isRoman = 1;
                WhileRome cut = new WhileRome();
                cut.rome = inputString;
                resultInArab = cut.cheCk(inputString);

                inputString = resultInArab;

            } else {
                isRoman = 0;
            }


            if (inputString.length() == 3)  //a+b
            {
                numA = inputString.charAt(0);
                opeR = inputString.charAt(1);
                numB = inputString.charAt(2);

                CheckNum firstNum = new CheckNum();
                firstNum.name = numA;
                a = firstNum.checkAnum();

                CheckNum secondNum = new CheckNum();
                secondNum.name = numB;
                b = secondNum.checkAnum();

                Calculate Calc = new Calculate();


                if ((a != 0) && (b != 0) && ((opeR == '+') || (opeR == '-') || (opeR == '*') || (opeR == '/'))) {
                    answerOut = Calc.findResult(a, b, opeR);
                } else {
                    System.out.println("ERROR");
                    return;
                }
            } else if ((inputString.length() == 4) && (inputString.charAt(2) == '1') && (inputString.charAt(3) == '0')) //a+10
            {
                numA = inputString.charAt(0);
                opeR = inputString.charAt(1);

                CheckNum firstNum = new CheckNum();
                firstNum.name = numA;
                a = firstNum.checkAnum();

                Calculate Calc = new Calculate();

                if ((a != 0) && ((opeR == '+') || (opeR == '-') || (opeR == '*') || (opeR == '/'))) {
                    answerOut = Calc.findResult(a, 10, opeR);
                } else {
                    System.out.println("ERROR"); // error a+10
                    return;
                }


            } else if ((inputString.length() == 4) && (inputString.charAt(0) == '1') && (inputString.charAt(1) == '0')) //10+b
            {
                numB = inputString.charAt(3);
                opeR = inputString.charAt(2);

                CheckNum firstNum = new CheckNum();
                firstNum.name = numB;
                b = firstNum.checkAnum();

                Calculate Calc = new Calculate();

                if ((b != 0) && ((opeR == '+') || (opeR == '-') || (opeR == '*') || (opeR == '/'))) {
                    answerOut = Calc.findResult(10, b, opeR);
                } else {
                    System.out.println("ERROR"); // error a+10
                    return;
                }


            } else if ((inputString.length() == 5) && (inputString.charAt(0) == '1') && (inputString.charAt(1) == '0')  //10+10
                    && (inputString.charAt(3) == '1') && (inputString.charAt(4) == '0')) {
                opeR = inputString.charAt(2);

                Calculate Calc = new Calculate();
                answerOut = Calc.findResult(10, 10, opeR);

            } else {
                System.out.println("ERROR"); //"DATA ERROR
                return;
            }


            switch (isRoman) {
                case 1:

                    RoM convertAnswer = new RoM();
                    convertAnswer.inputAnswer = answerOut;
                    outputRome = convertAnswer.convert(answerOut);
                    System.out.println(outputRome);
                    break;
                case 0:
                    System.out.println(answerOut);
                    break;


            }
        }
        catch (Exception ex){
            System.out.println("ERROR");
        }

    }
}
