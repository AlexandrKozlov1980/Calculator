package Alex;

public class Calculate {

    String input;
    double numA;
    double numB;
    char opeR;
    double answerOut;

    double calculate(String input)
    {
        if (input.length() == 3)  //a+b
        {
            numA = Character.getNumericValue(input.charAt(0));
            opeR = input.charAt(1);
            numB = Character.getNumericValue(input.charAt(2));

            if ((numA != 0) && (numB != 0) && ((opeR == '+') || (opeR == '-') || (opeR == '*') || (opeR == '/')))
            {
                switch (opeR)
                {
                    case '+':
                        answerOut = numA + numB;
                        break;
                    case '-':
                        answerOut = numA - numB;
                        break;
                    case '*':
                        answerOut = numA * numB;
                        break;
                    case '/':
                        answerOut = numA / numB;
                        break;
                }

            }
            else
            {
                System.out.println("ERROR a+b");
                return 0;
            }
        }
        else if ((input.length() == 4) && (input.charAt(2) == '1') && (input.charAt(3) == '0')) //a+10
        {
            numA = Character.getNumericValue(input.charAt(0));
            opeR = input.charAt(1);

            if ((numA != 0) && ((opeR == '+') || (opeR == '-') || (opeR == '*') || (opeR == '/')))
            {
                switch (opeR)
                {
                    case '+':
                        answerOut = numA + 10;
                        break;
                    case '-':
                        answerOut = numA - 10;
                        break;
                    case '*':
                        answerOut = numA * 10;
                        break;
                    case '/':
                        answerOut = numA / 10;
                        break;
                }
            }
            else
            {
                System.out.println("ERROR a+10");
                return 0;
            }



        }
        else if ((input.length() == 4) && (input.charAt(0) == '1') && (input.charAt(1) == '0')) //10+b
        {
            numB = Character.getNumericValue(input.charAt(3));
            opeR = input.charAt(2);

            if ((numB != 0) && ((opeR == '+') || (opeR == '-') || (opeR == '*') || (opeR == '/')))
            {
                switch (opeR)
                {
                    case '+':
                        answerOut = 10 + numB;
                        break;
                    case '-':
                        answerOut = 10 - numB;
                        break;
                    case '*':
                        answerOut = 10 * numB;
                        break;
                    case '/':
                        answerOut = 10 / numB;
                        break;
                }
            }
            else
            {
                System.out.println("ERROR 10/b"); // error a+10
                return 0;
            }


        }
        else if ((input.length() == 5) && (input.charAt(0) == '1') && (input.charAt(1) == '0')  //10+10
                && (input.charAt(3) == '1') && (input.charAt(4) == '0'))
        {

            opeR = input.charAt(2);
            switch (opeR)
            {
                case '+':
                    answerOut = 20;
                    break;
                case '-':
                    answerOut = 0;
                    break;
                case '*':
                    answerOut = 100;
                    break;
                case '/':
                    answerOut = 1;
                    break;
            }

        }
        else
        {
            System.out.println("ERROR"); //"DATA ERROR
            return 0;
        }
    return answerOut;}
}
